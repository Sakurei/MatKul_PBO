/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo_enkapsulasi;

/**
 *
 * @author User
 */
public class PBO_Enkapsulasi {

    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.addProduct(new Produk(1, "Laptop", 10, 15000000, "Elektronik"));
        manager.addProduct(new Produk(2, "Mouse", 25, 150000, "Aksesoris"));
        manager.addProduct(new Produk(3, "Keyboard", 15, 350000, "Aksesoris"));
        manager.addProduct(new Produk(4, "Monitor", 8, 2500000, "Elektronik"));
        manager.addProduct(new Produk(5, "Printer", 5, 1800000, "Elektronik"));
        manager.addProduct(new Produk(6, "Flashdisk", 40, 80000, "Storage"));
        manager.addProduct(new Produk(7, "SSD", 20, 900000, "Storage"));
        manager.addProduct(new Produk(8, "Headset", 12, 450000, "Audio"));
        manager.addProduct(new Produk(9, "Webcam", 7, 600000, "Aksesoris"));
        manager.addProduct(new Produk(10, "Speaker", 10, 700000, "Audio"));

        manager.addStock(1, 5);
        manager.reduceStock(1, 3);

        manager.showAllProducts();
    }
}
