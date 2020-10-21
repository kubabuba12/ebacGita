package com.grspck.controllers;

import com.grspck.models.Grupa;
import com.grspck.repositories.GrupaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Grupy")
public class GrupyController
{
    @Autowired
    private GrupaRepository grupaRepository;

    @GetMapping
    public List<Grupa> list()
    {
        return grupaRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Grupa get(@PathVariable Integer id)
    {
        return grupaRepository.getOne(id);
    }

    @PostMapping
    public Grupa create(@RequestBody final Grupa grupa)
    {
        return grupaRepository.saveAndFlush(grupa);
    }

    @DeleteMapping
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id)
    {
        grupaRepository.deleteById(id);
    }

    @PutMapping
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Grupa update(@PathVariable Integer id, @RequestBody Grupa grupa)
    {
        Grupa existingGrupa = grupaRepository.getOne(id);
        BeanUtils.copyProperties(grupa, existingGrupa, "id_g rupy");
        return grupaRepository.saveAndFlush(existingGrupa);
    }
}
