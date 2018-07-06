package com.ankur.taskapp.manager.masterData;

/**
 * Created by Logimetrix on 13-06-2017.
 */

public class TaskType {

    String id,task,status;

    public String getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return task;
    }
}
