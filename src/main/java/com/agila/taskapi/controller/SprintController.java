package com.agila.taskapi.controller;

import com.agila.taskapi.db.model.Sprint;
import com.agila.taskapi.service.SprintService;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("${api.version.v1.path}")
public class SprintController {

    private SprintService sprintService;

    public SprintController(SprintService sprintService) {
        this.sprintService = sprintService;
    }

    @PostMapping(path = "/sprint")
    public void createSprint(@RequestBody Sprint sprint) {
        sprintService.saveSprint(sprint);
    }

    @PutMapping(path = "/sprint/start")
    public void startSprint(@RequestBody ObjectId sprintId) {

    }

    @GetMapping(path = "/sprint/{id}")
    public Sprint getSprint(@PathVariable String id) {
        return sprintService.getSprint(id);
    }
}
