package computer;

public class Monitor extends Computer {
    private double diagonal;

    public Monitor() {
    }

    public Monitor(String brand, String model, double diagonal) {
        super.brand = brand;
        super.model = model;
        this.diagonal = diagonal;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }
}
