package com.grspck.controllers;

import com.grspck.models.PrzydzialRatownikow;
import com.grspck.repositories.PrzydzialRatownikowRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("PrzydzialRatownikow")
public class PrzydzialRatownikowController
{
    @Autowired
    private PrzydzialRatownikowRepository przydzialRatownikowRepository;

    @GetMapping
    public List<PrzydzialRatownikow> list()
    {
        return przydzialRatownikowRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public PrzydzialRatownikow get(@PathVariable Integer id)
    {
        return przydzialRatownikowRepository.getOne(id);
    }

    @GetMapping
    @RequestMapping("ratownik/{id}")
    public boolean checkIfRatownikExists(@PathVariable Integer id)
    {
        List<PrzydzialRatownikow> przydzialy = przydzialRatownikowRepository.findAll();
        for(PrzydzialRatownikow przydzial : przydzialy)
        {
            if(przydzial.getId_ratownika() == id)
            {
                return true;
            }
        }
        return false;
    }

    @PostMapping
    public PrzydzialRatownikow create(@RequestBody final PrzydzialRatownikow przydzialRatownikow)
    {
        return przydzialRatownikowRepository.saveAndFlush(przydzialRatownikow);
    }

    @DeleteMapping
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id)
    {
        przydzialRatownikowRepository.deleteById(id);
    }

    @PutMapping
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public PrzydzialRatownikow update(@PathVariable Integer id, @RequestBody PrzydzialRatownikow przydzialRatownikow)
    {
        PrzydzialRatownikow existingPrzydzialRatownikow = przydzialRatownikowRepository.getOne(id);
        BeanUtils.copyProperties(przydzialRatownikow, existingPrzydzialRatownikow, "id_przydzialu_ratownika");
        return przydzialRatownikowRepository.saveAndFlush(existingPrzydzialRatownikow);
    }
}
