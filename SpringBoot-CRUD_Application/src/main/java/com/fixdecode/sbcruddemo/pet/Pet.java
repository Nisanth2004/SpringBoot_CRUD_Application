package com.fixdecode.sbcruddemo.pet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity // set a table in database
@Table(name="pet")
@NoArgsConstructor // set a default constructor
@Data
public class Pet
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String color;

    public Pet(String name,String color)
    {
        this.name=name;
        this.color = color;
    }
}
