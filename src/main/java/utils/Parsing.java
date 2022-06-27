package utils;

import repository.CurrencyRate;

import java.util.*;

public class Parsing {

    public List<CurrencyRate> parsingCurrencyList(List<CurrencyRate> listCurrencyRate){

        List parsingListCurrencyRate = new ArrayList<>();

        for (CurrencyRate ctr : listCurrencyRate) {

            String curs = ctr.getCurs();
            curs = curs.replace(",", ".");
            curs = curs.replaceAll("[^\\d.]", "");

            String nominal = ctr.getNominal();
            nominal = nominal.replaceAll("[^\\d]", "");


            parsingListCurrencyRate.add(new CurrencyRate(nominal, ctr.getDate(), curs, ctr.getCdx()));
        }

        Collections.sort(parsingListCurrencyRate, Comparator.comparing(CurrencyRate::getDate));

        return parsingListCurrencyRate;
    }
}
