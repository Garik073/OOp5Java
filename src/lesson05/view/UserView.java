package lesson05.view;

import lesson05.controller.UserController;

import java.util.Scanner;

public class UserView {
    private static Integer salary;

    public static void main(String[] args) {

        StarMenu();

    }

    private static void printMenu() {

        System.out.println("Выберите пункт");
        System.out.println("1:Добавить пользователя");
        System.out.println("2:Удалить пользователя");
        System.out.println("3:Выберите сумму списания ");
        System.out.println("4:Exit");

    }

    private static void StarMenu() {

        Scanner scanner = new Scanner(System.in);
        UserController userController = new UserController();

        if (scanner != null) {
            int key;
            do {
                printMenu();
                System.out.print("Введите номер меню: ");
                key = scanner.nextInt();
                switch (key) {
                    case 1:
                        addNewUser(scanner, userController);
                        break;
                    case 2:
                        newRemove(scanner, userController);
                        break;
                    case 3:
                        SalaryWriteOff(scanner, userController);
                        break;
                    case 4:
                        System.out.println("Завершение программы...");
                        break;
                    default:
                        System.out.println("Вы ввели неверное значение меню...\n");
                }

            } while (key != 4);
            scanner.close();
        }

    }

    private static void addNewUser(Scanner scanner, UserController userController) {

        System.out.println("Добавте пользователя");

        String cmd = "";
        String name;
        Integer age;
       

        while (!cmd.equals("exit")) {

            scanner.nextLine();
            System.out.print("Введите имя : ");
            name = scanner.nextLine();
            System.out.print("Введите возрат: ");
            age = scanner.nextInt();
            System.out.print("Введите сумму ");
            salary = scanner.nextInt();
            userController.saveUser(name, age, salary);
            System.out.println(name + age);
            scanner.nextLine();
            System.out.print("Продолжить? (y/n): ");

            cmd = scanner.nextLine();
        }
        System.out.println("Вывод Пользователей:");
        for (int i = 0; i < userController.getUserList().size(); i++) {
            System.out.printf("index: %d %s \n", i, userController.getUserList().get(i));
        }

    }

    private static void newRemove(Scanner scanner, UserController userController) {
        
        Integer a;

        System.out.println("Вывод Пользователей:");
        for (int i = 0; i < userController.getUserList().size(); i++) {
            System.out.printf("index: %d %s %d \n", i, userController.getUserList().get(i));
        }

        System.out.println("Введите индекс пользователя: ");
        a = scanner.nextInt();

        userController.removeUser(userController.getUserList().get(a));
        System.out.println("Вывод Пользователей:");
        for (int i = 0; i < userController.getUserList().size(); i++) {
            System.out.printf("index: %d %s \n", i, userController.getUserList().get(i));
        }

    }

    private static void SalaryWriteOff(Scanner scanner, UserController userController) {

        System.out.println("Вывод Пользователей:");
        for (int i = 0; i < userController.getUserList().size(); i++) {
            System.out.printf("index: %d %s \n", i, userController.getUserList().get(i));
        }
        Integer index, a;
        System.out.println("Введите индекс: ");
        index = scanner.nextInt();
        System.out.println("Введите сумму для списания: ");
        a = scanner.nextInt();

        userController.salaryWriteOff(index, salary - a);

        for (int i = 0; i < userController.getUserList().size(); i++) {
            System.out.printf("index: %d %s \n", i, userController.getUserList().get(i));
        }

    }

}
