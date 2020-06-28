package com.dawidciechowski.model;

import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Game {

    private UUID id;
    private String name;
    private float price;
    private boolean inStock;
    private int stock;
     

    public Game() {
    }

    public Game(@JsonProperty("id") UUID id, @JsonProperty("name") String name, @JsonProperty("price") float price,
    @JsonProperty("inStock") boolean inStock, @JsonProperty("stock") int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.stock = stock;
    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isInStock() {
        return this.inStock;
    }

    public boolean getInStock() {
        return this.inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Game id(UUID id) {
        this.id = id;
        return this;
    }

    public Game name(String name) {
        this.name = name;
        return this;
    }

    public Game price(float price) {
        this.price = price;
        return this;
    }

    public Game inStock(boolean inStock) {
        this.inStock = inStock;
        return this;
    }

    public Game stock(int stock) {
        this.stock = stock;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Game)) {
            return false;
        }
        Game game = (Game) o;
        return Objects.equals(id, game.id) && Objects.equals(name, game.name) && price == game.price && inStock == game.inStock && stock == game.stock;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, inStock, stock);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", price='" + getPrice() + "'" +
            ", inStock='" + isInStock() + "'" +
            ", stock='" + getStock() + "'" +
            "}";
    }
    
    
}