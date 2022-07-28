package com.neu.testingexam.domain;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Account {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "username")
    private String username;

    @Basic
    @Column(name = "password")
    private String password;

    @Basic
    @Column(name = "full_name")
    private String fullName;

    @Basic
    @Column(name = "date_of_birth")
    private Timestamp dateOfBirth;

    @Basic
    @Column(name = "email")
    private String email;

    @Basic
    @Column(name = "phone_number")
    private String phoneNumber;

    @Basic
    @Column(name = "work_place")
    private String workPlace;

    @Basic
    @Column(name = "create_date")
    private Timestamp createDate;

    @Basic
    @Column(name = "active")
    private Boolean active;

    @OneToMany(mappedBy = "accountByCreatorId")
    private Collection<Answer> answersById;

    @OneToMany(mappedBy = "accountByCreatorId")
    private Collection<Exam> examsById;

    @OneToMany(mappedBy = "accountByCreatorId")
    private Collection<Question> questionsById;

    @OneToMany(mappedBy = "accountByAccountId")
    private Collection<Result> resultsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Timestamp getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Timestamp dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
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
        Account account = (Account) o;
        return (
            id == account.id &&
            Objects.equals(username, account.username) &&
            Objects.equals(password, account.password) &&
            Objects.equals(fullName, account.fullName) &&
            Objects.equals(dateOfBirth, account.dateOfBirth) &&
            Objects.equals(email, account.email) &&
            Objects.equals(phoneNumber, account.phoneNumber) &&
            Objects.equals(workPlace, account.workPlace) &&
            Objects.equals(createDate, account.createDate) &&
            Objects.equals(active, account.active)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, fullName, dateOfBirth, email, phoneNumber, workPlace, createDate, active);
    }

    public Collection<Answer> getAnswersById() {
        return answersById;
    }

    public void setAnswersById(Collection<Answer> answersById) {
        this.answersById = answersById;
    }

    public Collection<Exam> getExamsById() {
        return examsById;
    }

    public void setExamsById(Collection<Exam> examsById) {
        this.examsById = examsById;
    }

    public Collection<Question> getQuestionsById() {
        return questionsById;
    }

    public void setQuestionsById(Collection<Question> questionsById) {
        this.questionsById = questionsById;
    }

    public Collection<Result> getResultsById() {
        return resultsById;
    }

    public void setResultsById(Collection<Result> resultsById) {
        this.resultsById = resultsById;
    }
}
