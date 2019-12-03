package com.example.WebExams;

import com.example.WebExams.ExamClasses.Exam;
import com.example.WebExams.Parsers.ExamParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

@RestController
public class MyController {
    private static HashMap<String, Exam> exams = ExamParser.parse();
   private static ArrayList<Result> results = new ArrayList<>();

    @GetMapping("/exams")
    public  Collection<Exam> getExams() {
        return exams.values();
    }

    @GetMapping("/examsNames")
    public Set<String> getExamsNames() {
        return exams.keySet();
    }

    @PostMapping("/postResult")
    public void postResult(@RequestBody Result result) {
        results.add(result);
        for (Result resultFromList : results) {
            System.out.println(resultFromList);
        }
    }
}

class Result{
    String examName;
    Integer trueAns;
    String id;

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public Integer getTrueAns() {
        return trueAns;
    }

    public void setTrueAns(Integer trueAns) {
        this.trueAns = trueAns;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Result{" +
                "examName='" + examName + '\'' +
                ", trueAns=" + trueAns +
                ", id='" + id + '\'' +
                '}';
    }
}