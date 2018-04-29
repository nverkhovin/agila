package com.agila.taskapi.db.model;

import org.bson.types.ObjectId;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

public class Sprint {
    private ObjectId id;
    private String name;
    private Date startDate;
    private Data endDate;
    private ObjectId projectId;
    private String projectName;
    private List<Task> tasks;
}
