package com.bl.moodanalyzerexception;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MoodAnalyseTest {
	// testCase to predict the mood Sad
	@Test
	public void givenMessage_SadMood_Should_Return_Sad() {
		MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain("I am In a Sad Mood");
		String mood = moodAnalyzer.analyseMood();
		// Asserting The Result As Boolean Type True Or False
		Assertions.assertEquals("SAD", mood);

	}

	// Constructor in message should return Happy
	@Test
	public void givenMessage_AnyMood_Should_Return_HAPPY() {
		MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain("I am in Happy Mood");
		String mood = moodAnalyser.analyseMood();
		Assertions.assertEquals("HAPPY", mood);
	}
}