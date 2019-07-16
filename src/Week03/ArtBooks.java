package Week03;

public class ArtBooks extends Books {

    protected String paperQuality;

    public ArtBooks(String title, int pages, String paperQuality){
        super(title, pages);
        this.paperQuality = paperQuality;
    }

    public String getPaperQuality() {
        return paperQuality + " paper quality";
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }

    public void printBooks(){
        super.printBooks();
        System.out.print(", ");
        System.out.println(this.getPaperQuality());
    }
}
