package service;

import repository.CurrencyRate;
import utils.Parsing;
import utils.ReadFileCSV;
import java.util.List;

public class Forecaster {

    ReadFileCSV readFileCSV = new ReadFileCSV();
    Parsing parsingCurrency = new Parsing();

    public List<CurrencyRate> rateTomorrow(String currencyForecast){

        CalculatorForecast calculatorForecast = new CalculatorForecast();

        return calculatorForecast.calculateCurrencyForecast(
                parsingCurrency.parsingCurrencyList(
                        readFileCSV.readFileCSV(currencyForecast)), 1);

    }

    public List<CurrencyRate> rateWeek(String currencyForecast){

        CalculatorForecast calculatorForecast = new CalculatorForecast();

        return calculatorForecast.calculateCurrencyForecast(
                parsingCurrency.parsingCurrencyList(
                        readFileCSV.readFileCSV(currencyForecast)), 7);
    }

}
