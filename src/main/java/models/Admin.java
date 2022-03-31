package main.java.models;

import main.java.enums.Role;

public class Admin extends User {
    private Role role;

    public Admin(String username, String password, Role role) {
        super(username, password);
        this.role = role;
    }

    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
