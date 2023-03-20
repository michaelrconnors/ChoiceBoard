package com.emmett.choiceboard.service;

import com.emmett.choiceboard.ChoiceBoardApplication;
import com.emmett.choiceboard.exception.ChoiceNotFoundException;
import com.emmett.choiceboard.model.Choice;
import com.emmett.choiceboard.repo.ChoiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ChoiceService {
    private final ChoiceRepo choiceRepo;

    @Autowired
    public ChoiceService(ChoiceRepo choiceRepo){
        this.choiceRepo = choiceRepo;
    }

    public Choice addChoice(Choice choice){
        return choiceRepo.save(choice);
    }

    public List<Choice> findAllChoices(){
        return choiceRepo.findAll();
    }

    public Choice updateChoice(Choice choice){
        return choiceRepo.save(choice);
    }

    public Choice findChoiceById(Long id){
        return choiceRepo.findChoiceById(id)
                .orElseThrow(() -> new ChoiceNotFoundException("Choice by id: " + id + " not found;"));
    }


    public void deleteChoice(Long id){
        choiceRepo.deleteChoiceById(id);
    }
}
