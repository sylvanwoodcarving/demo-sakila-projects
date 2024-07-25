/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jmresler.sakila.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author jmres
 */
@Data
@Entity
@Table(name = "film_list", schema = "sakila")
public class FilmList implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(nullable = false)
    private short fid;
    @Basic(optional = false)
    @Column(nullable = false, length = 128)
    private String title;
    @Lob
    @Column(length = 65535)
    private String description;
    @Column(length = 25)
    private String category;
    @Basic(optional = false)
    @Column(nullable = false, precision = 4, scale = 2)
    private BigDecimal price;
    private Short length;
    @Column(length = 5)
    private String rating;
    @Lob
    @Column(length = 65535)
    private String actors;

 }
