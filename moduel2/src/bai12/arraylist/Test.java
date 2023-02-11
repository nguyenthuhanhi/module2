package bai12.arraylist;

public class Test {
    public static void main(String[] args) {
        Product sp1 = new Product("MayTinh", "T01", 1500000);
        Product sp2 = new Product("DienThoai", "L01", 18000000);
        Product sp3 = new Product("TiVi", "T01", 5000000);
        ProductManager productManager = new ProductManager();

        productManager.add(sp1);
        productManager.add(sp2);
        productManager.add(sp3);
        productManager.display();
        productManager.edit();
        productManager.remove();
        productManager.search();
        productManager.sortCost();
        productManager.display();

    }
}
