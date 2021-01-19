import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String arrayFromConsole = in.next();

        ArrayService stringService = new ArrayService();

        System.out.println(stringService.countAllArrays(arrayFromConsole));
    }
}
