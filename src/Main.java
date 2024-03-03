import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {

        Scanner coordinate = new Scanner(System.in); // сканнер, с помощью которого будем получать инфу

        while (true){
            System.out.println("Задайте стороны треугольника..."); // выводим пользователю указания к действию и принимаем в переменные данные полученные от пользователя
            System.out.print("Первый катет: ");
            int a = coordinate.nextInt(); // получаем данные от пользователя
            System.out.print("Второй катет: ");
            int b = coordinate.nextInt();
            System.out.print("Гипотенуза: ");
            int c = coordinate.nextInt();

            if (!(a + b > c && b + c > a && c + a > b)){
                System.out.println("Не являются сторонами треугольника!");
            }
            else if ((a == b && (a & b) != c)){
                System.out.println("Равнобедренный треугольник!");
            }
            else if (a == b & b == c){
                System.out.println("Равносторонний треугольник!");
            }
            else if ((pow(a, 2) + pow(b, 2) == pow(c, 2)) |
                        (pow(c, 2) + pow(b, 2) == pow(a, 2)) |
                        (pow(a, 2) + pow(c, 2) == pow(b, 2))){
                    System.out.println("Прямоугольный треугольник!");
            }
            else {
                System.out.println("Обычный треугольникы!");
            }

            System.out.println("\nПродолжить - 1, если Вы хотите завершить программу, нажмите любой символ...");
            var escape = new Scanner(System.in).nextLine(); /* создаём новую переменную типа сканнер,
            чтобы принимать в неё выбор пользователя остаться в программе или выйти,
            потом с помощью оператора switch задаём значение, при которой программа продолжит работу или закончит*/

            switch (escape){
                case "1":
                    System.out.println(" ");
                    continue;
                default:
                    System.exit(0);
            }
        }
    }
}