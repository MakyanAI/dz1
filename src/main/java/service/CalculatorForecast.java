package service;

import repository.CurrencyRate;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class CalculatorForecast {

    public static final double NUMBER_COURSES = 7.0;

    public List<CurrencyRate> calculateCurrencyForecast(List<CurrencyRate> parsingListCurrencyRate, int countDay){

        String cdx;
        String nominal;
        int days;
        LocalDate startDate;

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        CurrencyRate ctr = parsingListCurrencyRate.get(0);
        nominal = ctr.getNominal();
        cdx = ctr.getCdx();

        startDate = LocalDate.parse(ctr.getDate(), dateTimeFormatter);
        LocalDate localDate = LocalDate.now();
        days = countDay + (int) Duration.between(startDate.atStartOfDay(), localDate.atStartOfDay()).toDays();



        for (int j = 0; j < days; j++){
            Double curs = 0.0;
            for(int k = j; k < parsingListCurrencyRate.size(); k++){
                CurrencyRate ctr2 = parsingListCurrencyRate.get(k);
                curs += Double.parseDouble(ctr2.getCurs());
            }

            curs = curs / NUMBER_COURSES;
            startDate = (startDate.plusDays(1));
            parsingListCurrencyRate.add(new CurrencyRate(nominal, String.valueOf(startDate), String.valueOf(curs), cdx));

            }
        return parsingListCurrencyRate;
    }
}
