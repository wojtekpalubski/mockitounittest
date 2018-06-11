package com.wpe.unittest.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Objects;

/**
 * http://localhost:8080/h2-console
 * org.h2.Driver
 * jdbc:h2:mem:testdb
 * user sa
 * haslo puste
 */

@Entity
public class Item {
    @Id
    private int id;
    private int quantity;
    private String name;
    private int price;

    @Transient
    private int value;

    public Item() {
    }

    public Item(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

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

    @Override
    public String toString() {
        return "Item{" +
                "quantity=" + quantity +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
