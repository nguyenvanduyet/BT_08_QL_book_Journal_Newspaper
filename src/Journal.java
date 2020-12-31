public class Journal extends Document {
    private int issueNumber;
    private int issueMonth;

    public Journal(String documentCode, String publishingCompany, int releaseNumber, int issueNumber, int issueMonth) {
        super(documentCode, publishingCompany, releaseNumber);
        this.issueNumber = issueNumber;
        this.issueMonth = issueMonth;
    }

    @Override
    public String toString() {
        return super.toString()+issueNumber+issueMonth;
    }
}
