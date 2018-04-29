package com.agila.taskapi.db.model;

import org.bson.types.ObjectId;

public class Task {
    private ObjectId id;
    private String name;
    private Integer storyPoints;
    private String sprint;
    private String spec;
    private ObjectId personId;
}
