public class MoodAnalyzer {
    private String message;
    public MoodAnalyzer(String message) {
        this.message = message;
    }
    public String analyzeMood() throws InvalidMoodException {
        String mood = null;
        try {
            if (message.contains("happy")) {
                mood = "happy";
            } else if (message.contains("sad")) {
                mood = "sad";
            } else if(message==null) {
                throw new InvalidMoodException(InvalidMoodException.ExceptionType.NullMood, "Null not allowed");
            }
        }catch (NullPointerException e) {
            throw new InvalidMoodException(InvalidMoodException.ExceptionType.NullMood,"Null not allowed");
        }
        return mood;
    }
}
