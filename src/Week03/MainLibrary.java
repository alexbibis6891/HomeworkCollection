package Week03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainLibrary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Salut! Selecteaza ce vrei sa faci din optiunile de mai jos");
        System.out.println("Tasteaza 1 pentru verificarea inventarului");
        System.out.println("Tasteaza 2 pentru adaugarea unei carti in inventar");
        System.out.println("Tasteaza 3 pentru stergerea unei carti din inventar");

        List<Books> BookList = new ArrayList<>();


        BookList.add(new Novels("Harry Potter and the Delicious Afterbirth", 258, "Fantasy"));
        BookList.add(new Novels("Lord of the Flies Away", 154, "Adventure"));
        BookList.add(new Novels("Satanic bible", 665, "Fantasy"));
        BookList.add(new Novels("Star Trek: Spock gets a shotgun", 300, "SF"));
        BookList.add(new Novels("Homosexuality: A Cure", 3, "Lifestyle"));
        BookList.add(new ArtBooks("Pretencious photos", 52, "Poor"));
        BookList.add(new ArtBooks("Insuferable vistas", 85, "Superior"));
        BookList.add(new ArtBooks("Paintings to claw your eyes out", 69, "Avarage"));
        BookList.add(new ArtBooks("What is an Art Book anyway?", 2, "Poor"));


        String option = "";
        option = sc.next();
        sc.nextLine();

        while (!option.equals("exit")) {

            switch (option) {

                case ("1"):
                    for (int i = 0; i < BookList.size(); i++) {
                        BookList.get(i).printBooks();
                    }


                    break;
                case ("2"):
                    System.out.println("Ce carte vrei sa introduci? novel sau art book?");
                    String bookType = sc.nextLine();
                    System.out.println("Care este titlul cartii?");
                    String bookTitle = sc.nextLine();
                    System.out.println("Cate pagini are?");
                    int numarPagini = sc.nextInt();
                    sc.nextLine();
                    switch (bookType) {
                        case ("novel"):
                            System.out.println("Ce gen este?");
                            String genreType = sc.nextLine();
                            Novels a = new Novels(bookTitle, numarPagini, genreType);
                            BookList.add(a);
                            a.printBooks();
                            break;
                        case ("art book"):
                            System.out.println("Care este calitatea hartiei?");
                            String paperQualityType = sc.nextLine();
                            ArtBooks b = new ArtBooks(bookTitle, numarPagini, paperQualityType);
                            BookList.add(b);
                            b.printBooks();
                            break;
                        default:
                            System.out.println("Mai incearca");
                    }
                    break;
                case ("3"):
                    System.out.println("Introdu titlul cartii pe care vrei s-o stergi din lista");
                    String deleteTitle = sc.nextLine();
                    int bookIndex = -1;
                    for (Books book : BookList){
                        if (deleteTitle.equals(book.title)) {
                            bookIndex = BookList.indexOf(book);
                        }
                    }
                    if (bookIndex != -1) {
                        BookList.remove(bookIndex);
                    } else {
                        System.out.println("Cartea nu exista, mai incearca!");
                    }
                    break;
                default:
                    System.out.println("DANGER WILL ROBINSON!!! EROARE!!! Alege una din cele 3 optiuni");
                    break;
            }

            System.out.println();

            System.out.println("Salut! Selecteaza ce vrei sa faci din optiunile de mai jos");
            System.out.println("Tasteaza 1 pentru verificarea inventarului");
            System.out.println("Tasteaza 2 pentru adaugarea unei carti in inventar");
            System.out.println("Tasteaza 3 pentru stergerea unei carti din inventar");

            option = sc.next();
            sc.nextLine();
        }
    }
}
