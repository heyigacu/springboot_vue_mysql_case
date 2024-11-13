package com.kokumi.backend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Molecule implements Serializable {
    private Integer id;
    private String smiles;
    private String type;
    private float affinity;
    private String reference;
    private String img;
    private LocalDateTime createTime;
}
