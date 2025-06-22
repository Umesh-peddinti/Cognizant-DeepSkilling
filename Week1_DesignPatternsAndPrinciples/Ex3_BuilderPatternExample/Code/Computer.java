package Week1_DesignPatternsAndPrinciples.Ex3_BuilderPatternExample.Code;

public class Computer {
    // Required attributes
    private String CPU;
    private String RAM;

    // Optional attributes
    private String storage;
    private boolean hasGraphicsCard;

    // Private constructor: only Builder can call this
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
    }

    // Getters for displaying configuration
    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return storage;
    }

    public boolean hasGraphicsCard() {
        return hasGraphicsCard;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage
                + ", GraphicsCard=" + hasGraphicsCard + "]";
    }

    // Nested static Builder class
    public static class Builder {
        // Required
        private String CPU;
        private String RAM;

        // Optional
        private String storage;
        private boolean hasGraphicsCard;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
