package utils;

import repository.CurrencyRate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadFileCSV {

    public static final int NUMBER_COURSES = 7;

    public ArrayList<CurrencyRate> readFileCSV(String currency) {

        try {
            int line = 0;
            String row;
            InputStream inputStream = ReadFileCSV.class.getClassLoader().getResourceAsStream("RC_F01_06_2002_T17_06_2022_" + currency + ".csv");
            BufferedReader csvReader = new BufferedReader(new InputStreamReader(inputStream));
            ArrayList<CurrencyRate> listCurrencyRate = new ArrayList<CurrencyRate>();

            while ((row = csvReader.readLine()) != null && line <= NUMBER_COURSES) {
                String[] data = row.split(";");

                if(line != 0){
                    listCurrencyRate.add(new CurrencyRate(data[0], data[1], data[2], data[3]));
                }
                line++;
            }
            csvReader.close();

            return listCurrencyRate;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
