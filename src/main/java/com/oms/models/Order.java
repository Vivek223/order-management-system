package com.oms.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "ORDERS")
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int orderId;

    private String ipid;
    private String comment;

    public Order() {
    }

    public Order(String ipid, String comment) {
        this.ipid = ipid;
        this.comment = comment;
    }

    public Order(int orderId, String ipid, String comment) {
        this.orderId = orderId;
        this.ipid = ipid;
        this.comment = comment;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getIpid() {
        return ipid;
    }

    public String getComment() {
        return comment;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setIpid(String ipid) {
        this.ipid = ipid;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
