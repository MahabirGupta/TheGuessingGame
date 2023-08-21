import java.util.Scanner;

public class Player {
    public int guess() {
        Scanner scanner = new Scanner(System.in);
        int guessNumber = scanner.nextInt();
        return guessNumber;
    }
}
