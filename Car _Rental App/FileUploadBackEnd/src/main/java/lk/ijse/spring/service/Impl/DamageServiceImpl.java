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

    }

    @Override
    public void deleteDamage(String id) {

    }

    @Override
    public void updateDamage(Dammage entity) {

    }

    @Override
    public Dammage searchDamage(String id) {
        return null;
    }

    @Override
    public List<Dammage> getAllDamages() {
        return null;
    }
}
