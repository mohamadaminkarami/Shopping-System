package main.java.views;

import main.java.controllers.WelcomeController;
import main.java.enums.Message;

public class WelcomeMenu extends Menu {
    // Singleton Pattern
    private static WelcomeMenu instance = null;

    private WelcomeController controller;

    // Singleton Pattern
    private WelcomeMenu() {
        this.controller = WelcomeController.getInstance();
    }

    // Singleton Pattern
    private static void setInstance(WelcomeMenu instance) {
        WelcomeMenu.instance = instance;
    }

    // Singleton Pattern
    public static WelcomeMenu getInstance() {
        if (WelcomeMenu.instance == null) {
            WelcomeMenu.setInstance(new WelcomeMenu());
        }
        return WelcomeMenu.instance;
    }

    @Override
    public void run() {
        this.showOptions();

        String choice = this.getChoice();

        switch (choice) {
            case "1":
            case "register":
                this.register();
                break;

            case "2":
            case "login":
                this.login();
                break;

            case "3":
            case "exit":
                this.exit();
                break;
            default:
                System.out.println(Message.INVALID_CHOICE);

        }

    }

    private void exit() {
        Menu.getScanner().close();
    }

    private void login() {
        String username = this.getInput("enter username");
        String password = this.getInput("enter password");

        Message message = this.controller.handleLogin(username, password);
        if (message == Message.SUCCESS) {
            MainMenu.getInstance().run();
        } else {
            System.out.println(message);
        }
        this.run();
    }

    private void register() {
        System.out.println("enter register as admin or customer");
        String choice = this.getChoice();

        if (choice.equals("admin")) {
            this.registerAdmin();
        } else if (choice.equals("customer")) {
            this.registerCustomer();
        } else {
            System.out.println(Message.INVALID_CHOICE);
        }
        this.run();
    }

    private void registerCustomer() {
        String username = this.getInput("enter username");
        String password = this.getInput("enter password");
        String repeatedPassword = this.getInput("repeat password");

        Message message = this.controller.handleCreateCustomer(username, password, repeatedPassword);
        System.out.println(message == Message.SUCCESS ? "customer registered successfully" : message);
    }

    private void registerAdmin() {
        String username = this.getInput("enter username");
        String password = this.getInput("enter password");
        String repeatedPassword = this.getInput("repeat password");

        String role = this.getInput("Enter role: (CEO/MANAGER/ACCOUNTANT/SIMPLE)");

        Message message = this.controller.handleCreateAdmin(username, password, repeatedPassword, role);
        System.out.println(message == Message.SUCCESS ? "admin registered successfully" : message);
    }

    @Override
    protected void showOptions() {
        System.out.println("enter one of the options");
        System.out.println("1. register");
        System.out.println("2. login");
        System.out.println("3. exit");

    }

}
