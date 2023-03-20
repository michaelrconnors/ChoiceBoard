package com.emmett.choiceboard;

import com.emmett.choiceboard.model.Choice;
import com.emmett.choiceboard.service.ChoiceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/choice")
public class ChoiceResource {
    private final ChoiceService choiceService;

    public ChoiceResource(ChoiceService choiceService){
        this.choiceService = choiceService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Choice>> getAllChoices() {
        List<Choice> choices = choiceService.findAllChoices();
        return new ResponseEntity<>(choices, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Choice> getChoiceById(@PathVariable("id") Long id) {
        Choice choice = choiceService.findChoiceById(id);
        return new ResponseEntity<>(choice, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Choice> addChoice(@RequestBody Choice choice) {
        Choice newChoice = choiceService.addChoice(choice);
        return new ResponseEntity<>(newChoice, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Choice> updateChoice(@RequestBody Choice choice) {
        Choice updateChoice = choiceService.updateChoice(choice);
        return new ResponseEntity<>(updateChoice, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteChoice(@PathVariable("id") Long id ) {
        choiceService.deleteChoice(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
