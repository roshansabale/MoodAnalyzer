import org.junit.jupiter.api.Test;
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyzerTest {
    String status = "";
    @Test
    public void analyzeMood_WhenHappy_ThenReturnTrue() throws InvalidMoodException {
        String message = "I m happy";
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(message);
        try {
            status = moodAnalyzer.analyzeMood();
        } catch(InvalidMoodException exception) {
            exception.printStackTrace();
        }
        Assert.assertEquals("happy", status);
    }

    @Test
    public void analyzeMood_WhenSad_ThenReturnTrue() throws InvalidMoodException {
        String message = "I m sad";
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(message);
        try {
            status = moodAnalyzer.analyzeMood();
        } catch(InvalidMoodException exception) {
            exception.printStackTrace();
        }
        Assert.assertEquals("sad", status);
    }

    @Test
    public void analyzeMood_WhenNull_ThenReturnHappy() throws InvalidMoodException {
        /*MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood= moodAnalyzer.analyzeMood(null);
        Assert.assertEquals("happy",mood);
        System.out.println("You have enterd Null mood now set to -> "+mood);*/
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        InvalidMoodException exception = assertThrows(InvalidMoodException.class, () -> moodAnalyzer.analyzeMood());
        assertEquals(exception.getType() ,InvalidMoodException.ExceptionType.NullMood);
    }

    @Test
    void analyseMood_WhenNull_ThenReturnInvalidMoodException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        InvalidMoodException exception = assertThrows(InvalidMoodException.class, () -> moodAnalyzer.analyzeMood());
        assertEquals(exception.getType() ,InvalidMoodException.ExceptionType.NullMood);
    }
}
