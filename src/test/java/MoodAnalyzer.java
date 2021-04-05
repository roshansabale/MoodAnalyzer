public class MoodAnalyzer {
    private String message;
    public MoodAnalyzer(String message) {
        this.message = message;
    }
    public String analyzeMood() throws InvalidMoodException ,NullPointerException{
        String mood = null;
        try {
            if (message.isEmpty()) {
                throw new InvalidMoodException(InvalidMoodException.ExceptionType.EmptyMood, "Empty mood not allowed");
            }
            if (message.contains("happy")) {
                mood = "happy";
            } else if (message.contains("sad")) {
                mood = "sad";
            }
        }catch (NullPointerException exception) {
            throw new InvalidMoodException(InvalidMoodException.ExceptionType.NullMood,"Null mood not allowed");
        }
        return mood;
    }
}
