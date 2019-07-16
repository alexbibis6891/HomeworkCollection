package Week03;

public class Novels extends Books {

    protected String genre;

    public Novels(String title, int pages, String genre) {
        super(title, pages);
        this.genre = genre;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void printBooks(){
        super.printBooks();
        System.out.print(", ");
        System.out.println(this.getGenre());
    }
}
