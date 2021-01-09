package com.grspck.controllers;

import com.grspck.models.Archiwum;
import com.grspck.repositories.ArchiwumRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("Archiwum")
public class ArchiwumController
{
    @Autowired
    private ArchiwumRepository archiwumRepository;

    @GetMapping
    public List<Archiwum> list()
    {
        return archiwumRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Archiwum get(@PathVariable Integer id)
    {
        return archiwumRepository.getOne(id);
    }

    @PostMapping
    public Archiwum create(@RequestBody final Archiwum archiwum)
    {
        return archiwumRepository.saveAndFlush(archiwum);
    }

    @DeleteMapping
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id)
    {
        archiwumRepository.deleteById(id);
    }

    @PutMapping
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Archiwum update(@PathVariable Integer id, @RequestBody Archiwum archiwum)
    {
        Archiwum existingArchwium = archiwumRepository.getOne(id);
        BeanUtils.copyProperties(archiwum, existingArchwium, "id_archiwum");
        return archiwumRepository.saveAndFlush(existingArchwium);
    }
}
