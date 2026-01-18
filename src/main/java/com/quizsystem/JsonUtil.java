package com.quizsystem;

import com.google.gson.*;
import java.io.*;
import java.util.*;

public class JsonUtil {

    public static List<User> readUsers() throws Exception {
        Reader reader = new FileReader("users.json");
        return new Gson().fromJson(reader, new com.google.gson.reflect.TypeToken<List<User>>(){}.getType());
    }

    public static List<Question> readQuestions() throws Exception {
        File file = new File("quiz.json");
        if (!file.exists()) return new ArrayList<>();
        Reader reader = new FileReader(file);
        return new Gson().fromJson(reader, new com.google.gson.reflect.TypeToken<List<Question>>(){}.getType());
    }

    public static void writeQuestions(List<Question> questions) throws Exception {
        Writer writer = new FileWriter("quiz.json");
        new GsonBuilder().setPrettyPrinting().create().toJson(questions, writer);
        writer.close();
    }
}
