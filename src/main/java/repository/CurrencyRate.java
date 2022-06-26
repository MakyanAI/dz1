package repository;

public class CurrencyRate {

    private String nominal;
    private String date;
    private String curs;
    private String cdx;

    public CurrencyRate(String nominal, String date, String curs, String cdx) {
        this.nominal = nominal;
        this.date = date;
        this.curs = curs;
        this.cdx = cdx;
    }

    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public String getCdx() {
        return cdx;
    }

    public void setCdx(String cdx) {
        this.cdx = cdx;
    }
}
