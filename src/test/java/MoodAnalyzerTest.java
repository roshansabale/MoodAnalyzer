import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class MoodAnalyzerTest {
    @Test
    public void analyzeMood_WhenHappy_ThenReturnTrue() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("i m happy");
        Assert.assertEquals("happy",mood);
    }

    @Test
    public void analyzeMood_WhenSad_ThenReturnTrue() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood= moodAnalyzer.analyzeMood("i m sad");
        Assert.assertEquals("sad",mood);

    }
}
