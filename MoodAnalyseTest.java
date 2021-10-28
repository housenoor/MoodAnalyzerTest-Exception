package com.bl.moodanalyzerexception;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MoodAnalyseTest {
	@Test
	public void given_SadMood_Should_Return_Sad() {
		MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain();
		String mood = moodAnalyzer.analyseMood("I am In a Sad Mood");
		Assertions.assertEquals("SAD", mood);

	}

}