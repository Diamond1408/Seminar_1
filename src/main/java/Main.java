import HW_1.Task1;
import HW_1.Task2;
import HW_1.Task3;
public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.printf("%d\n", task1.getTriangleNumber(10));
        Task2 task2 = new Task2();
        System.out.println(task2.getFactorial(5));
        Task3 calculator = new Task3();
        calculator.calculate();
    }
}



