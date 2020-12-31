public class Book extends Document{
    private String author;
    private int numberPages;

    public Book(String documentCode, String publishingCompany, int releaseNumber, String author, int numberPages) {
        super(documentCode, publishingCompany, releaseNumber);
        this.author = author;
        this.numberPages = numberPages;
    }

    @Override
    public String toString() {
        return super.toString()+author+numberPages;
    }
}
