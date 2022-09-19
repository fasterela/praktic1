package klimenko.prakt.ru;
import java.lang.Enum;
public class Favseason {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println(season);
        print(Season.SPRING);
        printValues();
    }
    public static void print(Season season){
        switch (season){
            case AUTUMN:
                System.out.println("Я люблю осень!");
                break;
            case SPRING:
                System.out.println("Я люблю весну!");
                break;
            case SUMMER:
                System.out.println("Я люблю лето!");
                break;
            case WINTER:
                System.out.println("Я люблю зиму!");
                break;
        }

    }
    public static void printValues(){
        for (Season v: Season.values()){
            System.out.println(v + " " + v.getAvTemp() + " " + v.getDescription());
        }
    }
}
