package Week1.SmartTaskManager.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static int idCounter = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== SMART TASK MANAGER =====");
            System.out.println("1. Add Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    addTask(sc);
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private static void addTask(Scanner sc) {
        System.out.print("Enter task title: ");
        String title = sc.nextLine();

        System.out.print("Enter task description: ");
        String description = sc.nextLine();

        System.out.print("Enter due date : ");
        String date = sc.nextLine();

        Task task = new Task(idCounter++, title, description, date);
        tasks.add(task);

        System.out.println("Task added successfully!");
    }

    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available!");
            return;
        }

        System.out.println("\n---- YOUR TASKS ----");
        for (Task t : tasks) {
            System.out.println(t);
        }
    }
}
