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
@Table(name = "sales_by_film_category", schema = "sakila")
public class SalesByFilmCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(nullable = false, length = 25)
    private String category;
    @Column(name = "total_sales", precision = 27, scale = 2)
    private BigDecimal totalSales;

}
