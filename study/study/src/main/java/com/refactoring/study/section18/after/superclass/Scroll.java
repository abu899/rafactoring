package com.refactoring.study.section18.after.superclass;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Scroll {

    private LocalDate dateLastCleaned;

    private CategoryItem categoryItem;

    public Scroll(Integer id, String title, List<String> tags, LocalDate dateLastCleaned) {
        this.dateLastCleaned = dateLastCleaned;
        this.categoryItem = new CategoryItem(id, title, tags);
    }

    public long daysSinceLastCleaning(LocalDate targetDate) {
        return this.dateLastCleaned.until(targetDate, ChronoUnit.DAYS);
    }

    public Integer getId() {
        return categoryItem.getId();
    }

    public String getTitle() {
        return categoryItem.getTitle();
    }

    public boolean hasTag(String tag) {
        return this.categoryItem.hasTag(tag);
    }
}
