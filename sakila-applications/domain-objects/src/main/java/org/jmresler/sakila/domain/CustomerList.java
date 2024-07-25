/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jmresler.sakila.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

/**
 *
 * @author jmres
 */
@Data
@Entity
@Table(name = "customer_list", schema = "sakila")
public class CustomerList implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(nullable = false)
    private short id;
    @Column(length = 91)
    private String name;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String address;
    @Column(name = "zip code", length = 10)
    private String zipCode;
    @Basic(optional = false)
    @Column(nullable = false, length = 20)
    private String phone;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String city;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String country;
    @Basic(optional = false)
    @Column(nullable = false, length = 6)
    private String notes;
    @Basic(optional = false)
    @Column(nullable = false)
    private short sid;

    public CustomerList() {
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public short getSid() {
        return sid;
    }

    public void setSid(short sid) {
        this.sid = sid;
    }
    
}
