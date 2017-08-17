package app.repository;

import app.model.Bbb;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BbbClassRepository extends JpaRepository<Bbb, Long> {
}
