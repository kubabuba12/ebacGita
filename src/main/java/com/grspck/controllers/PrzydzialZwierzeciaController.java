package com.grspck.controllers;

import com.grspck.models.*;
import com.grspck.repositories.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("PrzydzialZwierzecia")
public class PrzydzialZwierzeciaController
{
    @Autowired
    private PrzydzialZwierzeciaRepository przydzialZwierzeciaRepository;

    @GetMapping
    public List<PrzydzialZwierzecia> list()
    {
        return przydzialZwierzeciaRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public PrzydzialZwierzecia get(@PathVariable Integer id)
    {
        return przydzialZwierzeciaRepository.getOne(id);
    }

    @GetMapping
    @RequestMapping("zwierze/{id}")
    public boolean checkIfZwierzeExists(@PathVariable Integer id)
    {
        List<PrzydzialZwierzecia> przydzialy = przydzialZwierzeciaRepository.findAll();
        for(PrzydzialZwierzecia przydzial : przydzialy)
        {
            if(przydzial.getId_zwierzecia() == id)
            {
                return true;
            }
        }
        return false;
    }

    @PostMapping
    public PrzydzialZwierzecia create(@RequestBody final PrzydzialZwierzecia przydzialZwierzecia)
    {
        return przydzialZwierzeciaRepository.saveAndFlush(przydzialZwierzecia);
    }

    @DeleteMapping
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id)
    {
        przydzialZwierzeciaRepository.deleteById(id);
    }

    @PutMapping
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public PrzydzialZwierzecia update(@PathVariable Integer id, @RequestBody PrzydzialZwierzecia przydzialZwierzecia)
    {
        PrzydzialZwierzecia existingPrzydzialZwierzecia = przydzialZwierzeciaRepository.getOne(id);
        BeanUtils.copyProperties(przydzialZwierzecia, existingPrzydzialZwierzecia, "id_przydzialu_zwierzecia");
        return przydzialZwierzeciaRepository.saveAndFlush(existingPrzydzialZwierzecia);
    }
}
