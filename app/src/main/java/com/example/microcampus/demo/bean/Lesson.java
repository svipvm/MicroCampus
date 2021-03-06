package com.example.microcampus.demo.bean;

import androidx.annotation.NonNull;

import java.util.Date;

public class Lesson {
    private String lessonName;
    private String teacherName;
    private float lessonCATS;
    private String lessonAttibution;
    private int day;
    private int week;
    private int beginTime;
    private int endTime;
    private String place;

    public Lesson() { }

    public Lesson(String lessonName, String teacherName, float lessonCATS, String lessonAttibution,
                  int day, int week, int beginTime, int endTime, String place) {
        this.lessonName = lessonName;
        this.teacherName = teacherName;
        this.lessonCATS = lessonCATS;
        this.lessonAttibution = lessonAttibution;
        this.day = day;
        this.week = week;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.place = place;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public float getLessonCATS() {
        return lessonCATS;
    }

    public void setLessonCATS(float lessonCATS) {
        this.lessonCATS = lessonCATS;
    }

    public String getLessonAttibution() {
        return lessonAttibution;
    }

    @NonNull
    @Override
    public String toString() {
        String[] days = {"一", "二", "三", "四", "五", "六", "日"};
        return "课程名称：" + lessonName +
               "\n教师名字：" + teacherName +
               "\n课程学分：" + lessonCATS +
               "\n课程属性：" + lessonAttibution +
               "\n周次日期：第 " + week + " 周，星期 " + days[day] +
               "\n课程节次：第 " + beginTime + " - " + endTime + " 小节" +
               "\n课程场地：" + place;
    }

    public void setLessonAttibution(String lessonAttibution) {
        this.lessonAttibution = lessonAttibution;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(int beginTime) {
        this.beginTime = beginTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
