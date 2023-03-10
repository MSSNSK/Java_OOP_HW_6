package personal.views;

import personal.controllers.UserController;
import personal.exception.CommandException;
import personal.model.User;

import java.util.Scanner;

public class ViewUser {

    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Commands com = Commands.NONE;

        while (true) {
            try {
                String command = prompt("Введите команду:\n\nNONE\nREAD\nCREATE\nUPDATE\nLIST\nDELETE\nEXIT\n\n");
                com = Commands.valueOf(command.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Неизвестная команда!");
                continue;
            }
            if (com == Commands.EXIT) return;
            switch (com) {
                case CREATE:
                    try {
                        String firstName = prompt("Имя: ");
                        String lastName = prompt("Фамилия: ");
                        String phone = prompt("Номер телефона: ");
                        userController.saveUser(new User(firstName, lastName, phone));
                    } catch (CommandException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    break;
                case READ:
                    String id = prompt("Идентификатор пользователя: ");
                    try {
                        User user = userController.readUser(id);
                        System.out.println(user);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case LIST:
                    userController.readUsers().forEach(System.out::println);
                    break;
                case UPDATE:
                    String firstName = prompt("Имя: ");
                    String lastName = prompt("Фамилия: ");
                    String phone = prompt("Номер телефона: ");
                    String userID = prompt("Идентификатор пользователя: ");
                    userController.editUser(new User(userID, firstName, lastName, phone));
                case DELETE:
                    String deleteUserID = prompt("Идентификатор пользователя: ");
                    userController.deleteUser(deleteUserID);
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
