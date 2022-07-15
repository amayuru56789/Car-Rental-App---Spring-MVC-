package lk.ijse.spring.service.Impl;

import lk.ijse.spring.entity.Dammage;
import lk.ijse.spring.repo.DamageRepo;
import lk.ijse.spring.service.DamageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DamageServiceImpl implements DamageService {

    @Autowired
    private DamageRepo damageRepo;

    @Override
    public void saveDamage(Dammage entity) {
        if (!damageRepo.existsById(entity.getDamageId())){
            damageRepo.save(entity);
        }else {
            throw new RuntimeException("Damage Car already exist...");
        }
    }

    @Override
    public void deleteDamage(String id) {
        if (damageRepo.existsById(id)){
            damageRepo.deleteById(id);
        }else {
            throw new RuntimeException("Please check the Damage ID.. no Such as Damage Car...!");
        }
    }

    @Override
    public void updateDamage(Dammage entity) {
        if (damageRepo.existsById(entity.getDamageId())){
            damageRepo.save(entity);
        }else {
            throw new RuntimeException("No Such As Damage Car to update...! Please check The Id...!");
        }
    }

    @Override
    public Dammage searchDamage(String id) {
        if (damageRepo.existsById(id)){
            return damageRepo.findById(id).get();
        }else {
            throw new RuntimeException("No Damage Car for "+id+" ...!");
        }
    }

    @Override
    public List<Dammage> getAllDamages() {
        return damageRepo.findAll();
    }
}
