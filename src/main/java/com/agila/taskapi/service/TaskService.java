package com.agila.taskapi.service;

import com.agila.taskapi.db.model.Task;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private Datastore datastore;

    public TaskService(Datastore datastore) {
        this.datastore = datastore;
    }

    public void saveTask(Task task) {
        datastore.save(task);
    }
}
