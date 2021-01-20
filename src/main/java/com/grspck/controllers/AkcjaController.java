package com.grspck.controllers;

import com.grspck.models.Akcje;
import com.grspck.models.Archiwum;
import com.grspck.repositories.AkcjaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Akcja")
public class AkcjaController
{
    @Autowired
    private AkcjaRepository akcjaRepository;

    @GetMapping
    public List<Akcje> list()
    {
        return akcjaRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Akcje get(@PathVariable Integer id)
    {
        return akcjaRepository.getOne(id);
    }

    @PostMapping
    public Akcje create(@RequestBody Akcje akcje)
    {
        return akcjaRepository.saveAndFlush(akcje);
    }

    @DeleteMapping
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id)
    {

        List<Akcje> akcje = akcjaRepository.findAll();
        Akcje akcja = akcje.get(id);
        Archiwum archiwum = new Archiwum();
        archiwum.setOpis(akcja.get_opis());
        archiwum.setCzy_znaleziono(akcja.getStatus());
        archiwum.setTytul(akcja.get_nazwa());

        akcjaRepository.deleteById(id);
    }

    @PutMapping
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Akcje update(@PathVariable Integer id, @RequestBody Akcje akcje)
    {
        Akcje existingAkcja = akcjaRepository.getOne(id);
        BeanUtils.copyProperties(akcje, existingAkcja, "id_akcji");
        return akcjaRepository.saveAndFlush(existingAkcja);
    }
}
