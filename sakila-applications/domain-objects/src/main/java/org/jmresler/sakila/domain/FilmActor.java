/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jmresler.sakila.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author jmres
 */
@Data
@Entity
@Table(name = "film_actor", schema = "sakila")
public class FilmActor implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FilmActorPK filmActorPK;
    @Basic(optional = false)
    @Column(name = "last_update", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;
    @JoinColumn(name = "actor_id", referencedColumnName = "actor_id", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Actor actor;
    @JoinColumn(name = "film_id", referencedColumnName = "film_id", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Film film;

}
