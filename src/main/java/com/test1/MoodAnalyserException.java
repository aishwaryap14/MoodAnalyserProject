package com.test1;

public class MoodAnalyserException extends Exception{
    enum ExceptionType
    {
        INVALID_MOOD;
    }

    ExceptionType type;

    public MoodAnalyserException(String message, ExceptionType type)
    {
        super(message);
        this.type = type;
    }
}
