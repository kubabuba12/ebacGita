package com.grspck.controllers;

import com.grspck.models.Akcje;
import com.grspck.models.Ratownicy;
import com.grspck.repositories.AkcjaRepository;
import com.grspck.repositories.RatownicyRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Ratownicy")
public class RatownicyController
{
    @Autowired
    private RatownicyRepository ratownicyRepository;

    @GetMapping
    public List<Ratownicy> list()
    {
        return ratownicyRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Ratownicy get(@PathVariable Integer id)
    {
        return ratownicyRepository.getOne(id);
    }

    @PostMapping
    public Ratownicy create(@RequestBody Ratownicy ratownicy)
    {
        return ratownicyRepository.saveAndFlush(ratownicy);
    }

    @DeleteMapping
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id)
    {
        ratownicyRepository.deleteById(id);
    }

    @PutMapping
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Ratownicy update(@PathVariable Integer id, @RequestBody Ratownicy ratownicy)
    {
        Ratownicy existingRatownicy = ratownicyRepository.getOne(id);
        BeanUtils.copyProperties(ratownicy, existingRatownicy, "id_ratownika");
        return ratownicyRepository.saveAndFlush(existingRatownicy);
    }
}
