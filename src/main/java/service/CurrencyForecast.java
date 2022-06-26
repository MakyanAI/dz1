package service;

import repository.CurrencyRate;
import utils.ParsingCurrency;
import utils.ReadFileCSV;

import java.util.ArrayList;

public class CurrencyForecast {

    public ArrayList<CurrencyRate> rateTomorrow(String currencyForecast){

        ReadFileCSV readFileCSV = new ReadFileCSV();
        ParsingCurrency parsingCurrency = new ParsingCurrency();
        CalcСurrencyForecast calcСurrencyForecast = new CalcСurrencyForecast();

        return calcСurrencyForecast.calculateCurrencyForecast(parsingCurrency.parsingCurrencyList(readFileCSV.readFileCSV(currencyForecast)), 1);

    }

    public ArrayList<CurrencyRate> rateWeek(String currencyForecast){

        ReadFileCSV readFileCSV = new ReadFileCSV();
        ParsingCurrency parsingCurrency = new ParsingCurrency();
        CalcСurrencyForecast calcСurrencyForecast = new CalcСurrencyForecast();

        return calcСurrencyForecast.calculateCurrencyForecast(parsingCurrency.parsingCurrencyList(readFileCSV.readFileCSV(currencyForecast)), 7);
    }

}
