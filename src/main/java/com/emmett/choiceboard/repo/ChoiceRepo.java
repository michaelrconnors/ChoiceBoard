package com.emmett.choiceboard.repo;

import com.emmett.choiceboard.model.Choice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChoiceRepo extends JpaRepository<Choice, Long> {

    void deleteChoiceById(Long id);

    Optional<Choice> findChoiceById(Long id);
}
