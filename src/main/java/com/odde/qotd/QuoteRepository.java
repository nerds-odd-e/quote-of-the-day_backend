package com.odde.qotd;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuoteRepository extends MongoRepository<Quote, String>, QuoteRandom {
}
