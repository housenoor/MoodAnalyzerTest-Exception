package com.bl.moodanalyzerexception;

public class MoodAnalyzerMain {
	private String message;

	// Constructor
	public MoodAnalyzerMain() {
	}

	// paraMetarised constructor
	public MoodAnalyzerMain(String message) {
		this.message = message;
	}

	public String analyseMood() throws MoodAnalysisException {
		try {

			if (this.message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (Exception e) {
			if (message == null)
				throw new MoodAnalysisException("Invalid Mood", MoodAnalysisException.Exception_Type.NULL);
			else
				throw new MoodAnalysisException("Invalid Mood", MoodAnalysisException.Exception_Type.EMPTY);
		}
	}
}