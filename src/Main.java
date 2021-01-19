public class Main {
    public static void main(String[] args) {

        String defaultArray = "<<<<>>--><--<<--<<>>>--><<<<<";

        ArrayService stringService = new ArrayService();

        System.out.println(stringService.countAllArrays(defaultArray));
    }
}
