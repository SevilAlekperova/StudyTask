package HomeWork10;

public class Document {
    public void printNumber(String doc) {
        //1
        System.out.println(doc.substring(0, 4) + doc.substring(9, 13));
    }

    //2
    public void changeLetter(String doc) {
        System.out.println(doc.replace("a", "*"));
    }

    //3
    public void upperLetter(String doc) {
        System.out.println("Letters: " + doc.replaceAll("\\d", "").toUpperCase());
    }

    //4
    public void containsAbcd(String doc){
        if (doc.contains("ABCD") || doc.contains("abcd")){
            System.out.println("Строка содержит 'abcd' или 'ABCD'");
        } else{
            System.out.println("Строка не содержит 'abcd' или 'ABCD'");
        }
    }
    //5
    public void startNumber(String doc){
        System.out.println("Начинается ли строка с 5555? " + doc.startsWith("5555"));
    }
    //6
    public void endSymble(String doc){
        System.out.println("Заканчивается ли строка с 1a2b? " + doc.endsWith("1a2b"));
    }
    //7
    public void reverseOrder (String doc){
        System.out.println(new StringBuilder(doc).reverse());
    }

}

