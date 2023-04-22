package com.refactoring.study.section3.after.decompcondition;

import com.refactoring.study.section3.after.command.StudyPrinterCommand;
import com.refactoring.study.section3.before.Participant;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueComment;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StudyDashboard {
    private final int totalNumberOfEvents;

    public StudyDashboard(int totalNumberOfEvents) {
        this.totalNumberOfEvents = totalNumberOfEvents;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        StudyDashboard studyDashboard = new StudyDashboard(15);
        studyDashboard.print();
    }
    private Participant findParticipant(String username, List<Participant> participants) {
//        Participant participant = null;
//        if (participants.stream().noneMatch(p -> p.username().equals(username))) {
//            participant = new Participant(username);
//            participants.add(participant);
//        } else {
//            participant = participants.stream().filter(p -> p.username().equals(username)).findFirst().orElseThrow();
//        }
//        return participant;
        /**
         * 조건문을 분리하고 조건문 자체에 의도를 드러내고 삼항 연산자를 통해 코드를 더 간추릴 수 있음
         */
        return isNewParticipant(username, participants)
                ? createNewParticipant(username, participants)
                : findExistingParticipant(username, participants);
    }

    private boolean isNewParticipant(String username, List<Participant> participants) {
        return participants.stream().noneMatch(p -> p.username().equals(username));
    }

    private Participant createNewParticipant(String username, List<Participant> participants) {
        Participant participant;
        participant = new Participant(username);
        participants.add(participant);
        return participant;
    }

    private Participant findExistingParticipant(String username, List<Participant> participants) {
        Participant participant;
        participant = participants.stream().filter(p -> p.username().equals(username)).findFirst().orElseThrow();
        return participant;
    }

    private void print() throws IOException, InterruptedException {
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        List<Participant> participants = new CopyOnWriteArrayList<>();

        ExecutorService service = Executors.newFixedThreadPool(8);
        CountDownLatch latch = new CountDownLatch(totalNumberOfEvents);

        for (int index = 1 ; index <= totalNumberOfEvents ; index++) {
            int eventId = index;
            service.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        GHIssue issue = repository.getIssue(eventId);
                        List<GHIssueComment> comments = issue.getComments();

                        for (GHIssueComment comment : comments) {
                            Participant participant = findParticipant(comment.getUserName(), participants);
                            participant.setHomeworkDone(eventId);
                        }

                        latch.countDown();
                    } catch (IOException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
            });
        }

        latch.await();
        service.shutdown();

        new StudyPrinterCommand(this.totalNumberOfEvents, participants).execute();
    }
}
