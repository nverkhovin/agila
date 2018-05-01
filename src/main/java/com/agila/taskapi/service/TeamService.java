package com.agila.taskapi.service;

import com.agila.taskapi.db.model.Team;
import org.mongodb.morphia.Datastore;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
    private Datastore datastore;

    public TeamService(Datastore datastore) {
        this.datastore = datastore;
    }

    public void saveTeam(Team team) {
        datastore.save(team);
    }
}
