public class SimilarityChecker {
    public int getLengthCheck(String input1, String input2) {
        if (input1.length() == input2.length())
            return 60;
        else if (input1.length() < input2.length())
            return 0;
        else {
            int gap = input1.length() - input2.length();
            double rate = (double) gap / input2.length();
            return (int) ((1 - rate) * 60);
        }
    }
}
