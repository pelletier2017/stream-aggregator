package com.pell.streamaggregator.controller;

import com.pell.streamaggregator.entity.Director;
import com.pell.streamaggregator.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DirectorController {

    @Autowired
    private DirectorService directorService;

    @GetMapping("/directors")
    public List<Director> getAllDirectors() {
        return directorService.getAllDirectors();
    }
}