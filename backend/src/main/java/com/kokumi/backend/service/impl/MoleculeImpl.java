package com.kokumi.backend.service.impl;

import com.kokumi.backend.pojo.Molecule;
import com.kokumi.backend.service.MoleculeService;
import com.kokumi.backend.mapper.MoleculeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MoleculeImpl implements MoleculeService {

    @Autowired
    private MoleculeMapper moleculeMapper;

    @Override
    public List<Molecule> list() {
        // 直接从 MySQL 获取数据
        List<Molecule> molecules = moleculeMapper.list();
        System.out.println("from mysql");
        System.out.println(molecules);
        return molecules;
    }

    @Override
    public Molecule get(Integer id) {
        // 直接从 MySQL 获取数据
        Molecule molecule = moleculeMapper.getById(id);
        return molecule;
    }

    @Override
    public void delete(Integer id) {
        moleculeMapper.deleteById(id);
    }

    @Override
    public void add(Molecule molecule) {
        molecule.setCreateTime(LocalDateTime.now());
        moleculeMapper.insert(molecule);
    }
}
