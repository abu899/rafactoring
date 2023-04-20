package com.refactoring.study.section2.after;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class StudyDashboard {
    private void printParticipants(int eventId) throws IOException {
        GHIssue issue = getGithubIssue(eventId);
        Set<String> participants = getUsernames(issue);
        print(participants);
    }

    private void printReviewers() throws IOException {
        GHIssue issue = getGithubIssue(30);
        Set<String> reviewers = getUsernames(issue);
        print(reviewers);
    }

    private GHIssue getGithubIssue(int eventId) throws IOException {
        // Get github issue to check homework
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        GHIssue issue = repository.getIssue(eventId);
        return issue;
    }

    private Set<String> getUsernames(GHIssue issue) throws IOException {
        // Get usernames
        Set<String> usernames = new HashSet<>();
        issue.getComments().forEach(c -> usernames.add(c.getUserName()));
        return usernames;
    }

    private static void print(Set<String> participants) {
        // Print participants
        participants.forEach(System.out::println);
    }

    public static void main(String[] args) throws IOException {
        StudyDashboard studyDashboard = new StudyDashboard();
        studyDashboard.printReviewers();
        studyDashboard.printParticipants(15);

    }
}
