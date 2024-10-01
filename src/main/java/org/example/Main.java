package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        /*Set<Task> annsTasks = new HashSet<>();
        Task taskAnn = new Task("workintech", "dummy desc", "ann", Status.IN_PROGRESS, Priority.HIGH);
        Task taskAnn2 = new Task("workintech", "dummy desc 2", "ann", Status.IN_PROGRESS, Priority.HIGH);

        annsTasks.add(taskAnn);
        annsTasks.add(taskAnn2);

        Set<Task> bobsTasks = new HashSet<>();
        Task taskBob = new Task("workintech", "dummy desc 3", "bob", Status.IN_PROGRESS, Priority.HIGH);
        Task taskBob2 = new Task("workintech", "dummy desc 5", "bob", Status.IN_PROGRESS, Priority.HIGH);

        bobsTasks.add(taskBob);
        bobsTasks.add(taskBob2);

        Set<Task> carolsTasks = new HashSet<>();
        Task taskCarol = new Task("workintech", "dummy desc 4", "carol", Status.IN_PROGRESS, Priority.HIGH);
        Task taskCarol2 = new Task("workintech", "dummy desc 3", "carol", Status.IN_PROGRESS, Priority.HIGH);

        carolsTasks.add(taskCarol);
        carolsTasks.add(taskCarol2);

        Set<Task> unassignedTasks = new HashSet<>();
        Task taskUnassigned = new Task("workintech", "dummy desc 6", null, Status.IN_PROGRESS, Priority.HIGH);

        unassignedTasks.add(taskUnassigned);

        TaskData taskData = new TaskData(annsTasks, bobsTasks, carolsTasks, unassignedTasks);
        System.out.println("bobstask: " + taskData.getTasks("bob"));
        System.out.println("annstask: " + taskData.getTasks("ann"));
        System.out.println("alltask: " + taskData.getTasks("all"));
        taskData.getIntersection(annsTasks, bobsTasks);
        taskData.getIntersection(annsTasks, carolsTasks);
        taskData.getIntersection(bobsTasks, carolsTasks);


        System.out.println("unassigned: " + taskData.getDifferences(unassignedTasks, taskData.getTasks("ann")));*/

        StringSet.findUniqueWords();
    }

}