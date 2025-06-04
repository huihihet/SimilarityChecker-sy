import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimilarityCheckerTest {

    private SimilarityChecker similarityChecker;

    @BeforeEach
    void setUp() {
        similarityChecker = new SimilarityChecker();
    }

    @Test
    void lengthCheckSameLength() {
        checkSimilarity(60, "ASD", "DSA");
    }

    @Test
    void lengthCheckInput2Longer() {
        checkSimilarity(0, "A", "BB");
    }


    @Test
    void lengthCheckInput1Longer1() {
        checkSimilarity(20, "AAABB", "BAA");
    }

    private void checkSimilarity(int expected, String input1, String input2) {
        int actual = similarityChecker.getLengthCheck(input1, input2);
        assertEquals(expected, actual);
    }
}