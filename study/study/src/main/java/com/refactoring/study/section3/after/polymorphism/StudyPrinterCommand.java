package com.refactoring.study.section3.after.polymorphism;

import com.refactoring.study.section3.before.Participant;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.List;

public abstract class StudyPrinterCommand {
    protected int totalNumberOfEvents;

    protected List<Participant> participants;

    public StudyPrinterCommand(int totalNumberOfEvents, List<Participant> participants) {
        this.totalNumberOfEvents = totalNumberOfEvents;
        this.participants = participants;
        this.participants.sort(Comparator.comparing(Participant::username));
    }

    /**
     * 출력하는 형식에 따라 모드가 달라지고 부가적인 메서드들이 생김
     */
    public abstract void execute() throws IOException;

    /**
     * |:white_check_mark:|:white_check_mark:|:white_check_mark:|:x:|
     */
    protected String checkMark(Participant p) {
        StringBuilder line = new StringBuilder();
        for (int i = 1 ; i <= this.totalNumberOfEvents ; i++) {
            if(p.homework().containsKey(i) && p.homework().get(i)) {
                line.append("|:white_check_mark:");
            } else {
                line.append("|:x:");
            }
        }
        return line.toString();
    }
}