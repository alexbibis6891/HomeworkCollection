import java.util.LinkedList;
import java.util.List;

public class Hobby {

    protected String nameOfHobby;
    protected int frequency;
    protected List<Adresa> Adresses;

    public Hobby(String nameOfHobby, int frequency, List<Adresa> adresses) {
        this.nameOfHobby = nameOfHobby;
        this.frequency = frequency;
        Adresses = adresses;
    }

    public String getNameOfHobby() {
        return nameOfHobby;
    }

    public void setNameOfHobby(String nameOfHobby) {
        this.nameOfHobby = nameOfHobby;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public List<Adresa> getAdresses() {
        return Adresses;
    }

    public void setAdresses(List<Adresa> adresses) {
        Adresses = adresses;
    }
}
