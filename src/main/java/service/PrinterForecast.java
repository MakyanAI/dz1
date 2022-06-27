package service;

import repository.CurrencyRate;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;

public class PrinterForecast {

    public void printCurrencyForecastTomorrow(List<CurrencyRate> parsingListCurrencyRate){

        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        Collections.reverse(parsingListCurrencyRate);

        for (int i = 0; i < 1; i++){
            CurrencyRate cr = parsingListCurrencyRate.get(i);
            String localDate = LocalDate.now().plusDays(i+1).format(DateTimeFormatter.ofPattern("E dd.MM.yyyy"));

            System.out.println(localDate + " - " + decimalFormat.format(Double.parseDouble(cr.getCurs()) / Double.parseDouble(cr.getNominal())));

        }
    }
    public void printCurrencyForecastWeek(List<CurrencyRate> parsingListCurrencyRate) {

        DecimalFormat decimalFormat = new DecimalFormat("###.##");

        Collections.reverse(parsingListCurrencyRate);

        for (int i = 0; i < 7; i++) {
            CurrencyRate cr = parsingListCurrencyRate.get(i);
            String localDate = LocalDate.now().plusDays(i + 1).format(DateTimeFormatter.ofPattern("E dd.MM.yyyy"));

            System.out.println(localDate + " - " + decimalFormat.format(Double.parseDouble(cr.getCurs()) / Double.parseDouble(cr.getNominal())));

        }
    }
}
