package lk.ijse.spring.controller;

import lk.ijse.spring.entity.Dammage;
import lk.ijse.spring.service.DamageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("avc/damage")
@CrossOrigin
public class DamageController {

    @Autowired
    DamageService damageService;

    @GetMapping
    public List<Dammage> getAllDamage(){
        return damageService.getAllDamages();
    }

    @PostMapping
    public void saveDamage(@ModelAttribute Dammage dammage){
        damageService.saveDamage(dammage);
    }

    @PutMapping
    public void updateDamage(@RequestBody Dammage dammage){
        damageService.updateDamage(dammage);
    }

    @DeleteMapping(params = {"id"})
    public void deleteDamage(String id){
        damageService.deleteDamage(id);
    }

    @GetMapping(path = "/{id}")
    public Dammage searchDamage(@PathVariable String id){
        return damageService.searchDamage(id);
    }
}
