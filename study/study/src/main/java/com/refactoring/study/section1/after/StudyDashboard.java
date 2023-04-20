package com.refactoring.study.section1.after;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueComment;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudyDashboard {
    private Set<StudyReview> studyReviews = new HashSet<>();

    /**
     * 리뷰 이슈에 작성된 리뷰어 목록과 리뷰를 읽어온다
     */
    private void loadReviews() throws IOException {
        // 읽어올 이슈는 이미 정해져있기에 읽어올 때 가져옴.
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        GHIssue issue = repository.getIssue(30);

        // 리뷰를 읽어오는 함수 내에 리뷰가 없을 수 없다
        List<GHIssueComment> reviews = issue.getComments();
        for (GHIssueComment review : reviews) {
            studyReviews.add(new StudyReview(review.getUserName(), review.getBody()));
        }
    }

    public Set<StudyReview> getStudyReviews() {
        return studyReviews;
    }

    public static void main(String[] args) throws IOException {
        StudyDashboard studyDashboard = new StudyDashboard();
        studyDashboard.loadReviews();
        studyDashboard.getStudyReviews().forEach(System.out::println);
    }
}
