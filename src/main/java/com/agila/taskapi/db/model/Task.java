package com.agila.taskapi.db.model;

import com.agila.taskapi.db.model.support.Field;
import com.agila.taskapi.db.model.support.SerializableObjectId;
import lombok.*;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.List;

@Entity("tasks")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    @Id
    @SerializableObjectId
    private ObjectId id;
    private String name;
    private Integer storyPoints;
    private String sprint;
    private String spec;
    @SerializableObjectId
    private ObjectId assignedPersonId;
    @Embedded
    List<Field> mainFields;
    @Embedded
    List<Field> additionalFields;
}
