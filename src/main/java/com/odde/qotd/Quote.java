package com.odde.qotd;

public class Quote {
    private String content;
    private String originalAuthor;
    private String submitter;

    public Quote() {
        this.content = "Anything";
        this.originalAuthor = "Anyone";
        this.submitter = "Nobody";
    }

    public String getContent() {
        return content;
    }

    public String getOriginalAuthor() {
        return originalAuthor;
    }

    public String getSubmitter() {
        return submitter;
    }
}
