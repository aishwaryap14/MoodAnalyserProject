package com.test1;


import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
@Test
  public void MoodAnalyzerTest(){
    MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
  Mood mood = null;
  try {
    mood = moodAnalyzer.analyzeHappyMood("This is happy mood");
    Assert.assertEquals(Mood.HAPPY,mood);
  } catch (MoodAnalyserException e)
  {
    e.printStackTrace();
  }

}

  @Test
  public void sadMoodAnalyzer()  {
    MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
    Mood mood = null;
    try {
      mood = moodAnalyzer.analyzeHappyMood("This is sad mood");
      Assert.assertEquals(Mood.SAD,mood);
    } catch (MoodAnalyserException e)
    {
      e.printStackTrace();
    }


  }

  @Test
  public void givenInvalidMood_shouldReturnException() 
  {
  try
  {
    MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
    Mood mood = moodAnalyzer.analyzeHappyMood("null");
  }
  catch (MoodAnalyserException e)
  {
    Assert.assertEquals(MoodAnalyserException.ExceptionType.INVALID_MOOD, e.type);
  }
  }

  @Test
  public void givenNullMood_shouldReturnHappy()
  {
    try
    {
      MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
      Mood mood = moodAnalyzer.analyzeHappyMood("null");
      Assert.assertEquals(Mood.HAPPY,mood);
    }
    catch (MoodAnalyserException e) { }
  }
}
