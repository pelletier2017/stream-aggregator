package com.pell.streamaggregator.controller.crud;

import com.pell.streamaggregator.entity.Director;
import com.pell.streamaggregator.service.crud.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class DirectorController {

    @Autowired
    private DirectorService service;

    @GetMapping("/directors")
    public Iterable<Director> getAll() {
        return service.findAll();
    }

    @GetMapping("/directors/{id}")
    public Optional<Director> getById(@PathVariable long id) {
        return service.getById(id);
    }

    @PostMapping("/directors")
    public Director add(@RequestBody Director director) {
        return service.add(director);
    }

    @PutMapping("/directors/{id}")
    public Director put(@RequestBody Director director, @PathVariable long id) {
        return service.put(director, id);
    }

}