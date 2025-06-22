package Week1_DesignPatternsAndPrinciples.Ex6_ProxyPatternExample.Code;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            // Lazy initialization: load only when needed
            realImage = new RealImage(fileName);
        } else {
            System.out.println("Using cached image for " + fileName);
        }
        realImage.display();
    }
}