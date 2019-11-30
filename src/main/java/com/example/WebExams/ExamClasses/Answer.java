package com.example.WebExams.ExamClasses;

public class Answer {
    String answer;
    boolean isRight;

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setRight(boolean right) {
        isRight = right;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isRight() {
        return isRight;
    }
}
