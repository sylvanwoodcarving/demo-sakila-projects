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
@Table(name = "nicer_but_slower_film_list", schema = "sakila")
public class NicerButSlowerFilmList implements Serializable {

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

    public NicerButSlowerFilmList() {
    }

    public short getFid() {
        return fid;
    }

    public void setFid(short fid) {
        this.fid = fid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Short getLength() {
        return length;
    }

    public void setLength(Short length) {
        this.length = length;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }
    
}
