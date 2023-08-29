import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputName = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Super Ultra Mega Currency Exchanger Deluxe");
        System.out.println("Enter your name: ");
        System.out.println("--------------------------------------------");

        String name = inputName.nextLine();

        String inputCurrency = null;
        boolean inputCurrencyLoop = true;

        String inputToCurrency = null;

        System.out.println(" ");
        System.out.println("Welcome " + name);
        System.out.println("Which currency would you like to exchange?");
        System.out.println("You can choose between Dollar, Euro, Pound, Yuan, Roebel, Baht");
        System.out.println("Enter your currency or enter 'Quit' to stop the program: ");
        System.out.println("--------------------------------------------");

        while (inputCurrencyLoop) {
            String[] currencies = {"Dollar", "Euro", "Pound", "Yuan", "Roebel", "Baht", "Quit"};
            Scanner scanCurrency = new Scanner(System.in);
            inputCurrency = scanCurrency.nextLine();

            for (int i = 0; i < currencies.length; i++) {
                if (inputCurrency.equalsIgnoreCase(currencies[i])) {
                    inputCurrencyLoop = false;
                    break;
                } else if (i == 5) {
                    System.out.println("This is not a valid currency. Please choose between Dollar, Euro, Pound, Yuan, Roebel, Baht");
                    System.out.println("Enter your currency or enter 'Quit' to stop the program: ");
                } else if (inputCurrency.equalsIgnoreCase(currencies[6])) {
                    System.out.println("Thank you " + name + " for using this program.");
                    System.out.println("And don't forget, you're awesome " + name);
                    System.out.println("--------------------------------------------");
                    inputCurrencyLoop = false;
                    break;
                }
            }

        }

    }
}