1. Class Produk
    Class ini digunakan untuk merepresentasikan data produk dalam inventory.
  Atribut seperti id, name, stock, price, dan category disimpan sebagai private untuk menerapkan encapsulation.
  Class ini juga memiliki getter dan setter untuk mengakses dan memodifikasi data dengan aman.

2. Class Manager
    Class ini berfungsi untuk mengelola semua produk dalam sistem inventory.
  Manager menyimpan daftar produk menggunakan array Produk dan menyediakan berbagai method seperti:
    - addProduct() untuk menambahkan produk
  
    - findProduct() untuk mencari produk berdasarkan ID
  
    - addStock() untuk menambah stok

    - reduceStock() untuk mengurangi stok

    - checkStock() untuk mengecek stok

    - showAllProducts() untuk menampilkan semua produk

  Class ini bertindak sebagai pengatur logika sistem inventory.

3. Class Main
    Class Main merupakan entry point program yang menjalankan sistem inventory.
   Di dalam class ini dibuat objek Manager dan ditambahkan beberapa produk sebagai contoh data.
   Class ini juga digunakan untuk memanggil method seperti penambahan stok, pengurangan stok, dan menampilkan produk.
