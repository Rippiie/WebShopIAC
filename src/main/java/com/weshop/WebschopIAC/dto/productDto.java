package com.weshop.WebschopIAC.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

public class productDto {

        private UUID product = UUID.randomUUID();
        private String name;
        private String description;
        private double price;
        private String photo;

        public UUID getProduct() {
            return product;
        }

        public void setProduct(UUID product) {
            this.product = product;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }
    }

