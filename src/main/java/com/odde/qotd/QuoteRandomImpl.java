package com.odde.qotd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.SampleOperation;

public class QuoteRandomImpl implements QuoteRandom {
    private final MongoTemplate mongoTemplate;

    @Autowired
    public QuoteRandomImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Quote getRandom() {
        SampleOperation sampleStage = Aggregation.sample(1);
        Aggregation aggregation = Aggregation.newAggregation(sampleStage);
        AggregationResults<Quote> output = mongoTemplate.aggregate(aggregation, "quotes", Quote.class);
        return output.getUniqueMappedResult();
    }
}
