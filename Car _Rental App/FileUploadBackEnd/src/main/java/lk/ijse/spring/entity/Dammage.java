package lk.ijse.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dammage {
    @Id
    private String damageId;
    private String damageType;
    private int lossDmg;

    public Dammage() {
    }

    public Dammage(String damageId, String damageType, int lossDmg) {
        this.damageId = damageId;
        this.damageType = damageType;
        this.lossDmg = lossDmg;
    }

    public String getDamageId() {
        return damageId;
    }

    public void setDamageId(String damageId) {
        this.damageId = damageId;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public int getLossDmg() {
        return lossDmg;
    }

    public void setLossDmg(int lossDmg) {
        this.lossDmg = lossDmg;
    }

    @Override
    public String toString() {
        return "Dammage{" +
                "damageId='" + damageId + '\'' +
                ", damageType='" + damageType + '\'' +
                ", lossDmg=" + lossDmg +
                '}';
    }
}
