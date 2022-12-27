package com.beginsecure;

import org.json.JSONObject;

public class App {
    public static void main(String[] args) {

        String myString = "{\"name\" : \"Mary\"}";
        JSONObject job = new JSONObject(myString);

        System.out.println("the name is " + job.get("name"));
    }
}
