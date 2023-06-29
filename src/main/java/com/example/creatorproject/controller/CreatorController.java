package com.example.creatorproject.controller;
import com.example.creatorproject.model.Creator;
import com.example.creatorproject.repository.CreatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/creators")
public class CreatorController {

    @Autowired
    private CreatorRepository creatorRepository;

    @GetMapping
    public List<Creator> getAllCreators() {
        return creatorRepository.findAll();
    }

    @PostMapping
    public Creator createCreator(@RequestBody Creator creator) {
        return creatorRepository.save(creator);
    }

    @PutMapping("/{id}")
    public Creator updateCreator(@PathVariable String id, @RequestBody Creator creator) {
        creator.setId(id);
        return creatorRepository.save(creator);
    }

    @DeleteMapping("/{id}")
    public void deleteCreator(@PathVariable String id) {
        creatorRepository.deleteById(id);
    }
}