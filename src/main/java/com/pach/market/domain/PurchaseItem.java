package com.pach.market.domain;

public class PurchaseItem {
    private int productId;
    private int quantity;
    private double totalProducts;
    private boolean active;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalProducts() {
        return totalProducts;
    }

    public void setTotalProducts(double totalProducts) {
        this.totalProducts = totalProducts;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
