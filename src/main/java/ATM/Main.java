package ATM;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int amount = scanner.nextInt();

        ATM atm = new ATM();
        atm.process(amount);
    }
}
