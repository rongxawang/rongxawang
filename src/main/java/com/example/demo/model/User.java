package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
//@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private int age;
    private enum sex
    {
        FM,MALE
    }
    private String tel;
}



