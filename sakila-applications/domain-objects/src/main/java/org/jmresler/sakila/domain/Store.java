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
@Table(catalog = "sakila", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"manager_staff_id"})})
public class Store implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "store_id", nullable = false)
    private Short storeId;
    @Basic(optional = false)
    @Column(name = "last_update", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "storeId")
    private List<Staff> staffList;
    @JoinColumn(name = "address_id", referencedColumnName = "address_id", nullable = false)
    @ManyToOne(optional = false)
    private Address addressId;
    @JoinColumn(name = "manager_staff_id", referencedColumnName = "staff_id", nullable = false)
    @OneToOne(optional = false)
    private Staff managerStaffId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "storeId")
    private List<Inventory> inventoryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "storeId")
    private List<Customer> customerList;

}
