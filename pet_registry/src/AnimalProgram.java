import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalProgram {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        AnimalRegistry registry = new AnimalRegistry();

        boolean running = true;
        while (running) {
            System.out.println("Выберите действие:");
            System.out.println("1. Завести новое животное");
            System.out.println("2. Отобразить список команд");
            System.out.println("3. Добавить новую команду");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                break;
            } else if (choice == 1) {
                System.out.println("Введите тип животного (cat, dog, hamster, horse, camel, donkey): ");
                String type = scanner.nextLine();
                System.out.println("Введите имя животного: ");
                String name = scanner.nextLine();
                registry.addAnimal(type, name);
            } else if (choice == 2) {
                System.out.println("Введите имя животного: ");
                String name = scanner.nextLine();
                registry.showAnimalCommands(name);
            } else if (choice == 3) {
                System.out.println("Введите имя животного: ");
                String name = scanner.nextLine();
                System.out.println("Введите новую команду: ");
                String command = scanner.nextLine();
                registry.addAnimalCommands(name, command);
            } else {
                System.out.println("Неверный выбор");
            }
        }
        scanner.close();
    }
}