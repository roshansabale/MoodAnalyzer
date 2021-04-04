public class MoodAnalyzer {
    public String analyzeMood(String message) {
        if(message.contains("happy"))
        {
            return "happy";
        }
        else if (message.contains("good"))
        {
            return "good";
        }
        else
        {
            return "sad";
        }
    }
}
