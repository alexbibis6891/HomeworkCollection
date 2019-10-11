import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Imaginationland University. Choose one of the following options:");
        System.out.println("1. Add Student");
        System.out.println("2. Delete Student");
        System.out.println("3. Retrieve all students of a certain age");
        System.out.println("4. List students");
        System.out.println("5. Exit");

        List<Student> StudentList = new ArrayList<>();
        //  SimpleDateFormat date_format = new SimpleDateFormat("YYYY-MM-DD");

        StudentList.add(new Student("Jew", "Gasington", "1980-06-22", "M", 1984653));
        StudentList.add(new Student("Floricica", "Mirosica", "2001-08-05", "F", 2365488));
        StudentList.add(new Student("Jimmy", "Volmer", "1999-09-11", "M", 18523697));

        String option = "";
        option = sc.next();
        sc.nextLine();


        while (!option.equals("5")) {

            switch (option) {

                case ("1"):
                    for (Student a : StudentList) {
                        a.listStudent();
                    }
                    System.out.println("What is the student fist name?");
                    String first_name = sc.nextLine();
                    System.out.println("What is the student last name?");
                    String last_name = sc.nextLine();
                    System.out.println("Student date of birth? (use format YYYY-MM-DD)");
                    String date_of_birth = sc.nextLine();
                    System.out.println("What gender is the student? M / F");
                    String gender = sc.nextLine();
                    System.out.println("Type in the student ID. (8 numbers long)");
                    int ID_CNP = sc.nextInt();
                    try {
                        Student a = new Student(first_name, last_name, date_of_birth, gender, ID_CNP);
                        StudentList.add(a);
                        a.listStudent();
                    }
                    catch (IllegalArgumentException e) {
                        System.err.println(e.getMessage());
                    }

                    break;
                case ("2"):
                    System.out.println("Type the ID of the student you want to delete");
                    try {
                        int deleteStudent = sc.nextInt();
                        int studentIndex = -1;
                        for (Student stud : StudentList) {
                            if (deleteStudent == stud.getID_CNP()) {
                                studentIndex = StudentList.indexOf(stud);
                            }
                        }
                        if (studentIndex != -1) {
                            StudentList.remove(studentIndex);
                        }
                        else {
                            try {
                                throw new IllegalArgumentException();
                            } catch (IllegalArgumentException e){
                                System.err.println("Could not find any student with that ID");
                            }
                        }
                    } catch (InputMismatchException e){
                        System.err.println("ID is made up only of numbers, check if there is a typo");
                    }
                    break;
                case ("3"):
                    System.out.println("What age group would you like to select?");
                    try {
                        int age = sc.nextInt();
                        if (age < 0){
                            throw new IllegalArgumentException("Age cannot be negative");
                        }
                        for (Student stud : StudentList) {
                            if (age == stud.age()){
                                stud.listStudent();
                            }
                        }
                    } catch (Exception e){
                        System.err.println("Invalid age");
                    }

                    break;
                case ("4"):
                    for (Student stud : StudentList) {
                        stud.listStudent();
                    }
                    break;
                default:
                    System.out.println("You must have pressed the wrong button. Try again!");
            }

            System.out.println();
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Retrieve all students of a certain age");
            System.out.println("4. List students");
            System.out.println("5. Exit");

            option = sc.next();
            sc.nextLine();

        }

    }
}
