package com.refactoring.study.section2.after;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ReviewerDashboard extends Dashboard {
    public void printReviewers() throws IOException {
        super.printUsernames(30);
    }
}
