import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ManageDocument {
    Map<String,Document>list=new HashMap();
    Set<String>keyList=list.keySet();
    public void addDocument(String documentCode ,Document document){
        list.put(documentCode,document);
    }
    public void showAll(){
        for (String key: keyList) {
            Document document=list.get(key);
            if (document instanceof Book){
                Book book =(Book) document;
                System.out.println(book.toString());
            }
            if (document instanceof Journal){
                Journal journal=(Journal) document;
                System.out.println(journal.toString());
            }
            if (document instanceof Newspaper){
                Newspaper newspaper = (Newspaper) document;
                System.out.println(newspaper.toString());
            }
        }
    }
    public void testDocument(String documentCode){
        for (String k: keyList) {
            if (documentCode.equals(list.get(k).getDocumentCode())){
                System.out.println(list.get(k));
                return;
            }
        }
    }
}
