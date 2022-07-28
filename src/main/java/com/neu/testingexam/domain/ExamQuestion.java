package com.neu.testingexam.domain;

import java.util.Collection;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "exam_question", schema = "testing_exam", catalog = "")
public class ExamQuestion {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "exam_id")
    private Integer examId;

    @Basic
    @Column(name = "question")
    private Integer question;

    @ManyToOne
    @JoinColumn(name = "exam_id", referencedColumnName = "id")
    private Exam examByExamId;

    @ManyToOne
    @JoinColumn(name = "question", referencedColumnName = "id")
    private Question questionByQuestion;

    @OneToMany(mappedBy = "examQuestionByExamQuestionId")
    private Collection<ExamQuestionAnswer> examQuestionAnswersById;

    @OneToMany(mappedBy = "examQuestionByExamQuestionId")
    private Collection<ResultItem> resultItemsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public Integer getQuestion() {
        return question;
    }

    public void setQuestion(Integer question) {
        this.question = question;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamQuestion that = (ExamQuestion) o;
        return id == that.id && Objects.equals(examId, that.examId) && Objects.equals(question, that.question);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, examId, question);
    }

    public Exam getExamByExamId() {
        return examByExamId;
    }

    public void setExamByExamId(Exam examByExamId) {
        this.examByExamId = examByExamId;
    }

    public Question getQuestionByQuestion() {
        return questionByQuestion;
    }

    public void setQuestionByQuestion(Question questionByQuestion) {
        this.questionByQuestion = questionByQuestion;
    }

    public Collection<ExamQuestionAnswer> getExamQuestionAnswersById() {
        return examQuestionAnswersById;
    }

    public void setExamQuestionAnswersById(Collection<ExamQuestionAnswer> examQuestionAnswersById) {
        this.examQuestionAnswersById = examQuestionAnswersById;
    }

    public Collection<ResultItem> getResultItemsById() {
        return resultItemsById;
    }

    public void setResultItemsById(Collection<ResultItem> resultItemsById) {
        this.resultItemsById = resultItemsById;
    }
}
