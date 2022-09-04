package HomeWork11;

public class Main {
    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        Banana banana = new Banana();
        bucket.putFruit(banana);
        bucket.putFruit(new Apple());
        bucket.putFruit(new Orange());
        bucket.showBucket();
    }
}
