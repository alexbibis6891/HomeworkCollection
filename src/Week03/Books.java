package Week03;

public class Books {

    protected String title;
    protected int pages;

    public Books(String title, int pages) {
        this.title = title;
        this.pages = pages;

    }

    public String getTitle() {
        return title + ", " + pages + " pagini";
    }

    public int getPages() {
        return pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void printBooks(){
        System.out.print(this.getTitle());
    }
}
