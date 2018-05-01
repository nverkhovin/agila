package com.agila.taskapi.db.model;

import com.agila.taskapi.db.model.support.SerializableObjectId;
import lombok.*;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

import java.util.Date;
import java.util.List;

@Entity("sprints")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Sprint {
    @Id
    @SerializableObjectId
    private ObjectId id;
    private String name;
    private Date startDate;
    private Date endDate;
    @SerializableObjectId
    private ObjectId projectId;
    private String projectName;
    @Reference
    private List<Task> tasks;
}
