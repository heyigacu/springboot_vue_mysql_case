package com.kokumi.backend.mapper;

import com.kokumi.backend.pojo.Molecule;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface MoleculeMapper {
    @Select("select * from molecule")
    List<Molecule> list();

    @Select("select * from molecule where id = #{id}")
    Molecule getById(Integer id);

    @Delete("delete from molecule where id = #{id}")
    void deleteById(Integer id);

    @Insert("insert into molecule(smiles, type, affinity, reference, img, create_time) values(#{smiles},#{type},#{affinity},#{reference},#{img},#{createTime})")
    void insert(Molecule molecule);





}
