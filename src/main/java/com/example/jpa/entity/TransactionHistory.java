package com.example.jpa.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transaction_history")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TransactionHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "transactionDate")
    private Date transactionDate;

    @Column(name = "transaction_type")
    private String transactionType;

    @Column(name = "transaction_amount")
    private double transactionAmount;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @Column(name = "sub_total")
    private double subTotal;
    @Column(name = "description")
    private String description;




    @Override
    public String toString() {
        return "TransactionHistory{" +
                "id=" + id +
                ", transactionDate=" + transactionDate +
                ", transactionType='" + transactionType + '\'' +
                ", transactionAmount=" + transactionAmount +
                ", person=" + person +
                ", subTotal=" + subTotal +
                ", description='" + description + '\'' +
                '}';
    }
}
