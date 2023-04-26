package Aqil.Bootcamp7.collection.list;


import java.util.LinkedList;
import java.util.List;

public class TaskApp {
    public static void main(String[] args) {
        List<Task> tasks = new LinkedList<>();
        Task task1 = new Task("Java","Learn java","DOING");
        Task task2 = new Task("English","Learn english","DO");
        Task task3 = new Task("Sport","Learn sport","DONE");
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.forEach(System.out::println);
    }
}
