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
    public Long id;

    @Column(name = "casebook")
    public String casebook;

    @Column(name = "correspondence_type")
    public String correspondenceType;

    @Column(name = "inbound_outbound")
    public String inboundOutbound;

    @Column(name = "message")
    public String message;
}