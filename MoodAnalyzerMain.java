package com.bl.moodanalyzerexception;

public class MoodAnalyzerMain {
	// Constructor
	public MoodAnalyzerMain() {
	}

	public String analyseMood(String message) {
		if (message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
	}
}