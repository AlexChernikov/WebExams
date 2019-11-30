package com.example.WebExams.ExamClasses;

import java.util.ArrayList;

public class Question {
    String question;
    ArrayList<Answer> answers  = new ArrayList<>();

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswers(ArrayList<Answer> answers) {
        this.answers = answers;
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<Answer> getAnswers() {
        return answers;
    }
}
