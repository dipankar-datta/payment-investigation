package com.application.paymentinvestigation.data.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "correspondence")
@Getter
@Setter
@NoArgsConstructor
public class Correspondence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "casebook")
    private String casebook;

    @Column(name = "correspondence_type")
    private String correspondenceType;

    @Column(name = "inbound_outbound")
    private String inboundOutbound;

    @Column(name = "message")
    private String message;

    @Transient
    private String password;
}