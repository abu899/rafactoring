package com.refactoring.study.section2.after;

import com.refactoring.study.section2.before.ParticipantDashboard;
import com.refactoring.study.section2.before.ReviewerDashboard;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Dashboard {
    public static void main(String[] args) throws IOException {
        com.refactoring.study.section2.before.ReviewerDashboard reviewerDashboard = new ReviewerDashboard();
        reviewerDashboard.printReviewers();

        com.refactoring.study.section2.before.ParticipantDashboard participantDashboard = new ParticipantDashboard();
        participantDashboard.printParticipants(15);
    }

    public void printUsernames(int eventId) throws IOException {
        // Get github issue to check homework
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        GHIssue issue = repository.getIssue(eventId);

        // Get participants
        Set<String> participants = new HashSet<>();
        issue.getComments().forEach(c -> participants.add(c.getUserName()));

        // Print participants
        participants.forEach(System.out::println);
    }
}
