package com.agila.taskapi.configuration;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfiguration {
    @Bean
    public Datastore datastore() {
        Morphia morphia = new Morphia();
        Datastore datastore = morphia.createDatastore(new MongoClient(),"agila_db");
        datastore.ensureIndexes();
        return datastore;
    }
}
