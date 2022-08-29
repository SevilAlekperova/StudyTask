package HomeWork10;

import javax.print.Doc;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        String docNumber = "5845-fda-1254-omg-5t9y";
        document.printNumber(docNumber); //1
        document.changeLetter(docNumber); //2
        document.upperLetter(docNumber); //3
        document.containsAbcd(docNumber); //4
        document.startNumber(docNumber);  //5
        document.endSymble(docNumber); //6
        document.reverseOrder(docNumber);  //7
    }
}
