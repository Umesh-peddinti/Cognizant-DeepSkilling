package Week1_DesignPatternsAndPrinciples.Ex2_FactoryMethodPatternExample.Code;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a PDF document.");
    }
}