public class Newspaper extends Document {
    private int issueDay;

    public Newspaper(String documentCode, String publishingCompany, int releaseNumber, int issueDay) {
        super(documentCode, publishingCompany, releaseNumber);
        this.issueDay = issueDay;
    }

    @Override
    public String toString() {
        return super.toString()+issueDay;
    }
}
