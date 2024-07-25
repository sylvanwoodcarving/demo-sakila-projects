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
@Table(name = "sales_by_store", catalog = "sakila", schema = "")
public class SalesByStore implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(length = 101)
    private String store;
    @Column(length = 91)
    private String manager;
    @Column(name = "total_sales", precision = 27, scale = 2)
    private BigDecimal totalSales;

}
