import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
//        Написать лямбда выражение, которое принимает на вход число и возвращает значение
//        “Положительное число”, “Отрицательное число” или  “Ноль”.
//        Используем функциональный интерфейс Function.
       Function<Integer,String> func;
       func=a->{
           if(a>0) return  "Положительное число";
           else if(a<0) return "Отрицательное число";
           return "Ноль";
       };
        System.out.println("Введите число");
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        System.out.println(func.apply(a));

    }
}