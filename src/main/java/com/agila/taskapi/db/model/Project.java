package com.agila.taskapi.db.model;

import org.bson.types.ObjectId;

public class Project {
    private ObjectId id;
    private String name;
    private String description;
    private ProjectTeam team;
    private Template template;

    public class ProjectTeam {
        ObjectId teamId;
        String name;
    }
}
