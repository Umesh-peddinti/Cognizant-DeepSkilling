package Week1_DesignPatternsAndPrinciples.Ex6_ProxyPatternExample.Code;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromServer(fileName);
    }

    private void loadFromServer(String fileName) {
        System.out.println("Loading " + fileName + " from remote server...");
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}