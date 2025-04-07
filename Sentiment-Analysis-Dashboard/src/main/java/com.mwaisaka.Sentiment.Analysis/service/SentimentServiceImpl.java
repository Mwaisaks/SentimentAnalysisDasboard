package com.mwaisaka.Sentiment.Analysis.service;

import com.mwaisaka.Sentiment.Analysis.dto.SentimentRequest;
import com.mwaisaka.Sentiment.Analysis.dto.SentimentResponse;


public class SentimentServiceImpl implements SentimentService{

    @Override
    public SentimentResponse analyzeSentiment(SentimentRequest request) {

        //Call ML Model here.

        return new SentimentResponse("POSITIVE", 0.92);
    }
}
