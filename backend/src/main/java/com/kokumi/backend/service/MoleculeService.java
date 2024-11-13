package com.kokumi.backend.service;

import com.kokumi.backend.pojo.Molecule;

import java.util.List;

public interface MoleculeService {

    List<Molecule> list();

    Molecule get(Integer id);

    void delete(Integer id);

    void add(Molecule molecule);
}
