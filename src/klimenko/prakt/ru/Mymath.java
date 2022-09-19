package klimenko.prakt.ru;

public class Mymath {
    private int num;

    public Mymath(int num) {
        this.num = num;
    }
    public double Myfactorial(){
        double rez=1;
        for (int i=1; i<=num;i++){
            rez=rez*i;
        }
        return rez;
    }
}
