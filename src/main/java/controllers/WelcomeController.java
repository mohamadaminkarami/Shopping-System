package main.java.controllers;

import main.java.enums.Message;
import main.java.enums.Role;
import main.java.models.Admin;
import main.java.models.Customer;
import main.java.models.User;
import main.java.views.Menu;

public class WelcomeController extends Controller {
    private static WelcomeController instance = null;

    private WelcomeController() {

    }

    private static void setInstance(WelcomeController instance) {
        WelcomeController.instance = instance;
    }

    public static WelcomeController getInstance() {
        if (WelcomeController.instance == null) {
            WelcomeController.setInstance(new WelcomeController());
        }

        return WelcomeController.instance;
    }

    private Boolean doesUsernameExist(String username) {
        return User.getUserByUsername(username) != null;
    }

    private Boolean isAlphaNumeric(String password) {
        return password.matches("[a-zA-Z0-9]+");
    }

    private Message validatePassword(String password, String repeatedPassword) {
        if (!password.equals(repeatedPassword))
            return Message.MISMATCH_PASSWORD;
        if (password.length() < 5)
            return Message.SHORT_PASSWORD;
        if (password.length() > 10)
            return Message.LONG_PASSWORD;
        if (!this.isAlphaNumeric(password))
            return Message.NON_ALPHA_NUMERIC_PASSWORD;

        return Message.SUCCESS;

    }

    public Message handleLogin(String username, String password) {
        User user = User.getUserByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            Menu.setLoggedInUser(user);
            return Message.SUCCESS;
        }
        return Message.WRONG_CREDENTIALS;

    }

    public Message handleCreateCustomer(String username, String password, String repeatedPassword) {
        if (this.doesUsernameExist(username)) {
            return Message.USER_EXIST;
        }
        Message message;
        if ((message = this.validatePassword(password, repeatedPassword)) != Message.SUCCESS) {
            return message;
        }
        new Customer(username, password);
        return Message.SUCCESS;
    }

    public Message handleCreateAdmin(String username, String password, String repeatedPassword, String role) {
        if (this.doesUsernameExist(username)) {
            return Message.USER_EXIST;
        }
        Message message;
        if ((message = this.validatePassword(password, repeatedPassword)) != Message.SUCCESS) {
            return message;
        }

        Role adminRole = Role.getRoleFromString(role);
        if (adminRole == null) {
            return Message.INVALID_ROLE;
        }
        new Admin(username, password, adminRole);
        return Message.SUCCESS;
    }

}
