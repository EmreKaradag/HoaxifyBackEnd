package com.hoaxify.wsservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@Table(name = "USER")
@NoArgsConstructor
@AllArgsConstructor
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



