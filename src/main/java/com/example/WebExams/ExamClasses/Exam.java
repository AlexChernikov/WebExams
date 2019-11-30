package com.example.WebExams.ExamClasses;

import java.util.ArrayList;

public class Exam {
    String examName;
    ArrayList<Question> questions = new ArrayList<>();

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
}
