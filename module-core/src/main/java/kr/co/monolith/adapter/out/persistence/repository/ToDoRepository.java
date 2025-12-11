package kr.co.monolith.adapter.out.persistence.repository;

import kr.co.monolith.adapter.out.persistence.entity.ToDoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDoEntity, Long> {
}
