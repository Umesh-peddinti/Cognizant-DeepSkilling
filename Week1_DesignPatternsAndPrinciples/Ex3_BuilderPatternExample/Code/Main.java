package Week1_DesignPatternsAndPrinciples.Ex3_BuilderPatternExample.Code;

public class Main {
    public static void main(String[] args) {
        // Basic Computer with only CPU and RAM
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB")
                .build();

        // Gaming Computer with storage and graphics card
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard(true)
                .build();

        // Office Computer with custom storage
        Computer officeComputer = new Computer.Builder("AMD Ryzen 5", "16GB")
                .setStorage("512GB SSD")
                .build();

        // Display configurations
        System.out.println("Basic Computer: " + basicComputer);
        System.out.println("Gaming Computer: " + gamingComputer);
        System.out.println("Office Computer: " + officeComputer);
    }
}
