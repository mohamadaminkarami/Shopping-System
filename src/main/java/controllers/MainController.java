package main.java.controllers;

import java.util.ArrayList;

import main.java.enums.Message;
import main.java.models.Product;
import main.java.models.Saleable;

public class MainController extends Controller {
    private static MainController instance = null;

    private MainController() {

    }

    private static void setInstance(MainController instance) {
        MainController.instance = instance;
    }

    public static MainController getInstance() {
        if (MainController.instance == null) {
            MainController.setInstance(new MainController());
        }

        return MainController.instance;
    }

    public ArrayList<Saleable> handleShowProductAndServices() {
        return Saleable.getAllItems();
    }

    public Message handleAddProduct(String name, int price, int capacity, String description) {
        for (Saleable item : Saleable.getAllItems()) {
            if (item instanceof Product && item.getName().equals(name) && item.getPrice() == price
                    && ((Product) item).getCapacity() == capacity
                    && ((Product) item).getDescription().equals(description)) {
                return Message.PRODUCT_EXIST;
            }
        }

        new Product(name, price, description, capacity);

        return Message.SUCCESS;

    }

}
