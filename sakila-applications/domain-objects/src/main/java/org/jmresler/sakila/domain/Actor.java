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
public class Actor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "actor_id", nullable = false)
    private Short actorId;
    @Basic(optional = false)
    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;
    @Basic(optional = false)
    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;
    @Basic(optional = false)
    @Column(name = "last_update", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actor")
    private List<FilmActor> filmActorList;
}
