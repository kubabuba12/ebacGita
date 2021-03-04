package com.grspck.controllers;

import com.grspck.models.*;
import com.grspck.repositories.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("PrzydzialSprzetu")
public class PrzydzialSprzetuController
{
    @Autowired
    private PrzydzialSprzetuRepository przydzialSprzetuRepository;

    @GetMapping
    public List<PrzydzialSprzetu> list()
    {
        return przydzialSprzetuRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public PrzydzialSprzetu get(@PathVariable Integer id)
    {
        return przydzialSprzetuRepository.getOne(id);
    }
    @GetMapping
    @RequestMapping("sprzet/{id}")
    public boolean checkIfSprzetExists(@PathVariable Integer id)
    {
        List<PrzydzialSprzetu> przydzialy = przydzialSprzetuRepository.findAll();
        for(PrzydzialSprzetu przydzial : przydzialy)
        {
            if(przydzial.getId_sprzetu() == id)
            {
                return true;
            }
        }
        return false;
    }

    @PostMapping
    public PrzydzialSprzetu create(@RequestBody final PrzydzialSprzetu przydzialSprzetu)
    {
        return przydzialSprzetuRepository.saveAndFlush(przydzialSprzetu);
    }

    @DeleteMapping
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id)
    {
        przydzialSprzetuRepository.deleteById(id);
    }

    @PutMapping
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public PrzydzialSprzetu update(@PathVariable Integer id, @RequestBody PrzydzialSprzetu przydzialSprzetu)
    {
        PrzydzialSprzetu existingPrzydzialSprzetu = przydzialSprzetuRepository.getOne(id);
        BeanUtils.copyProperties(przydzialSprzetu, existingPrzydzialSprzetu, "id_przydzialu_sprzetu");
        return przydzialSprzetuRepository.saveAndFlush(existingPrzydzialSprzetu);
    }
}
