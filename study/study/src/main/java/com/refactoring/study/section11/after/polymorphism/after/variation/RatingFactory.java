package com.refactoring.study.section11.after.polymorphism.after.variation;

import java.util.List;

public class RatingFactory {

    public static VoyageRating createRating(Voyage voyage, List<VoyageHistory> history) {
        if (voyage.zone().equals("china") && hasChinaHistory(history)) {
            return new ChinaExperiencedVoyageRating(voyage, history);
        }
        return new VoyageRating(voyage, history);
    }

    private static boolean hasChinaHistory(List<VoyageHistory> history) {
        return history.stream().anyMatch(v -> v.zone().equals("china"));
    }

}
