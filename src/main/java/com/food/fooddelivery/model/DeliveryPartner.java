package com.food.fooddelivery.model;


import java.time.LocalDateTime;

public class DeliveryPartner {

        private long delId;
        private long orderId;
        private LocalDateTime createdOn;
        private String status;
        private long delPartnerId;
        private String to;
        private String from;
        private double distance;

        public DeliveryPartner() {}

        public DeliveryPartner(long delId, long orderId, LocalDateTime createdOn, String status, long delPartnerId, String to, String from, double distance) {
            this.delId = delId;
            this.orderId = orderId;
            this.createdOn = createdOn;
            this.status = status;
            this.delPartnerId = delPartnerId;
            this.to = to;
            this.from = from;
            this.distance = distance;
        }

        public long getDelId() { return delId; }
        public void setDelId(long delId) { this.delId = delId; }

        public long getOrderId() { return orderId; }
        public void setOrderId(long orderId) { this.orderId = orderId; }

        public LocalDateTime getCreatedOn() { return createdOn; }
        public void setCreatedOn(LocalDateTime createdOn) { this.createdOn = createdOn; }

        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }

        public long getDelPartnerId() { return delPartnerId; }
        public void setDelPartnerId(long delPartnerId) { this.delPartnerId = delPartnerId; }

        public String getTo() { return to; }
        public void setTo(String to) { this.to = to; }

        public String getFrom() { return from; }
        public void setFrom(String from) { this.from = from; }

        public double getDistance() { return distance; }
        public void setDistance(double distance) { this.distance = distance; }
    }

