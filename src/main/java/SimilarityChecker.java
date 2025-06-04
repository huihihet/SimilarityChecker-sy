public class SimilarityChecker {
    public int getLengthCheck(String input1, String input2) {
        if (input1.length() == input2.length())
            return 60;
        else {
            int longer = Math.max(input1.length(), input2.length());
            int shorter = Math.min(input1.length(), input2.length());
            if (shorter * 2 <= longer) return 0;

            int gap = longer - shorter;
            double rate = (double) gap / shorter;
            return (int) ((1 - rate) * 60);
        }
    }
}
