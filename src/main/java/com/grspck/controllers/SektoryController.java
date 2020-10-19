package com.grspck.controllers;

import com.grspck.models.Akcje;
import com.grspck.models.Sektory;
import com.grspck.models.Sprzet;
import com.grspck.repositories.AkcjaRepository;
import com.grspck.repositories.SektoryRepository;
import com.grspck.repositories.SprzetRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Sektory")
public class SektoryController
{
    @Autowired
    private SektoryRepository sektoryRepository;

    @GetMapping
    public List<Sektory> list()
    {
        return sektoryRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Sektory get(@PathVariable Integer id)
    {
        return sektoryRepository.getOne(id);
    }

    @PostMapping
    public Sektory create(@RequestBody final Sektory sektory)
    {
        return sektoryRepository.saveAndFlush(sektory);
    }

    @DeleteMapping
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id)
    {
        sektoryRepository.deleteById(id);
    }

    @PutMapping
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Sektory update(@PathVariable Integer id, @RequestBody Sektory sektory)
    {
        Sektory existingSektory = sektoryRepository.getOne(id);
        BeanUtils.copyProperties(sektory, existingSektory, "idSektora");
        return sektoryRepository.saveAndFlush(existingSektory);
    }
}
