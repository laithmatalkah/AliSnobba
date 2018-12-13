package model;

import java.util.List;

public class LineItem {

    private Long id;
    private Product product;
    private int quantity;
    private double totalPrice;

    public LineItem(){};

    public LineItem(Long id, Product product, int quantity, double totalPrice) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice() {
        this.totalPrice = calculatePrice();
    }

    private  double calculatePrice(){

        return this.quantity*this.product.getPrice();
    }
}
