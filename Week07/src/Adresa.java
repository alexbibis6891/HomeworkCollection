public class Adresa {

    protected String locatie;
    protected String tara;

    public Adresa(String locatie, String tara) {
        this.locatie = locatie;
        this.tara = tara;
    }

    public String getLocatie() {
        return this.locatie + ", " + this.tara;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }
}
