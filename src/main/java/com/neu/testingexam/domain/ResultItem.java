package com.neu.testingexam.domain;

import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "result_item", schema = "testing_exam", catalog = "")
public class ResultItem {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "result_id")
    private Integer resultId;

    @Basic
    @Column(name = "exam_question_id")
    private Integer examQuestionId;

    @Basic
    @Column(name = "selected_answers")
    private Integer selectedAnswers;

    @Basic
    @Column(name = "ignored")
    private Boolean ignored;

    @ManyToOne
    @JoinColumn(name = "result_id", referencedColumnName = "id")
    private Result resultByResultId;

    @ManyToOne
    @JoinColumn(name = "exam_question_id", referencedColumnName = "id")
    private ExamQuestion examQuestionByExamQuestionId;

    @ManyToOne
    @JoinColumn(name = "selected_answers", referencedColumnName = "id")
    private Answer answerBySelectedAnswers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getResultId() {
        return resultId;
    }

    public void setResultId(Integer resultId) {
        this.resultId = resultId;
    }

    public Integer getExamQuestionId() {
        return examQuestionId;
    }

    public void setExamQuestionId(Integer examQuestionId) {
        this.examQuestionId = examQuestionId;
    }

    public Integer getSelectedAnswers() {
        return selectedAnswers;
    }

    public void setSelectedAnswers(Integer selectedAnswers) {
        this.selectedAnswers = selectedAnswers;
    }

    public Boolean getIgnored() {
        return ignored;
    }

    public void setIgnored(Boolean ignored) {
        this.ignored = ignored;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultItem that = (ResultItem) o;
        return (
            id == that.id &&
            Objects.equals(resultId, that.resultId) &&
            Objects.equals(examQuestionId, that.examQuestionId) &&
            Objects.equals(selectedAnswers, that.selectedAnswers) &&
            Objects.equals(ignored, that.ignored)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resultId, examQuestionId, selectedAnswers, ignored);
    }

    public Result getResultByResultId() {
        return resultByResultId;
    }

    public void setResultByResultId(Result resultByResultId) {
        this.resultByResultId = resultByResultId;
    }

    public ExamQuestion getExamQuestionByExamQuestionId() {
        return examQuestionByExamQuestionId;
    }

    public void setExamQuestionByExamQuestionId(ExamQuestion examQuestionByExamQuestionId) {
        this.examQuestionByExamQuestionId = examQuestionByExamQuestionId;
    }

    public Answer getAnswerBySelectedAnswers() {
        return answerBySelectedAnswers;
    }

    public void setAnswerBySelectedAnswers(Answer answerBySelectedAnswers) {
        this.answerBySelectedAnswers = answerBySelectedAnswers;
    }
}
