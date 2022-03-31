package main.java.enums;

public enum Role {
    CEO,
    MANAGER,
    ACCOUNTANT,
    SIMPLE;

    public static Role getRoleFromString(String role) {
        switch (role.toLowerCase()) {
            case "ceo":
                return CEO;
            case "manager":
                return MANAGER;
            case "accountant":
                return ACCOUNTANT;
            case "simple":
                return SIMPLE;
            default:
                return null;

        }
    }

}
