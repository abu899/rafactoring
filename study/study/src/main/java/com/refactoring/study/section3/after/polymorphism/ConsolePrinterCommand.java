package com.refactoring.study.section3.after.polymorphism;

import com.refactoring.study.section3.before.Participant;

import java.io.IOException;
import java.util.List;

public class ConsolePrinterCommand extends StudyPrinterCommand {

    public ConsolePrinterCommand(int totalNumberOfEvents, List<Participant> participants) {
        super(totalNumberOfEvents, participants);
    }

    @Override
    public void execute() throws IOException {
        this.participants.forEach(p -> {
            System.out.printf("%s %s:%s\n", p.username(), checkMark(p), p.getRate(this.totalNumberOfEvents));
        });
    }
}
