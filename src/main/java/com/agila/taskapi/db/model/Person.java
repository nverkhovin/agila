package com.agila.taskapi.db.model;

import org.bson.types.ObjectId;

import java.util.List;

public class Person {
    private ObjectId id;
    private String name;
    private String login;
    private String mail;
    private List<Team> teams;
}
