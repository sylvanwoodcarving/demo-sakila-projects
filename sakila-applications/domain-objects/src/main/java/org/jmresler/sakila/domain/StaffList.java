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
@Table(name = "staff_list", catalog = "sakila", schema = "")
public class StaffList implements Serializable {

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
    @Column(nullable = false)
    private short sid;
}
