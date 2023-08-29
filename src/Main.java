import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] currencies = {"Dollar", "Euro", "Pound", "Yuan", "Roebel", "Baht", "Quit"};
        String name;
        String inputCurrency = null;
        String inputToCurrency = null;
        String inputAmountString = null;

        double inputToDollar = 1;
        double dollarToCurrency = 1;

        boolean inputCurrencyLoop = true;
        boolean inputToCurrencyLoop = true;
        boolean inputAmountLoop = true;

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
                inputAmountLoop = false;
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
                    inputAmountLoop = false;
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

            Scanner scanCurrency = new Scanner(System.in);
            inputToCurrency = scanCurrency.nextLine();

            for (int i = 0; i < currencies.length; i++) {
                if (inputToCurrency.equalsIgnoreCase(currencies[i])) {
                    inputToCurrencyLoop = false;
                    break;
                } else if (i == 5) {
                    System.out.println(" ");
                    System.out.println("This is not a valid currency. Please choose between Dollar, Euro, Pound, Yuan, Roebel, Baht");
                    System.out.println("Enter your currency or enter 'Quit' to stop the program: ");
                    System.out.println("--------------------------------------------");
                } else if (inputToCurrency.equalsIgnoreCase(currencies[6])) {
                    System.out.println(" ");
                    System.out.println("Thank you for using this program.");
                    System.out.println("And don't forget, you're awesome " + name);
                    System.out.println("--------------------------------------------");
                    inputToCurrencyLoop = false;
                    inputAmountLoop = false;
                    break;
                }
            }
        }

        if (inputAmountLoop) {
            System.out.println(" ");
            System.out.println("Enter the amount of " + inputCurrency + " you would exchange for " + inputToCurrency);
            System.out.println("Make sure that you use a . and not a ,");
            System.out.println("Enter the amount of " + inputCurrency + " or enter 'Quit' to stop the program:");
            System.out.println("--------------------------------------------");
        }

        // Momenteel gebruik gemaakt van deze website:
        // https://www.forbes.com/advisor/money-transfer/currency-converter/usd-eur/?amount=1
        // Data van raadplegen: 29-08-2023
        // Doorgroeimogelijkheid, API:
        // https://currencyapi.com/

        while (inputAmountLoop) {
            if (inputCurrency.equalsIgnoreCase("DOLLAR")) {
                inputToDollar = 1.00;
            } else if (inputCurrency.equalsIgnoreCase("EURO")) {
                inputToDollar = 1.080122399;
            } else if (inputCurrency.equalsIgnoreCase("POUND")) {
                inputToDollar = 1.257730325;
            } else if (inputCurrency.equalsIgnoreCase("YUAN")) {
                inputToDollar = 0.137082071;
            } else if (inputCurrency.equalsIgnoreCase("ROEBEL")) {
                inputToDollar = 0.010388854;
            } else if (inputCurrency.equalsIgnoreCase("BAHT")) {
                inputToDollar = 0.028392959;
            }

            if (inputToCurrency.equalsIgnoreCase("DOLLAR")) {
                dollarToCurrency = 1;
            } else if (inputToCurrency.equalsIgnoreCase("EURO")) {
                dollarToCurrency = 0.925821;
            } else if (inputToCurrency.equalsIgnoreCase("POUND")) {
                dollarToCurrency = 0.795083;
            } else if (inputToCurrency.equalsIgnoreCase("YUAN")) {
                dollarToCurrency = 7.2949;
            } else if (inputToCurrency.equalsIgnoreCase("ROEBEL")) {
                dollarToCurrency = 96.257006;
            } else if (inputToCurrency.equalsIgnoreCase("BAHT")) {
                dollarToCurrency = 35.224;
            }

            Scanner scanAmount = new Scanner(System.in);
            inputAmountString = scanAmount.nextLine();

            if (inputAmountString.contains(",")) {
                System.out.println(" ");
                System.out.println("Make sure that you use a . and not a ,");
                System.out.println("Enter the amount of " + inputCurrency + " or enter 'Quit' to stop the program:");
                System.out.println("--------------------------------------------");
            } else {
                double inputAmount = Double.parseDouble(inputAmountString);
                double dollars = inputAmount * inputToDollar;
                double currency = dollars * dollarToCurrency;
                System.out.println(" ");
                System.out.println("--------------------------------------------");
                System.out.println(inputAmountString + " " + inputCurrency + " is worth " + String.format("%.2f", currency) + " " + inputToCurrency + "!");
                System.out.println("Thanks for using this program and have a nice day " + name + "!");
                inputAmountLoop = false;
                break;
            }
        }
    }
}