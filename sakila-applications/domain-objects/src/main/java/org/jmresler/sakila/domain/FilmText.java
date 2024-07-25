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
@Table(name = "film_text", schema = "sakila")
public class FilmText implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "film_id", nullable = false)
    private Short filmId;
    @Basic(optional = false)
    @Column(nullable = false, length = 255)
    private String title;
    @Lob
    @Column(length = 65535)
    private String description;
}
