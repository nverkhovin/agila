package com.agila.taskapi.controller;

import com.agila.taskapi.db.model.Project;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${api.version.v1.path}")
public class ProjectController {
    @PostMapping(path = "/project")
    public void createProject(@RequestBody Project project) {

    }
}
