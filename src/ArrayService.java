public class ArrayService {

    private final String RIGHT_ARRAY = ">>-->";
    private final String LEFT_ARRAY = "<--<<";

    public int countAllArrays(String sourceString) {
        int result = 0;
        for (int i = 0; i < sourceString.length() - 4; i++) {
            if ((sourceString.charAt(i) == RIGHT_ARRAY.charAt(0) &&
                sourceString.charAt(i + 1) == RIGHT_ARRAY.charAt(1) &&
                sourceString.charAt(i + 2) == RIGHT_ARRAY.charAt(2) &&
                sourceString.charAt(i + 3) == RIGHT_ARRAY.charAt(3) &&
                sourceString.charAt(i + 4) == RIGHT_ARRAY.charAt(4)) ||

                ((sourceString.charAt(i) == LEFT_ARRAY.charAt(0) &&
                sourceString.charAt(i + 1) == LEFT_ARRAY.charAt(1) &&
                sourceString.charAt(i + 2) == LEFT_ARRAY.charAt(2) &&
                sourceString.charAt(i + 3) == LEFT_ARRAY.charAt(3) &&
                sourceString.charAt(i + 4) == LEFT_ARRAY.charAt(4))))
            {
                result++;
            }
        }
        return result;
    }
}
