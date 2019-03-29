package com.iamdeok.jpa.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("vegetable")
@Setter
@Getter
@ToString(callSuper = true)
public class Vegetable extends Plant{
    private String nutrient;
}
