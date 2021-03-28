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
    private DirectorService directorService;

    @GetMapping("/directors")
    public Iterable<Director> getAll() {
        return directorService.findAll();
    }

    @GetMapping("/directors/{id}")
    public Optional<Director> getById(@PathVariable long id) {
        return directorService.getById(id);
    }

    @PostMapping("/directors")
    public Director add(@RequestBody Director director) {
        return directorService.add(director);
    }

}