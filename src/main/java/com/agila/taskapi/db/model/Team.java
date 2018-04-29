package com.agila.taskapi.db.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

import java.util.List;

public class Team {
    private ObjectId id;
    private String name;
    private String description;
    private List<Person> members;
}
