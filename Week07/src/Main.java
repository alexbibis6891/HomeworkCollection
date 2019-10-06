import java.util.*;

public class Main {

    private static Object Hobby;

    public static void main(String[] args) {

        TreeSet<Persoana> Personaje = new TreeSet<>(Comparator.comparing(Persoana::getName).thenComparing(Persoana::getAge));

        Personaje.add(new Somer(32, "Alex Rose"));
        Personaje.add(new Persoana(48, "Matei Basarab"));
        Personaje.add(new Persoana(16, "Captain Nemo"));
        Personaje.add(new Angajat(56, "James Inafield"));
        Personaje.add(new Angajat(57, "Axl Pose"));
        Personaje.add(new Persoana(23, "Jiulia Pitipoanca"));
        Personaje.add(new Persoana(50, "Martinica Ofilitica"));
        Personaje.add(new Somer(27, "Mititica Draganescu"));
        Personaje.add(new Somer(69, "Mititica Draganescu"));

        for (Persoana a : Personaje){
            System.out.println(a.getName() + ", " + a.getAge() + " ani");
        }

        Adresa pentruBicislism = new Adresa("Pe strada, in padure, anywhere actually","Orice tara fara ciori sa-ti fure bicicleta");
        Adresa pentruBiciclism2 = new Adresa("W@herever theres some sembelance of a road", "Orice tara, in afara de Suedia");
        Adresa pentruSkydiving = new Adresa("Str. Inventata, Nr. 69, Langa fantana, Ghimbav", "Romania, S.U.A., Canada, multe altele");
        Adresa pentruSkydiving2 = new Adresa("Langa Casa Alba", "SUA");
        Adresa pentruGaming = new Adresa("Adresa ta de acasa", "Orice tara cu curent electric (in afara de vagaunele islamice)");
        Adresa pentruInnot = new Adresa("Langa gara", "Sahara");

        ArrayList<Adresa> adresePentruBiciclism = new ArrayList<>();
        ArrayList<Adresa> adresePentruSkydiving = new ArrayList<>();
        ArrayList<Adresa> adresePentruGaming = new ArrayList<>();
        ArrayList<Adresa> adresePentruInnot = new ArrayList<>();

        adresePentruBiciclism.add(pentruBicislism);
        adresePentruBiciclism.add(pentruBiciclism2);
        adresePentruSkydiving.add(pentruSkydiving);
        adresePentruSkydiving.add(pentruSkydiving2);
        adresePentruGaming.add(pentruGaming);
        adresePentruInnot.add(pentruInnot);

        Hobby biciclism = new Hobby("Biciclism", 7, adresePentruBiciclism);
        Hobby skydiving = new Hobby("Skydiving", 1, adresePentruSkydiving);
        Hobby gaming = new Hobby("Gaming", 69, adresePentruGaming);
        Hobby innot = new Hobby("Innot", 9, adresePentruInnot);

        HashMap<Persoana, List<Hobby>> hobbiurilePersoanei = new HashMap<>();

        List<Hobby> firstPersonHobbies = new ArrayList<>();
        List<Hobby> secondPersonHobbies = new ArrayList<>();

        firstPersonHobbies.add(biciclism);
        firstPersonHobbies.add(skydiving);
        secondPersonHobbies.add(gaming);
        secondPersonHobbies.add(innot);

        hobbiurilePersoanei.put(Personaje.first(), firstPersonHobbies);
        hobbiurilePersoanei.put(Personaje.last(), secondPersonHobbies);

        for (Persoana a: hobbiurilePersoanei.keySet()){
            String name = a.getName();
            List<Hobby> personHobbies = hobbiurilePersoanei.get(a);
            String hobbies = "";
            String addresses = "";
            for (Hobby h : personHobbies) {
                List<Adresa> hobbyAddresses = new ArrayList<>();
                for (Adresa ad : h.Adresses){
                    addresses = addresses + ad.getLocatie() + ", ";
                }
                hobbies = hobbies + ", " + h.getNameOfHobby();
            }

            System.out.println(name + " " + hobbies + ", " + addresses);
        }

    }
}
