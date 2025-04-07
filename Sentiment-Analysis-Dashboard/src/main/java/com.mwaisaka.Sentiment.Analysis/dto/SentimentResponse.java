package com.mwaisaka.Sentiment.Analysis.dto;

public class SentimentResponse {

    private String sentiment;
    private double confidence;

    public SentimentResponse() {
    }

    public SentimentResponse(String sentiment, double confidence) {
        this.sentiment = sentiment;
        this.confidence = confidence;
    }

    public String getSentiment() {
        return sentiment;
    }

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    public double getConfidence() {
        return confidence;
    }

    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }
}
