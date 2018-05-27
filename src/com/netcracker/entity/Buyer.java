package com.netcracker.entity;

public class Buyer {

    private Integer id;

    private String lastname;

    private String address;

    private Integer discount;

    public Buyer() {
    }

    public Buyer(Integer id, String lastname, String address, Integer discount) {
        this.id = id;
        this.lastname = lastname;
        this.address = address;
        this.discount = discount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", discount=" + discount +
                '}';
    }
}
