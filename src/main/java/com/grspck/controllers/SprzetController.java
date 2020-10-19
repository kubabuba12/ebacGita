package com.grspck.controllers;

import com.grspck.models.Akcje;
import com.grspck.models.Sprzet;
import com.grspck.repositories.AkcjaRepository;
import com.grspck.repositories.SprzetRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Sprzet")
public class SprzetController
{
    @Autowired
    private SprzetRepository sprzetRepository;

    @GetMapping
    public List<Sprzet> list()
    {
        return sprzetRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Sprzet get(@PathVariable Integer id)
    {
        return sprzetRepository.getOne(id);
    }

    @PostMapping
    public Sprzet create(@RequestBody final Sprzet sprzet)
    {
        return sprzetRepository.saveAndFlush(sprzet);
    }

    @DeleteMapping
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id)
    {
        sprzetRepository.deleteById(id);
    }

    @PutMapping
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Sprzet update(@PathVariable Integer id, @RequestBody Sprzet sprzet)
    {
        Sprzet existingSprzet = sprzetRepository.getOne(id);
        BeanUtils.copyProperties(sprzet, existingSprzet, "idSprzetu");
        return sprzetRepository.saveAndFlush(existingSprzet);
    }
}
