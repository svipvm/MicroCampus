package com.example.microcampus.demo.service;

import com.example.microcampus.demo.bean.Lesson;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface DataService {
    boolean login(String username, String password);
    Map<String, String> getBaseInformation(String username);
    List<Lesson> getShceduleByWeek(int week);
    void updataAllInformation();
    void deleteAllInformation();
    void closeDB();
    void updataLessonByWeek(int week);
    List<Map<String, Object>> getScoresBySemester(int semester);
}
