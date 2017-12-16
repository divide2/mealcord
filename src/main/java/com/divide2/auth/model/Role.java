package com.divide2.auth.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sys_role")
@Data
public class Role {

    @Id
    @GeneratedValue
    private int id;

    private String name;

}
