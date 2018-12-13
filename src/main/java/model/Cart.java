package model;

import java.util.List;

public class Cart {

    private Long id;
    private List<LineItem> items;
    private double grandTotal;


    public Cart (){};

    public Cart(Long id, List<LineItem> items, double grandTotal) {
        this.id = id;
        this.items = items;
        this.grandTotal = grandTotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<LineItem> getItems() {
        return items;
    }

    public void setItems(List<LineItem> items) {
        this.items = items;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = calculateGrandTotal();
    }

    public double calculateGrandTotal(){

        double sum=this.items.stream().mapToDouble(i->i.getTotalPrice()).sum();

        return  sum;
    }

}
