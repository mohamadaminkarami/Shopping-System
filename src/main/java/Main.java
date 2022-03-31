package main.java;

import main.java.views.WelcomeMenu;

public class Main {
    public static void main(String[] args) {
        WelcomeMenu welcomeMenu = WelcomeMenu.getInstance();
        welcomeMenu.run();
    }

}
