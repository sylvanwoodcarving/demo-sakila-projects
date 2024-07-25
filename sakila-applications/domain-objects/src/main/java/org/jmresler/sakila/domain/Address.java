/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jmresler.sakila.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jmres
 */
@Data
@Entity
@Table(schema = "sakila")
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "address_id", nullable = false)
    private Short addressId;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String address;
    @Column(length = 50)
    private String address2;
    @Basic(optional = false)
    @Column(nullable = false, length = 20)
    private String district;
    @Column(name = "postal_code", length = 10)
    private String postalCode;
    @Basic(optional = false)
    @Column(nullable = false, length = 20)
    private String phone;
    @Basic(optional = false)
    @Lob
    @Column(nullable = false)
    private byte[] location;
    @Basic(optional = false)
    @Column(name = "last_update", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;
    @JoinColumn(name = "city_id", referencedColumnName = "city_id", nullable = false)
    @ManyToOne(optional = false)
    private City cityId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "addressId")
    private List<Staff> staffList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "addressId")
    private List<Store> storeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "addressId")
    private List<Customer> customerList;

}
