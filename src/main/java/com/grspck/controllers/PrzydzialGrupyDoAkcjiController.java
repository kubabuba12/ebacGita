package com.grspck.controllers;

import com.grspck.models.PrzydzialGrupyDoAkcji;
import com.grspck.models.PrzydzialRatownikow;
import com.grspck.repositories.PrzydzialGrupyDoAkcjiRepository;
import com.grspck.repositories.PrzydzialRatownikowRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/PrzydzialGrupyDoAkcji")
public class PrzydzialGrupyDoAkcjiController
{
    @Autowired
    private PrzydzialGrupyDoAkcjiRepository przydzialGrupyDoAkcjiRepository;

    @GetMapping
    public List<PrzydzialGrupyDoAkcji> list()
    {
        return przydzialGrupyDoAkcjiRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public PrzydzialGrupyDoAkcji get(@PathVariable Integer id)
    {
        return przydzialGrupyDoAkcjiRepository.getOne(id);
    }

    @GetMapping
    @RequestMapping("grupa/{id}")
    public boolean checkIfGrupaExists(@PathVariable Integer id)
    {
        List<PrzydzialGrupyDoAkcji> przydzialy = przydzialGrupyDoAkcjiRepository.findAll();
        for(PrzydzialGrupyDoAkcji przydzial : przydzialy)
        {
            if(przydzial.getId_grupy() == id)
            {
                return true;
            }
        }
        return false;
    }

    @PostMapping
    public PrzydzialGrupyDoAkcji create(@RequestBody final PrzydzialGrupyDoAkcji przydzialGrupyDoAkcji)
    {
        return przydzialGrupyDoAkcjiRepository.saveAndFlush(przydzialGrupyDoAkcji);
    }

    @DeleteMapping
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id)
    {
        przydzialGrupyDoAkcjiRepository.deleteById(id);
    }

    @PutMapping
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public PrzydzialGrupyDoAkcji update(@PathVariable Integer id, @RequestBody PrzydzialGrupyDoAkcji przydzialGrupyDoAkcji)
    {
        PrzydzialGrupyDoAkcji existingPrzydzialGrupyDoAkcji = przydzialGrupyDoAkcjiRepository.getOne(id);
        BeanUtils.copyProperties(przydzialGrupyDoAkcji, existingPrzydzialGrupyDoAkcji, "id_przydzialu_grupy_do_akcji");
        return przydzialGrupyDoAkcjiRepository.saveAndFlush(existingPrzydzialGrupyDoAkcji);
    }
}
