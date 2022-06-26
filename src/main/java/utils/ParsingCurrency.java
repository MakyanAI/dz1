package utils;

import repository.CurrencyRate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ParsingCurrency {

    public ArrayList<CurrencyRate> parsingCurrencyList(ArrayList<CurrencyRate> listCurrencyRate){

        ArrayList<CurrencyRate> parsingListCurrencyRate = new ArrayList<CurrencyRate>();

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
