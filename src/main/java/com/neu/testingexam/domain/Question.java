package com.neu.testingexam.domain;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Question {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "question_type")
    private Integer questionType;

    @Basic
    @Column(name = "subject_id")
    private Integer subjectId;

    @Basic
    @Column(name = "question_level_id")
    private Integer questionLevelId;

    @Basic
    @Column(name = "question_content")
    private String questionContent;

    @Basic
    @Column(name = "creator_id")
    private Integer creatorId;

    @Basic
    @Column(name = "create_date")
    private Timestamp createDate;

    @Basic
    @Column(name = "is_public")
    private Boolean isPublic;

    @Basic
    @Column(name = "is_group_question")
    private Boolean isGroupQuestion;

    @Basic
    @Column(name = "parent_question_id")
    private Integer parentQuestionId;

    @Basic
    @Column(name = "active")
    private Boolean active;

    @OneToMany(mappedBy = "questionByQuestionId")
    private Collection<Answer> answersById;

    @OneToMany(mappedBy = "questionByQuestion")
    private Collection<ExamQuestion> examQuestionsById;

    @ManyToOne
    @JoinColumn(name = "question_type", referencedColumnName = "id")
    private QuestionType questionTypeByQuestionType;

    @ManyToOne
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    private Subject subjectBySubjectId;

    @ManyToOne
    @JoinColumn(name = "question_level_id", referencedColumnName = "id")
    private QuestionLevel questionLevelByQuestionLevelId;

    @ManyToOne
    @JoinColumn(name = "creator_id", referencedColumnName = "id")
    private Account accountByCreatorId;

    @ManyToOne
    @JoinColumn(name = "parent_question_id", referencedColumnName = "id")
    private Question questionByParentQuestionId;

    @OneToMany(mappedBy = "questionByParentQuestionId")
    private Collection<Question> questionsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getQuestionLevelId() {
        return questionLevelId;
    }

    public void setQuestionLevelId(Integer questionLevelId) {
        this.questionLevelId = questionLevelId;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean aPublic) {
        isPublic = aPublic;
    }

    public Boolean getGroupQuestion() {
        return isGroupQuestion;
    }

    public void setGroupQuestion(Boolean groupQuestion) {
        isGroupQuestion = groupQuestion;
    }

    public Integer getParentQuestionId() {
        return parentQuestionId;
    }

    public void setParentQuestionId(Integer parentQuestionId) {
        this.parentQuestionId = parentQuestionId;
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
        Question question = (Question) o;
        return (
            id == question.id &&
            Objects.equals(questionType, question.questionType) &&
            Objects.equals(subjectId, question.subjectId) &&
            Objects.equals(questionLevelId, question.questionLevelId) &&
            Objects.equals(questionContent, question.questionContent) &&
            Objects.equals(creatorId, question.creatorId) &&
            Objects.equals(createDate, question.createDate) &&
            Objects.equals(isPublic, question.isPublic) &&
            Objects.equals(isGroupQuestion, question.isGroupQuestion) &&
            Objects.equals(parentQuestionId, question.parentQuestionId) &&
            Objects.equals(active, question.active)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            questionType,
            subjectId,
            questionLevelId,
            questionContent,
            creatorId,
            createDate,
            isPublic,
            isGroupQuestion,
            parentQuestionId,
            active
        );
    }

    public Collection<Answer> getAnswersById() {
        return answersById;
    }

    public void setAnswersById(Collection<Answer> answersById) {
        this.answersById = answersById;
    }

    public Collection<ExamQuestion> getExamQuestionsById() {
        return examQuestionsById;
    }

    public void setExamQuestionsById(Collection<ExamQuestion> examQuestionsById) {
        this.examQuestionsById = examQuestionsById;
    }

    public QuestionType getQuestionTypeByQuestionType() {
        return questionTypeByQuestionType;
    }

    public void setQuestionTypeByQuestionType(QuestionType questionTypeByQuestionType) {
        this.questionTypeByQuestionType = questionTypeByQuestionType;
    }

    public Subject getSubjectBySubjectId() {
        return subjectBySubjectId;
    }

    public void setSubjectBySubjectId(Subject subjectBySubjectId) {
        this.subjectBySubjectId = subjectBySubjectId;
    }

    public QuestionLevel getQuestionLevelByQuestionLevelId() {
        return questionLevelByQuestionLevelId;
    }

    public void setQuestionLevelByQuestionLevelId(QuestionLevel questionLevelByQuestionLevelId) {
        this.questionLevelByQuestionLevelId = questionLevelByQuestionLevelId;
    }

    public Account getAccountByCreatorId() {
        return accountByCreatorId;
    }

    public void setAccountByCreatorId(Account accountByCreatorId) {
        this.accountByCreatorId = accountByCreatorId;
    }

    public Question getQuestionByParentQuestionId() {
        return questionByParentQuestionId;
    }

    public void setQuestionByParentQuestionId(Question questionByParentQuestionId) {
        this.questionByParentQuestionId = questionByParentQuestionId;
    }

    public Collection<Question> getQuestionsById() {
        return questionsById;
    }

    public void setQuestionsById(Collection<Question> questionsById) {
        this.questionsById = questionsById;
    }
}
