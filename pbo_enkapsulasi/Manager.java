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
    
    
}
