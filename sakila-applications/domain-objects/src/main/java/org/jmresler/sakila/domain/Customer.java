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
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "customer_id", nullable = false)
    private Short customerId;
    @Basic(optional = false)
    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;
    @Basic(optional = false)
    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;
    @Column(length = 50)
    private String email;
    @Basic(optional = false)
    @Column(nullable = false)
    private boolean active;
    @Basic(optional = false)
    @Column(name = "create_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Column(name = "last_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerId")
    private List<Rental> rentalList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerId")
    private List<Payment> paymentList;
    @JoinColumn(name = "address_id", referencedColumnName = "address_id", nullable = false)
    @ManyToOne(optional = false)
    private Address addressId;
    @JoinColumn(name = "store_id", referencedColumnName = "store_id", nullable = false)
    @ManyToOne(optional = false)
    private Store storeId;

}
