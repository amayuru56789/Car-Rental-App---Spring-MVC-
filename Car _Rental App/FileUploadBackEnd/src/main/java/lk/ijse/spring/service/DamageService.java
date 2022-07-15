package lk.ijse.spring.service;

import lk.ijse.spring.entity.Dammage;

import java.util.List;

public interface DamageService {
    public void saveDamage(Dammage entity);
    public void deleteDamage(String id);
    public void updateDamage(Dammage entity);
    public Dammage searchDamage(String id);
    public List<Dammage> getAllDamages();
}
