package com.agila.taskapi.service;

import com.agila.taskapi.db.model.Sprint;
import com.agila.taskapi.db.model.Task;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.springframework.stereotype.Service;

@Service
public class SprintService {

    private Datastore datastore;
    private TaskService taskService;

    public SprintService(Datastore datastore, TaskService taskService) {
        this.datastore = datastore;
        this.taskService = taskService;
    }

    public void saveSprint(Sprint sprint) {
        for(Task task : sprint.getTasks()) {
            taskService.saveTask(task);
        }
        datastore.save(sprint);
    }

    public Sprint getSprint(String id) {
        Query<Sprint> query = datastore.createQuery(Sprint.class);
        return query.field("_id").equal(new ObjectId(id)).get();
    }
}
