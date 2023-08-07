package ru.practicum.main.compilation.repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.practicum.main.compilation.model.Compilation;

import java.util.List;

@Repository
public interface CompilationRepository extends JpaRepository<Compilation,Long> {
    boolean existsByTitle(String title);

    List<Compilation> findByPinned(Boolean pinned, Pageable pageable);
}
