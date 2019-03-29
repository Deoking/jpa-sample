package com.iamdeok.jpa.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("fruit")
@Setter
@Getter
@ToString(callSuper = true)
public class Fruit extends Plant {
    private String seed;
}
