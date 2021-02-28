package com.hoaxify.wsservice.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="USERNAME", length = 100)
    private String userName;

    @Column(name = "DISPLAYNAME", length = 100)
    private String displayName;

    @Column(name = "PASSWORD", length = 100)
    private String password;




}
