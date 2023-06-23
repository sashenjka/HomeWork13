package org.example.task2;

import static org.example.task2.CommentFetcher.fetchComments;
import static org.example.task3.TaskApp.getOpenTasksForUser;


public class Main {
    public static void main(String[] args) {

        System.out.println(getOpenTasksForUser(1));
        fetchComments(1);

    }
}