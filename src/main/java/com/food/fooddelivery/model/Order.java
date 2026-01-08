package com.food.fooddelivery.model;

import java.time.LocalDateTime;

public class Order {
    private long orderId;
    private String invoice;
    private long userId;
    private long restId;
    private String items;
    private double amount;
    private LocalDateTime date;
    private int quantity;

    public Order() {}

    public Order(long orderId, String invoice, long userId, long restId, String items,
                 double amount, LocalDateTime date, int quantity) {
        this.orderId = orderId;
        this.invoice = invoice;
        this.userId = userId;
        this.restId = restId;
        this.items = items;
        this.amount = amount;
        this.date = date;
        this.quantity = quantity;
    }

    public long getOrderId() { return orderId; }
    public void setOrderId(long orderId) { this.orderId = orderId; }

    public String getInvoice() { return invoice; }
    public void setInvoice(String invoice) { this.invoice = invoice; }

    public long getUserId() { return userId; }
    public void setUserId(long userId) { this.userId = userId; }

    public long getRestId() { return restId; }
    public void setRestId(long restId) { this.restId = restId; }

    public String getItems() { return items; }
    public void setItems(String items) { this.items = items; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public LocalDateTime getDate() { return date; }
    public void setDate(LocalDateTime date) { this.date = date; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}