package com.agila.taskapi.db.model;

import com.agila.taskapi.db.model.support.SerializableObjectId;
import lombok.*;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.List;
@Entity("teams")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Team {
    @Id
    @SerializableObjectId
    private ObjectId id;
    private String name;
    private String description;
    @SerializableObjectId
    private ObjectId owner;
    private List<Person> members;
}
