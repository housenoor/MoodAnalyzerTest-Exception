package com.bl.moodanalyzerexception;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class MoodAnalyseTest {
    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain();
        String mood = moodAnalyzer.analyseMood("I am In Any Mood");
        Assertions.assertEquals("HAPPY", mood);

    }

}