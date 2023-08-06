package ru.practicum.main.event.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.practicum.main.event.model.Event;

import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
    Page<Event> findAll(Specification<Event> specification, Pageable pageable);

}