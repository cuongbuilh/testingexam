package com.neu.testingexam.domain;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Exam {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "title")
    private String title;

    @Basic
    @Column(name = "creator_id")
    private Integer creatorId;

    @Basic
    @Column(name = "time_in_minute")
    private Integer timeInMinute;

    @Basic
    @Column(name = "start_time")
    private Timestamp startTime;

    @Basic
    @Column(name = "finish_time")
    private Timestamp finishTime;

    @Basic
    @Column(name = "is_public")
    private Boolean isPublic;

    @Basic
    @Column(name = "active")
    private Boolean active;

    @ManyToOne
    @JoinColumn(name = "creator_id", referencedColumnName = "id")
    private Account accountByCreatorId;

    @OneToMany(mappedBy = "examByExamId", fetch = FetchType.LAZY)
    private Collection<ExamQuestion> examQuestionsById;

    @OneToMany(mappedBy = "examByExam", fetch = FetchType.LAZY)
    private Collection<Result> resultsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public Integer getTimeInMinute() {
        return timeInMinute;
    }

    public void setTimeInMinute(Integer timeInMinute) {
        this.timeInMinute = timeInMinute;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Timestamp finishTime) {
        this.finishTime = finishTime;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean aPublic) {
        isPublic = aPublic;
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
        Exam exam = (Exam) o;
        return (
            id == exam.id &&
            Objects.equals(title, exam.title) &&
            Objects.equals(creatorId, exam.creatorId) &&
            Objects.equals(timeInMinute, exam.timeInMinute) &&
            Objects.equals(startTime, exam.startTime) &&
            Objects.equals(finishTime, exam.finishTime) &&
            Objects.equals(isPublic, exam.isPublic) &&
            Objects.equals(active, exam.active)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, creatorId, timeInMinute, startTime, finishTime, isPublic, active);
    }

    public Account getAccountByCreatorId() {
        return accountByCreatorId;
    }

    public void setAccountByCreatorId(Account accountByCreatorId) {
        this.accountByCreatorId = accountByCreatorId;
    }

    public Collection<ExamQuestion> getExamQuestionsById() {
        return examQuestionsById;
    }

    public void setExamQuestionsById(Collection<ExamQuestion> examQuestionsById) {
        this.examQuestionsById = examQuestionsById;
    }

    public Collection<Result> getResultsById() {
        return resultsById;
    }

    public void setResultsById(Collection<Result> resultsById) {
        this.resultsById = resultsById;
    }
}
