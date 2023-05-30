package lesson1;

import java.util.Scanner;

public class Task2 {
    public void hello() {
        System.out.println("Введите имя: ");
        Scanner hello = new Scanner(System.in);
        String name = hello.next();
        System.out.println("Привет " + name);
    }
}
