package Week1_DesignPatternsAndPrinciples.Ex6_ProxyPatternExample.Code;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Image will be loaded from remote server when displayed first time
        image1.display();
        System.out.println();

        // Image will be loaded from remote server when displayed first time
        image2.display();
        System.out.println();

        // Second time: should use cached version
        image1.display();
    }
}