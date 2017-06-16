package com.example.android.reportcard;

/**
 * Created by Kezia on 15/06/2017.
 */

public class ReportCard {

    //private member variables

    private char mMaths;
    private char mEnglish;
    private char mHistory;
    private char mGeography;
    private char mScience;
    private String mName;

    //constructor

    public ReportCard(char maths, char english, char history, char geography, char science, String name) {

        mMaths = maths;
        mEnglish = english;
        mHistory = history;
        mGeography = geography;
        mScience = science;
        mName = name;
    }

    //getters and setters

    public char getMathsGrade() {
        return mMaths;
    }

    public void setMathsGrade(char maths) {
        mMaths = maths;
    }

    public char getEnglishGrade() {
        return mEnglish;
    }

    public void setEnglishGrade(char english) {
        mEnglish = english;
    }

    public char getHistoryGrade() {
        return mHistory;
    }

    public void setHistoryGrade(char history) {
        mHistory = history;
    }

    public char getGeographyGrade() {
        return mGeography;
    }

    public void setGeography(char geography) {
        mGeography = geography;
    }

    public char getScienceGrade() {
        return mScience;
    }

    public void setScienceGrade(char science) {
        mScience = science;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    //toString
    @Override
    public String toString() {
        return "Name: " + mName + ";" + " Maths Grade: " + mMaths + ";" + " English Grade: "
                + mEnglish + ";" + " History Grade: " + mHistory + ";" + " Geography Grade: "
                + mGeography + ";" + " Science Grade: " + mScience;
    }

}


