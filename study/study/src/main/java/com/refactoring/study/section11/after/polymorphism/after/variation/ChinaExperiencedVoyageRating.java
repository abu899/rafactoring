package com.refactoring.study.section11.after.polymorphism.after.variation;

import java.util.List;

public class ChinaExperiencedVoyageRating extends VoyageRating {
    public ChinaExperiencedVoyageRating(Voyage voyage, List<VoyageHistory> history) {
        super(voyage, history);
    }

    @Override
    protected int captainHistoryRisk() {
        int rating = super.captainHistoryRisk() - 2;
        return Math.max(rating, 0);
    }

    @Override
    protected int voyageProfitFactor() {
        return super.voyageProfitFactor() + 3;
    }

    @Override
    protected int voyageLengthFactor() {
        int result = 0;
        if (this.voyage.length() > 12) result += 1;
        if (this.voyage.length() > 18) result -= 1;

        return result;
    }

    @Override
    protected int historyLengthFactor() {
        return (this.history.size() > 10) ? 1 : 0;
    }
}
