package com.agila.taskapi.service;

import com.agila.taskapi.db.model.Project;
import org.mongodb.morphia.Datastore;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    private Datastore datastore;

    public ProjectService(Datastore datastore) {
        this.datastore = datastore;
    }

    public void saveProject(Project project) {
        datastore.save(project);
    }
}
