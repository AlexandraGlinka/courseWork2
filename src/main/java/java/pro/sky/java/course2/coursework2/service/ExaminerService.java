package java.pro.sky.java.course2.coursework2.service;

import java.pro.sky.java.course2.coursework2.model.Question;
import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getAllQuastions(Integer amount);
}
