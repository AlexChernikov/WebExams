package com.example.WebExams.Parsers;

import com.example.WebExams.ExamClasses.Exam;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class ExamParser {
    static String path = "src/main/resources/examsFiles/";

    public static HashMap<String, Exam> parse() {
        HashMap<String, Exam> exams = new HashMap<>();
        File[] files = new File(path).listFiles();

        for (File file : files) {
            Exam exam = parseJson(file);
            exams.put(file.getName().replace(".json", ""), exam);
        }

        return exams;
    }

    public static Exam parseJson(File file) {
        try {
            JsonReader jsonReader = new JsonReader(
                    new FileReader(file));
            Gson g = new Gson();
            Exam exam = g.fromJson(jsonReader, Exam.class);

            return exam;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
