package com.test1;

public class MoodAnalyzer {
    public Mood analyzeHappyMood(String msg) throws MoodAnalyserException {
    if (msg.contains("happy"))
        return Mood.HAPPY;
    else
        return Mood.SAD;
    }
}
