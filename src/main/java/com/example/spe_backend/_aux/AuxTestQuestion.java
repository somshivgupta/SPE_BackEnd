package com.example.spe_backend._aux;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuxTestQuestion {
    private Integer id;
    private Integer testId;
    private String question;
}