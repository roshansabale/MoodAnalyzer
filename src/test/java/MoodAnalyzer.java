public class MoodAnalyzer {
    public String analyzeMood(String message) {
        String status = null;
        try {
            if (message.contains("happy")) {
                status = "happy";
            } else if (message.contains("sad")) {
                status = "sad";
            }
        }catch (NullPointerException e) {
            status="happy";
        }
        return status;
    }
}
