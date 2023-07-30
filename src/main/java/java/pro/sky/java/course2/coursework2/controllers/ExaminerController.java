package java.pro.sky.java.course2.coursework2.controllers;

import org.springframework.web.bind.annotation.*;

import java.pro.sky.java.course2.coursework2.model.Question;
import java.pro.sky.java.course2.coursework2.service.ExaminerService;
import java.util.Collection;
@RestController
@RequestMapping("/exam")
public class ExaminerController {
    private final ExaminerService examinerService;

    public ExaminerController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping("/getAll/{amount}") // адрес типа http://localhost:8080/example/Alex
    public Collection<Question> getAllQuastions(@PathVariable Integer amount) {
        return examinerService.getAllQuastions(amount);
    }
}
