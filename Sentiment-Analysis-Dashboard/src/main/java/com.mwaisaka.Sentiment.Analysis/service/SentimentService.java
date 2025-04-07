package com.mwaisaka.Sentiment.Analysis.service;

import com.mwaisaka.Sentiment.Analysis.dto.SentimentRequest;
import com.mwaisaka.Sentiment.Analysis.dto.SentimentResponse;

public interface SentimentService {
    SentimentResponse analyzeSentiment(SentimentRequest request);
}
