package com.agila.taskapi.controller;

import com.agila.taskapi.db.model.Task;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("${api.version.v1.path}")
public class TaskController {
    @PostMapping(path = "/task")
    public void createTask(Task task) {

    }

    @GetMapping(path = "/task/{id}")
    public Task getTask(@PathVariable ObjectId id) {
        return new Task();
    }
}
