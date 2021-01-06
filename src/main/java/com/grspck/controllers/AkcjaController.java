package com.grspck.controllers;

import com.grspck.models.Akcje;
import com.grspck.repositories.AkcjaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("Akcja")
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
        akcje.setOzi_explorer(new byte[]{ 1 });
        return akcjaRepository.saveAndFlush(akcje);
    }

    @DeleteMapping
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id)
    {
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
