package com.agila.taskapi.db.model;

import com.agila.taskapi.db.model.support.SerializableObjectId;
import lombok.*;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("projects")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    @Id
    @SerializableObjectId
    private ObjectId id;
    private String name;
    private String description;
    private ProjectTeam team;
    private Template template;

    public class ProjectTeam {
        @SerializableObjectId
        ObjectId teamId;
        String name;
    }
}
