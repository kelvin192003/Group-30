// This is a Note class created to represent a Note Object that would be stored in the Realm DB
package com.example.notesapp;

import io.realm.RealmObject;

// The Note class inherits the properties of RealmObject
public class Note extends RealmObject {
    String title;
    String description;
    long createdTime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(long createdTime) {
        this.createdTime = createdTime;
    }
}
