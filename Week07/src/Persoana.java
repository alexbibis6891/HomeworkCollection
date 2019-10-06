public class Persoana {

    protected int age;
    protected String name;

    public Persoana(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void printPeople(){
        System.out.println(getName() + ", " + getAge() + " ani");
    }
}
