import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Student {

    private String first_name;
    private String last_name;
    private LocalDate date_of_birth;
    private String gender;
    private Date birthDate;
    private int ID_CNP;

    public Student(String first_name, String last_name, String date_of_birth, String gender, int ID_CNP) throws IllegalArgumentException{
        if (first_name == null || "".equals(first_name)) {
            throw new IllegalArgumentException("Name can't be empty");
        }
        this.first_name = first_name;
        if (last_name == null || "".equals(last_name)) {
            throw new IllegalArgumentException("Name can't be empty");
        }
        this.last_name = last_name;
        this.date_of_birth = LocalDate.parse(date_of_birth);
        if (!(this.date_of_birth.getYear() <= LocalDate.now().getYear()-18 && this.date_of_birth.getYear() > 1900)){
            throw new IllegalArgumentException("Student is either a mummy or a baby");
        }
        //this.birthDate = new Date(date_of_birth)
        if (!"f".equalsIgnoreCase(gender) && !"m".equalsIgnoreCase(gender)){
            throw new IllegalArgumentException("There are only 2 genders");
        }
        this.gender = gender;
        this.ID_CNP = ID_CNP;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDate_of_birth() {
        return date_of_birth.toString();
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = LocalDate.parse(date_of_birth);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getID_CNP() {
        return ID_CNP;
    }

    public void setID_CNP(int ID_CNP) {
        this.ID_CNP = ID_CNP;
    }

    public int age (){
        LocalDate currentDate = LocalDate.now();
        return Period.between(date_of_birth, currentDate).getYears();
    }

    public void listStudent(){
        System.out.println(getFirst_name() + " " + getLast_name() + ", " + getGender() + ", " + getID_CNP() + ", " + getDate_of_birth());
    }


}
