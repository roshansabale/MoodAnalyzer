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

    @Test
    public void analyzeMood_WhenNull_ThenReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood= moodAnalyzer.analyzeMood(null);
        Assert.assertEquals("happy",mood);
        System.out.println("You have enterd Null mood now set to -> "+mood);

    }
}
