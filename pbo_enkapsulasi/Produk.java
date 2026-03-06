/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo_enkapsulasi;

/**
 *
 * @author User
 */
public class Produk {
    
    private int id;
    private String name;
    private int stock;
    private double price;
    private String category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Stock ga boleh negatif!");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Harga tidak valid!");
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    public Produk(int id, String name) {
        this.id = id;
        this.name = name;
        this.stock = 0;
    }
    
    public Produk(int id, String name, int stock, double price, String category) {
        this.id = id;
        this.name = name;
        setStock(stock);
        setPrice(price);
        this.category = category;
    }
}
