package com.agila.taskapi.db.model;

import com.agila.taskapi.db.model.support.SerializableObjectId;
import lombok.*;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.List;

@Entity("persons")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @SerializableObjectId
    private ObjectId id;
    private String name;
    private String login;
    private String mail;
    private List<Team> teams;
}
