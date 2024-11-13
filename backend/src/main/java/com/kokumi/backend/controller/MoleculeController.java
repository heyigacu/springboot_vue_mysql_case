package com.kokumi.backend.controller;

import com.kokumi.backend.pojo.Molecule;
import com.kokumi.backend.pojo.Result;
import com.kokumi.backend.service.MoleculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/molecules")
@RestController
@CrossOrigin
public class MoleculeController {

    @Autowired
    private MoleculeService moleculeService;

    // 直接删除 RedisTemplate 的注入
    // @Autowired
    // private RedisTemplate redisTemplate;

    @GetMapping
    public Result list(){
        List<Molecule> moleculeList = moleculeService.list();
        return Result.success(moleculeList);
    }

    @GetMapping("/{id}")
    public Result get(@PathVariable Integer id){
        Molecule molecule = moleculeService.get(id);
        return Result.success(molecule);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        moleculeService.delete(id);
        return Result.success();
    }

    @PostMapping
    public Result add(@RequestBody Molecule molecule){
        moleculeService.add(molecule);
        return Result.success();
    }

    // 删除与 Redis 相关的代码
    // @PostMapping("/redis/set/{key}/{value}")
    // public Object set(@PathVariable("key") String key,
    //                   @PathVariable("value") String value){
    //     redisTemplate.opsForValue().set(key,value);
    //     return "set success";
    // }
}
