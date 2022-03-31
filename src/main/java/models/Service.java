package main.java.models;

public class Service extends Saleable {
    private final Customer servant;

    public Service(String name, int price, Customer servant) {
        super(name, price);
        this.servant = servant;
    }

    public Customer getServant() {
        return this.servant;
    }

    @Override
    public String toString() {
        return super.toString() + "servant" + this.getServant();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Service)) {
            return false;
        }

        Service service = (Service) obj;

        return super.equals(service) && this.getServant().equals(service.getServant());
    }
}
