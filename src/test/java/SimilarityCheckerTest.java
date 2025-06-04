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
    void lengthCheck() {
        checkLengthSimilarity(60, "ASD", "DSA");
    }

    @Test
    void lengthCheckSameLength() {
        checkLengthSimilarity(60, "ASD", "DSA");
    }

    @Test
    void lengthCheck1() {
        checkLengthSimilarity(0, "A", "BB");
    }

    @Test
    void lengthCheck2() {
        checkLengthSimilarity(20, "AAABB", "BAA");
    }

    @Test
    void lengthCheck3() {
        checkLengthSimilarity(30, "AA", "AAE");
    }

    private void checkLengthSimilarity(int expected, String input1, String input2) {
        int actual = similarityChecker.getLengthCheck(input1, input2);
        assertEquals(expected, actual);
    }
}