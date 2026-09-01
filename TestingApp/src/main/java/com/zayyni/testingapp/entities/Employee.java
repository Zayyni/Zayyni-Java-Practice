package com.zayyni.testingapp.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double salary;
    @Column(unique = true)
    private String email;

    @ManyToOne(fetch = FetchType.EAGER)
    private Department department;
}
