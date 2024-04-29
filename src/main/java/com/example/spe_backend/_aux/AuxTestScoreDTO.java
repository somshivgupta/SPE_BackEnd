package com.example.spe_backend._aux;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuxTestScoreDTO {
    private String email;
    private String stage;
    private Integer obtainedScore;
    private Integer totalScore;
    private String name;
}