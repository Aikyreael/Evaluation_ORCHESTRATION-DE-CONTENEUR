package school.exercice.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school.exercice.backend.entities.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}
