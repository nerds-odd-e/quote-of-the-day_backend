package com.odde.qotd;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "quotes")
public class Quote {
    @Id
    public String id;
    public String Quote;
    public String Author;
    public String Contributor;
    public String Location;
    public String Date;
    public String Language;
    public String ContributionDate;

}
