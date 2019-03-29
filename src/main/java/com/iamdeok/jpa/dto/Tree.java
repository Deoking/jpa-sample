package com.iamdeok.jpa.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("tree")
@Setter
@Getter
@ToString(callSuper = true)
public class Tree extends Plant{
    private int age;
}
