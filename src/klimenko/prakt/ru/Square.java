package klimenko.prakt.ru;

public class Square {
    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    public double area(){
        return a*a;
    }
    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }
    public Square(double a) {
        this.a = a;
    }
}
