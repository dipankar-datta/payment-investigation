package com.application.paymentinvestigation.data.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Table(name = "dropdown_data")
@Entity
public class DropdownData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;

    @Column(name = "field_name")
    public String fieldName;

    @Column(name = "field_key")
    public String fieldKey;

    @Column(name = "field_value")
    public String fieldValue;

    @Column(name = "is_active")
    public String isActive;

}