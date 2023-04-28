package com.refactoring.study.section13.after;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Author {

    private String company;

    private String twitterHandle;

    public Author(String company, String twitterHandle) {
        this.company = company;
        this.twitterHandle = twitterHandle;
    }

    static public List<String> TwitterHandles(List<Author> authors, String company) {
        return authors.stream()
                .filter(author -> author.company.equals(company))
                .map(author -> author.twitterHandle)
                .filter(t -> t != null)
                .collect(Collectors.toList());
    }

}
