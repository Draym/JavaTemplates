package com.codingacademy.spring.dao;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class MongoDB {

    private MongoClient client;

    private MongoDB() {
        this.client = new MongoClient();
    }

    public MongoCollection<Document> getCollection(String name) {
        return client.getDatabase("db_test").getCollection(name);
    }

    private static MongoDB instance;

    public static MongoDB getInstance() {
        if (instance == null) {
            instance = new MongoDB();
        }
        return instance;
    }
}
