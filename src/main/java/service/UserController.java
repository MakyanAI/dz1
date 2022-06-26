package service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserController {
    public static void userInterface() {

        try {
            CurrencyForecast rateTomorrow = new CurrencyForecast();
            PrintCurrencyForecast printCurrencyForecast = new PrintCurrencyForecast();
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            label:
            do {
                System.out.println("Введите название команды: ");
                String nameTeam = br.readLine();

                switch (nameTeam) {
                    case "rate EUR tomorrow":
                        printCurrencyForecast.printCurrencyForecastTomorrow(rateTomorrow.rateTomorrow("EUR"));
                        break;
                    case "rate USD tomorrow":
                        printCurrencyForecast.printCurrencyForecastTomorrow(rateTomorrow.rateTomorrow("USD"));
                        break;
                    case "rate TRY tomorrow":
                        printCurrencyForecast.printCurrencyForecastTomorrow(rateTomorrow.rateTomorrow("TRY"));
                        break;
                    case "rate EUR week":
                        printCurrencyForecast.printCurrencyForecastWeek(rateTomorrow.rateWeek("EUR"));
                        break;
                    case "rate USD week":
                        printCurrencyForecast.printCurrencyForecastWeek(rateTomorrow.rateWeek("USD"));
                        break;
                    case "rate TRY week":
                        printCurrencyForecast.printCurrencyForecastWeek(rateTomorrow.rateWeek("TRY"));
                        break;
                    case "Exit":
                        break label;
                    default:
                        System.out.println("Нет такой команды.");
                        break;
                }
            } while (true);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
