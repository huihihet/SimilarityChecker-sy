public class SimilarityChecker {
    public int getLengthCheck(String input1, String input2) {
        int longer = Math.max(input1.length(), input2.length());
        int shorter = Math.min(input1.length(), input2.length());

        if (isSameLength(longer, shorter)) return 60;
        if (isDoubleLength(longer, shorter)) return 0;

        int gap = longer - shorter;
        double rate = (double) gap / shorter;
        return (int) ((1 - rate) * 60);
    }

    private boolean isSameLength(int longer, int shorter) {
        return longer == shorter;
    }

    private boolean isDoubleLength(int longer, int shorter) {
        return shorter * 2 <= longer;
    }

}
