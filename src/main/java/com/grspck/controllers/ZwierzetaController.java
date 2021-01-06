package com.grspck.controllers;

import com.grspck.models.Zwierzeta;
import com.grspck.repositories.ZwierzetaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("Zwierzeta")
public class ZwierzetaController
{
    @Autowired
    private ZwierzetaRepository zwierzetaRepository;

    @GetMapping
    public List<Zwierzeta> list()
    {
        return zwierzetaRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Zwierzeta get(@PathVariable Integer id)
    {
        return zwierzetaRepository.getOne(id);
    }

    @PostMapping
    public Zwierzeta create(@RequestBody final Zwierzeta zwierzeta)
    { return zwierzetaRepository.saveAndFlush(zwierzeta); }

    @DeleteMapping
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id)
    {
        zwierzetaRepository.deleteById(id);
    }

    @PutMapping
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Zwierzeta update(@PathVariable Integer id, @RequestBody Zwierzeta zwierzeta)
    {
        Zwierzeta existingZwierze = zwierzetaRepository.getOne(id);
        BeanUtils.copyProperties(zwierzeta, existingZwierze, "id_zwierzecia");
        return zwierzetaRepository.saveAndFlush(existingZwierze);
    }
}
