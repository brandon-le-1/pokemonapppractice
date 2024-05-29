package com.pokemon.api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String imagefront;
    private String imageback;
    private int quantity;

    public Pokemon() {}

    public Pokemon(String name, String imagefront, String imageback, int quantity) {
        this.name = name;
        this.imagefront = imagefront;
        this.imageback = imageback;
        this.quantity = quantity;
    }


    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagefront() {
        return this.imagefront;
    }

    public void setImagefront(String imagefront) {
        this.imagefront = imagefront;
    }

    public String getImageback() {
        return this.imageback;
    }

    public void setImageback(String imageback) {
        this.imageback = imageback;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
