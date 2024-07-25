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
@Table(name = "actor_info", schema = "sakila")
public class ActorInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "actor_id", nullable = false)
    private short actorId;
    @Basic(optional = false)
    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;
    @Basic(optional = false)
    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;
    @Lob
    @Column(name = "film_info", length = 65535)
    private String filmInfo;
}
