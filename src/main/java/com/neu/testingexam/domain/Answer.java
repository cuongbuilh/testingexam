package com.neu.testingexam.domain;

import java.util.Collection;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Answer {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "question_id")
    private Integer questionId;

    @Basic
    @Column(name = "is_correct")
    private Boolean isCorrect;

    @Basic
    @Column(name = "creator_id")
    private Integer creatorId;

    @Basic
    @Column(name = "answer_content")
    private String answerContent;

    @Basic
    @Column(name = "active")
    private Boolean active;

    @ManyToOne
    @JoinColumn(name = "question_id", referencedColumnName = "id")
    private Question questionByQuestionId;

    @ManyToOne
    @JoinColumn(name = "creator_id", referencedColumnName = "id")
    private Account accountByCreatorId;

    @OneToMany(mappedBy = "answerByAnswerId")
    private Collection<ExamQuestionAnswer> examQuestionAnswersById;

    @OneToMany(mappedBy = "answerBySelectedAnswers")
    private Collection<ResultItem> resultItemsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Boolean getCorrect() {
        return isCorrect;
    }

    public void setCorrect(Boolean correct) {
        isCorrect = correct;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return (
            id == answer.id &&
            Objects.equals(questionId, answer.questionId) &&
            Objects.equals(isCorrect, answer.isCorrect) &&
            Objects.equals(creatorId, answer.creatorId) &&
            Objects.equals(answerContent, answer.answerContent) &&
            Objects.equals(active, answer.active)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, questionId, isCorrect, creatorId, answerContent, active);
    }

    public Question getQuestionByQuestionId() {
        return questionByQuestionId;
    }

    public void setQuestionByQuestionId(Question questionByQuestionId) {
        this.questionByQuestionId = questionByQuestionId;
    }

    public Account getAccountByCreatorId() {
        return accountByCreatorId;
    }

    public void setAccountByCreatorId(Account accountByCreatorId) {
        this.accountByCreatorId = accountByCreatorId;
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
