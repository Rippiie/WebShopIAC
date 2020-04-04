package com.weshop.WebschopIAC.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private UUID discount;
    private Date startDate;
    private Date endDate;
    private double discountPrice;
    private String advertisingText;

    @ManyToMany(targetEntity = Product.class)
    private List producten;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getDiscount() {
        return discount;
    }

    public void setDiscount(UUID discount) {
        this.discount = discount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getAdvertisingText() {
        return advertisingText;
    }

    public void setAdvertisingText(String advertisingText) {
        this.advertisingText = advertisingText;
    }

    public List getProducten() {
        return producten;
    }

    public void setProducten(List producten) {
        this.producten = producten;
    }
}
