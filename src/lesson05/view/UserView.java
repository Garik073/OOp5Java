package lesson05.view;
import lesson05.controller.UserController;
import lesson05.model.User;
import java.io.File;
import java.io.IOException;

import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {

        // try{
        //     File file = new File("user.txt");
        //     if (file.exists())
        //     file.createNewFile();
        // } catch (IOException e){
        //     System.out.println("Error:" + e);
        // }


       StarMenu();
        
    }

    private static void printMenu(){

        System.out.println("Выберите пункт");
        System.out.println("1:Добавить пользователя");
        System.out.println("2:Удалить пользователя");
        System.out.println("3:По обьему напитка ");
        System.out.println("4:Exit");
        
     
}
    
    private static void StarMenu() {
        
        Scanner scanner = new Scanner(System.in);
        
        if (scanner != null) {
            int key;
            do {
                printMenu();
                System.out.print("Введите номер меню: ");
                key = scanner.nextInt();
                switch (key) {
                    case 1:addNewUser();
                        break;
                    case 2:newRemove();
                        break;
                    case 3:newVolme();
                        break;
                    case 4:
                        System.out.println("Завершение программы...");
                        break;
                    default:
                        System.out.println("Вы ввели неверное значение меню...\n");
                }
            } while (key != 4);
        }
    
}

private static  void addNewUser(){

    UserController userController = new UserController();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Добавте пользователя");
    
    
    String cmd = "";
    String name;
    Integer age;
    
    
    while (!cmd.equals("exit")) {
        
        System.out.print("Введите имя : ");
        name =scanner.nextLine();
        System.out.print("Введитевозрат: ");
        age = scanner.nextInt();
        userController.saveUser(name, age);
        System.out.println(name + age);
        System.out.print("Продолжить? (y/n): ");
        scanner = new Scanner(System.in);
        cmd = scanner.nextLine();
    }
    System.out.println("Вывод Пользователей:");
    for (int i = 0; i < userController.getUserList().size(); i++) {
        System.out.printf("index: %d %s \n",i,userController.getUserList().get(i));
        }
        

    }
      
        

private static void newRemove(){
    UserController userController = new UserController();
    Scanner scanner = new Scanner(System.in);
    Integer a;
    
    
    System.out.println("Вывод Пользователей:");
    for (int i = 0; i < userController.getUserList().size(); i++) {
        System.out.printf("index: %d %s \n",i,userController.getUserList().get(i));
        }
       
        a = scanner.nextInt();

       userController.getUserList().remove(a);
 

    }


private static void newVolme(){
    UserController userController = new UserController();
    Scanner scanner = new Scanner(System.in);
    
}    
}