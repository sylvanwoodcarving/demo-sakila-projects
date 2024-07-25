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
@Embeddable
public class FilmActorPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "actor_id", nullable = false)
    private short actorId;
    @Basic(optional = false)
    @Column(name = "film_id", nullable = false)
    private short filmId;

}
