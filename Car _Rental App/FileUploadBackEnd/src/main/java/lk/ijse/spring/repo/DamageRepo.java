package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Dammage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DamageRepo extends JpaRepository<Dammage, String> {
}
