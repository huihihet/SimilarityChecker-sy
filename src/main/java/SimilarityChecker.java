public class SimilarityChecker {

    public static final int MAX_SCORE = 60;
    public static final int MIN_SCORE = 0;

    public int getLengthCheck(String input1, String input2) {
        int longer = Math.max(input1.length(), input2.length());
        int shorter = Math.min(input1.length(), input2.length());

        if (isSameLength(longer, shorter)) return MAX_SCORE;
        if (isDoubleLength(longer, shorter)) return MIN_SCORE;
        return getPartialScore(longer, shorter);
    }

    private static int getPartialScore(int longer, int shorter) {
        int gap = longer - shorter;
        double rate = (double) gap / shorter;
        return (int) ((1 - rate) * MAX_SCORE);
    }

    private boolean isSameLength(int longer, int shorter) {
        return longer == shorter;
    }

    private boolean isDoubleLength(int longer, int shorter) {
        return shorter * 2 <= longer;
    }

}
