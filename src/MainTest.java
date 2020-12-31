import java.util.Scanner;
import java.util.logging.SocketHandler;

public class MainTest {
    static Scanner sc = new Scanner(System.in);
    static ManageDocument manageDocument = new ManageDocument();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. nhập tài liệu");
            System.out.println("2. hiện thị toàn bộ tài liệu");
            System.out.println("3. tìm kiếm mã tài liệu");
            System.out.println("0. thoát trương trình");
            System.out.println("nhập biến choice");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("nhập số lượng tài liệu");
                    int number=Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < number; i++) {
                        addNewDocument();
                    }
                    break;
                case 2:
                    manageDocument.showAll();
                    break;
                case 3:
                    System.out.println("nhập mã tài liệu");
                    String code=sc.nextLine();
                    manageDocument.testDocument(code);
                    break;
                case 0:
                    System.exit(0);
                    break;

            }
        } while (choice != 0);
    }
    public static void addNewDocument(){
        Scanner sc1=new Scanner(System.in);
        System.out.println("nhập mã tài liệu");
        String documentCode = sc.nextLine();
        System.out.println("nhập nhà xuất bản");
        String publishingCompany=sc1.nextLine();
        System.out.println("nhập số bản phát hành");
        int releaseNumber=Integer.parseInt(sc.nextLine());
        String typeOfDocument="";
        boolean bookTest;
        boolean journalTest;
        boolean newspaperTest;
        do {
            System.out.println("nhập tên tài liệu");
            typeOfDocument = sc1.nextLine();
            if (typeOfDocument.equalsIgnoreCase("Book")){
            System.out.println("nhập tên tác giả");
            String author = sc1.nextLine();
            System.out.println("nhập số trang");
            int numberPages = Integer.parseInt(sc.nextLine());
            Document book = new Book(documentCode, publishingCompany, releaseNumber, author, numberPages);
            manageDocument.addDocument(documentCode,book);
            }
            if (typeOfDocument.equalsIgnoreCase("Journal")){

            System.out.println("nhập số phát hành");
            int issueNumber = Integer.parseInt(sc1.nextLine());
            System.out.println("nhập tháng phát hành");
            int issueMonth = Integer.parseInt(sc.nextLine());
            Document journal = new Journal(documentCode, publishingCompany, releaseNumber, issueNumber, issueMonth);
            manageDocument.addDocument(documentCode,journal);
            }
            if (typeOfDocument.equalsIgnoreCase("Newspaper")){
            System.out.println("nhập ngày phát hành");
            int issueDay = Integer.parseInt(sc1.nextLine());
            Document newspaper = new Newspaper(documentCode, publishingCompany, releaseNumber, issueDay);
            manageDocument.addDocument(documentCode, newspaper);
            }
            bookTest=typeOfDocument.equalsIgnoreCase("Book");
            journalTest=typeOfDocument.equalsIgnoreCase("Journal");
            newspaperTest=typeOfDocument.equalsIgnoreCase("Newspaper");
        }while (!bookTest &&!journalTest&&!newspaperTest);
        System.out.println("__________________________________________");
    }
}
