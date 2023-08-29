import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] currencies = {"Dollar", "Euro", "Pound", "Yuan", "Roebel", "Baht", "Quit"};
        String name;
        String inputCurrency = null;
        String inputToCurrency = null;
        boolean inputCurrencyLoop = true;
        boolean inputToCurrencyLoop = true;

        System.out.println(" ");
        System.out.println("Super Ultra Mega Currency Exchanger Deluxe");
        System.out.println("Enter your name: ");
        System.out.println("--------------------------------------------");

        while (true) {
            Scanner inputName = new Scanner(System.in);
            name = inputName.nextLine();

            if (name.length() < 2) {
                System.out.println(" ");
                System.out.println("Please enter a valid name or enter 'Quit' to stop the program:");
                System.out.println("--------------------------------------------");
            } else if (name.equalsIgnoreCase("Quit")){
                System.out.println(" ");
                System.out.println("Thank you for using this program.");
                System.out.println("And don't forget, you're awesome you nameless bastard!");
                inputCurrencyLoop = false;
                inputToCurrencyLoop = false;
                break;
            } else {
                break;
            }
        }

        while (inputCurrencyLoop) {
            System.out.println(" ");
            System.out.println("Welcome " + name);
            System.out.println("Which currency would you like to exchange?");
            System.out.println("You can choose between Dollar, Euro, Pound, Yuan, Roebel, Baht");
            System.out.println("Enter your currency or enter 'Quit' to stop the program: ");
            System.out.println("--------------------------------------------");

            Scanner scanCurrency = new Scanner(System.in);
            inputCurrency = scanCurrency.nextLine();

            for (int i = 0; i < currencies.length; i++) {
                if (inputCurrency.equalsIgnoreCase(currencies[i])) {
                    inputCurrencyLoop = false;
                    break;
                } else if (i == 5) {
                    System.out.println(" ");
                    System.out.println("This is not a valid currency. Please choose between Dollar, Euro, Pound, Yuan, Roebel, Baht");
                    System.out.println("Enter your currency or enter 'Quit' to stop the program: ");
                    System.out.println("--------------------------------------------");
                } else if (inputCurrency.equalsIgnoreCase(currencies[6])) {
                    System.out.println(" ");
                    System.out.println("Thank you for using this program.");
                    System.out.println("And don't forget, you're awesome " + name);
                    System.out.println("--------------------------------------------");
                    inputCurrencyLoop = false;
                    inputToCurrencyLoop = false;
                    break;
                }
            }

        }

        while (inputToCurrencyLoop) {
            System.out.println(" ");
            System.out.println("To which currency would you like to exchange your " + inputCurrency + " " + name + "?");
            System.out.println("You can choose between Dollar, Euro, Pound, Yuan, Roebel, Baht");
            System.out.println("Enter your currency or enter 'Quit' to stop the program: ");
            System.out.println("--------------------------------------------");


            Scanner scanToCurrency = new Scanner(System.in);
            inputToCurrency = scanToCurrency.nextLine();

            for (int i = 0; i < currencies.length; i++) {
                if (inputToCurrency.equalsIgnoreCase(currencies[i])) {
                    inputToCurrencyLoop = false;
                    break;
                } else if (i == 5) {
                    System.out.println(" ");
                    System.out.println("This is not a valid currency. Please choose between Dollar, Euro, Pound, Yuan, Roebel, Baht");
                    System.out.println("Enter your currency or enter 'Quit' to stop the program: ");
                    System.out.println("--------------------------------------------");
                } else if (inputCurrency.equalsIgnoreCase(currencies[6])) {
                    System.out.println(" ");
                    System.out.println("Thank you for using this program.");
                    System.out.println("And don't forget, you're awesome " + name);
                    System.out.println("--------------------------------------------");
                    inputToCurrencyLoop = false;
                    break;
                }
            }
        }



    }
}