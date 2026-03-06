/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo_enkapsulasi;

/**
 *
 * @author User
 */
public class Manager {
    
    private Produk[] produk = new Produk[50];
    private int count;
    
    public void addProduct(Produk p) {
        produk[count] = p;
        count++;
    }
    
    public Produk findProduct(int id) {
        for (int i = 0; i < count; i++) {
            if (produk[i].getId() == id) {
                return produk[i];
            }
        }
        return null;
    }
    
    public void addStock(int id, int jumlah) {
        Produk p = findProduct(id);
        if (p != null && jumlah > 0) {
            p.setStock(p.getStock() + jumlah);
        }
    }
    
    public void reduceStock(int id, int jumlah) {
        Produk p = findProduct(id);
        if (p != null && jumlah <= p.getStock()) {
            p.setStock(p.getStock() - jumlah);
        }
    }
    
    public void checkStock(int id) {
        Produk p = findProduct(id);
        if (p != null) {
            System.out.println("Produk: " + p.getName());
            System.out.println("Stock: " + p.getStock());
        } else {
            System.out.println("Produk tidak ditemukan");
        }
    }
    
}
