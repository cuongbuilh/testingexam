package com.neu.testingexam.domain;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Result {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "account_id")
    private Integer accountId;

    @Basic
    @Column(name = "exam")
    private Integer exam;

    @Basic
    @Column(name = "start_time")
    private Timestamp startTime;

    @Basic
    @Column(name = "end_time")
    private Timestamp endTime;

    @Basic
    @Column(name = "num_of_correct")
    private Integer numOfCorrect;

    @Basic
    @Column(name = "mark")
    private Double mark;

    @Basic
    @Column(name = "active")
    private Boolean active;

    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    private Account accountByAccountId;

    @ManyToOne
    @JoinColumn(name = "exam", referencedColumnName = "id")
    private Exam examByExam;

    @OneToMany(mappedBy = "resultByResultId")
    private Collection<ResultItem> resultItemsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getExam() {
        return exam;
    }

    public void setExam(Integer exam) {
        this.exam = exam;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Integer getNumOfCorrect() {
        return numOfCorrect;
    }

    public void setNumOfCorrect(Integer numOfCorrect) {
        this.numOfCorrect = numOfCorrect;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
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
        Result result = (Result) o;
        return (
            id == result.id &&
            Objects.equals(accountId, result.accountId) &&
            Objects.equals(exam, result.exam) &&
            Objects.equals(startTime, result.startTime) &&
            Objects.equals(endTime, result.endTime) &&
            Objects.equals(numOfCorrect, result.numOfCorrect) &&
            Objects.equals(mark, result.mark) &&
            Objects.equals(active, result.active)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountId, exam, startTime, endTime, numOfCorrect, mark, active);
    }

    public Account getAccountByAccountId() {
        return accountByAccountId;
    }

    public void setAccountByAccountId(Account accountByAccountId) {
        this.accountByAccountId = accountByAccountId;
    }

    public Exam getExamByExam() {
        return examByExam;
    }

    public void setExamByExam(Exam examByExam) {
        this.examByExam = examByExam;
    }

    public Collection<ResultItem> getResultItemsById() {
        return resultItemsById;
    }

    public void setResultItemsById(Collection<ResultItem> resultItemsById) {
        this.resultItemsById = resultItemsById;
    }
}
