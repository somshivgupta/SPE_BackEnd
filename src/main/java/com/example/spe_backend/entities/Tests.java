package com.example.spe_backend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "test_name")
public class Tests {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name") private String name;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JsonIgnore
    private List<TestQuestions> testQuestions;

}
