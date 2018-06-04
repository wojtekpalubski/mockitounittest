package com.wpe.unittest.model;


import java.util.Objects;

public class Item {
    private final int quantity;

    public int getQuantity() {
        return quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    private final int id;
    private final String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return getQuantity() == item.getQuantity() &&
                getId() == item.getId() &&
                getPrice() == item.getPrice() &&
                Objects.equals(getName(), item.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getQuantity(), getId(), getName(), getPrice());
    }

    private final int price;


    @Override
    public String toString() {
        return "Item{" +
                "quantity=" + quantity +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Item(int id, String name, int price, int quantity) {
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
}
