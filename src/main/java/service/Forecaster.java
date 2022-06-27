package service;

import repository.CurrencyRate;
import utils.Parsing;
import utils.ReadFileCSV;
import java.util.List;

public class Forecaster {

    public List<CurrencyRate> rateTomorrow(String currencyForecast){

        ReadFileCSV readFileCSV = new ReadFileCSV();
        Parsing parsingCurrency = new Parsing();
        CalculatorForecast calcСurrencyForecast = new CalculatorForecast();

        return calcСurrencyForecast.calculateCurrencyForecast(
                parsingCurrency.parsingCurrencyList(
                        readFileCSV.readFileCSV(currencyForecast)), 1);

    }

    public List<CurrencyRate> rateWeek(String currencyForecast){

        ReadFileCSV readFileCSV = new ReadFileCSV();
        Parsing parsingCurrency = new Parsing();
        CalculatorForecast calcСurrencyForecast = new CalculatorForecast();

        return calcСurrencyForecast.calculateCurrencyForecast(
                parsingCurrency.parsingCurrencyList(
                        readFileCSV.readFileCSV(currencyForecast)), 7);
    }

}
