package com.agila.taskapi.controller;

import com.agila.taskapi.db.model.Project;
import com.agila.taskapi.db.model.Team;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${api.version.v1.path}")
public class TeamContoller {
    @PostMapping(path = "/team")
    public void createTeam(@RequestBody Team team) {

    }
}
