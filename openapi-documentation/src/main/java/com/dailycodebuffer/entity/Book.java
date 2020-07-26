package com.dailycodebuffer.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String title;

    @Column
    private String author;

    @Column
    private String price;


}
