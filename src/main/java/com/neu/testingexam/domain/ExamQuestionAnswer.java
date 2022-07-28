package com.neu.testingexam.domain;

import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "exam_question_answer", schema = "testing_exam", catalog = "")
public class ExamQuestionAnswer {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "exam_question_id")
    private Integer examQuestionId;

    @Basic
    @Column(name = "answer_id")
    private Integer answerId;

    @ManyToOne
    @JoinColumn(name = "exam_question_id", referencedColumnName = "id")
    private ExamQuestion examQuestionByExamQuestionId;

    @ManyToOne
    @JoinColumn(name = "answer_id", referencedColumnName = "id")
    private Answer answerByAnswerId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getExamQuestionId() {
        return examQuestionId;
    }

    public void setExamQuestionId(Integer examQuestionId) {
        this.examQuestionId = examQuestionId;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamQuestionAnswer that = (ExamQuestionAnswer) o;
        return id == that.id && Objects.equals(examQuestionId, that.examQuestionId) && Objects.equals(answerId, that.answerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, examQuestionId, answerId);
    }

    public ExamQuestion getExamQuestionByExamQuestionId() {
        return examQuestionByExamQuestionId;
    }

    public void setExamQuestionByExamQuestionId(ExamQuestion examQuestionByExamQuestionId) {
        this.examQuestionByExamQuestionId = examQuestionByExamQuestionId;
    }

    public Answer getAnswerByAnswerId() {
        return answerByAnswerId;
    }

    public void setAnswerByAnswerId(Answer answerByAnswerId) {
        this.answerByAnswerId = answerByAnswerId;
    }
}
