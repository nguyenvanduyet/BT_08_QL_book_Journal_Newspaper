public class Document {
    private String documentCode;
    private String publishingCompany;
    private int releaseNumber;

    public Document(String documentCode, String publishingCompany, int releaseNumber) {
        this.documentCode = documentCode;
        this.publishingCompany = publishingCompany;
        this.releaseNumber = releaseNumber;
    }

    public String getDocumentCode() {
        return documentCode;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentCode='" + documentCode + '\'' +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", releaseNumber=" + releaseNumber +
                '}';
    }
}