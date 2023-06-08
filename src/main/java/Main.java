//import HW2.Task1;
//import HW2.Task2;
//
//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) {
//        Task1 task1 = new Task1();
//        String queryPart = "select * from students where ";
//        String json = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
//        String sqlQuery = task1.generateSqlQuery(queryPart, json);
//        System.out.println(sqlQuery);
//        Task2 task2 = new Task2();
//        try {
//            String str = task2.readJsonFromFile("students.json");
//            task2.generateTextFromJson(str);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}

import HW3.Task1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HW3.Task1 allTasks = new HW3.Task1();
        ArrayList<Integer> array = allTasks.generateIntList(10, 100);
        System.out.println(array.toString());
        System.out.printf("min: %d\n", allTasks.getMinNumber(array));
        System.out.printf("max: %d\n", allTasks.getMaxNumber(array));
        System.out.printf("average: %d\n", allTasks.getAverage(array));
        System.out.printf("removed all even number:\n%s\n", allTasks.removeEvenNumbers(array));
    }
}



