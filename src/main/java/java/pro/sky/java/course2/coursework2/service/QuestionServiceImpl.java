package java.pro.sky.java.course2.coursework2.service;

import org.springframework.stereotype.Service;

import java.pro.sky.java.course2.coursework2.model.Question;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

@Service
public class QuestionServiceImpl implements QuestionService {
    private final Map<String, Question> questionsMap;

    public QuestionServiceImpl() {
        this.questionsMap = new HashMap<>();
    }

    @Override
    public Question addQuestionAndAnswer(String question, String answer) {
        return null;
    }

    @Override
    public Question addQuestion(Question question) {
        return questionsMap.put(question.getQuestion(), question);
    }

    @Override
    public Question removeQuestion(Question question) {
        return questionsMap.remove(question.getQuestion());
    }

    @Override
    public Collection<Question> getAllQuestions() {
        return questionsMap.values();
    }

    @Override
    public Question getRandomQuestion() {
        return null;
    }
}
