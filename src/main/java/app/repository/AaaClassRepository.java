package app.repository;

import app.model.Aaa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AaaClassRepository extends JpaRepository<Aaa, Long> {
}
