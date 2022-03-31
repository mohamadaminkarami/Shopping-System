package main.java.views;

import java.util.ArrayList;

import main.java.controllers.MainController;
import main.java.enums.Message;
import main.java.models.Admin;
import main.java.models.Customer;
import main.java.models.Saleable;
import main.java.models.User;

public class MainMenu extends Menu {
    private static MainMenu instance = null;

    private final MainController controller;

    private MainMenu() {
        this.controller = MainController.getInstance();

    }

    private static void setInstance(MainMenu instance) {
        MainMenu.instance = instance;
    }

    public static MainMenu getInstance() {
        if (MainMenu.instance == null) {
            MainMenu.setInstance(new MainMenu());
        }

        return MainMenu.instance;
    }

    private void showAdminOptions() {
        System.out.println("2. add new product");
        System.out.println("3. edit product");
        System.out.println("4. profile");

    }

    private void showCustomerOptions() {
        System.out.println("2. buy a product");
        System.out.println("3. add new service");
        System.out.println("4. add comment");
        System.out.println("5. profile");

    }

    @Override
    public void run() {
        this.showOptions();

        String choice = this.getChoice();

        User loggedInUser = Menu.getLoggedInUser();

        if (loggedInUser instanceof Admin) {
            this.handleAdminChoice(choice);
        } else if (loggedInUser instanceof Customer) {
            this.handleCustomerChoice(choice);
        }

    }

    private void handleCustomerChoice(String choice) {
        switch (choice) {
            case "1":
                this.showProductsAndServices();
                break;
            case "2":
                this.buyProduct();
                break;
            case "3":
                this.addService();
                break;

            case "4":
                this.addComment();
                break;

            case "5":
                this.goToProfile();
                break;

            default:
                System.out.println(Message.INVALID_CHOICE);
        }
    }

    private void handleAdminChoice(String choice) {
        switch (choice) {
            case "1":
                this.showProductsAndServices();
                break;
            case "2":
                this.addProduct();
                break;
            case "3":
                this.editProduct();
                break;
            case "4":
                this.goToProfile();
                break;
            default:
                System.out.println(Message.INVALID_CHOICE);
        }
    }

    private void goToProfile() {
    }

    private void editProduct() {
    }

    private void addProduct() {
        System.out.println("enter information");
        String name = this.getInput("enter name");
        int price = Integer.parseInt(this.getInput("enter price"));
        int capacity = Integer.parseInt(this.getInput("enter capacity"));
        String description = this.getInput("enter description");

        Message message = this.controller.handleAddProduct(name, price, capacity, description);
        System.out.println(message == Message.SUCCESS ? "product added successfully" : message);
        this.run();
    }

    private void showProductsAndServices() {
        ArrayList<Saleable> allItems = this.controller.handleShowProductAndServices();

        for (Saleable item : allItems) {
            System.out.println(item);
        }

        this.run();
    }

    private void addComment() {
    }

    private void addService() {
    }

    private void buyProduct() {
    }

    @Override
    protected void showOptions() {
        System.out.println("enter one of the choices");
        System.out.println("1. show products and services");

        User loggedInUser = Menu.getLoggedInUser();

        if (loggedInUser instanceof Admin) {
            this.showAdminOptions();
        } else if (loggedInUser instanceof Customer) {
            this.showCustomerOptions();
        }
    }

}
