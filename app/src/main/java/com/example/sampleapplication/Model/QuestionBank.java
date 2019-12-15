package com.example.sampleapplication.Model;

import java.util.List;

public class QuestionBank {
    private List<Question> mQuestionList;
    private int mNextQuestionIndex;

    public QuestionBank(List<Question> questionList){
        mQuestionList = questionList;
        mNextQuestionIndex =0;
    }
    public Question getQuestion() {
        return mQuestionList.get(mNextQuestionIndex++);
    }
}

