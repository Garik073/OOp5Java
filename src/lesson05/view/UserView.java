package lesson05.view;

import lesson05.controller.UserController;
import lesson05.model.User;
import java.io.File;
import java.io.IOException;

import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {

        // try{
        // File file = new File("user.txt");
        // if (file.exists())
        // file.createNewFile();
        // } catch (IOException e){
        // System.out.println("Error:" + e);
        // }

        StarMenu();

    }

    private static void printMenu() {

        System.out.println("Выберите пункт");
        System.out.println("1:Добавить пользователя");
        System.out.println("2:Удалить пользователя");
        System.out.println("3:По обьему напитка ");
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
                        addNewUser(scanner,userController);
                        break;
                    case 2:
                        newRemove(scanner,userController);
                        break;
                    case 3:
                        SalaryWriteOff(scanner,userController);
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
        Integer salary;

        while (!cmd.equals("exit")) {

            scanner.nextLine();
            System.out.print("Введите имя : ");
            name = scanner.nextLine();
            System.out.print("Введите возрат: ");
            age = scanner.nextInt();
            System.out.print("Введите сумму ");
            salary = scanner.nextInt();
            userController.saveUser(name, age,salary);
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

    private static void newRemove(Scanner scanner, UserController userController ) {
        //UserController userController = new UserController();
        
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
        
            Integer index , salary ;
            index = scanner.nextInt();
            salary = scanner.nextInt

        System.out.println("Вывод Пользователей:");
        System.out.println("Вывод Пользователей:");
        for (int i = 0; i < userController.getUserList().size(); i++) {
            System.out.printf("index: %d %s %d \n", i, userController.getUserList().get(i));
            
            userController.salaryWriteOff(index,salary);
            
        }

        }

        

    }
