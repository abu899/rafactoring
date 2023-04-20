package com.refactoring.study.section3.after.parameterobject;

import com.refactoring.study.section3.before.Participant;

public record ParticipantPrinter(int totalNumberOfEvents, Participant p) {
}