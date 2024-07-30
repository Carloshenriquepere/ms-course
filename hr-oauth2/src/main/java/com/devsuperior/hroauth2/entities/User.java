package com.devsuperior.hroauth2.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User implements Serializable {
    private static final long serialVersionUID = 1L;


    private Long id;
    private String name;
    private String email;
    private String password;

    private Set<Role> roles = new HashSet<>();
}
