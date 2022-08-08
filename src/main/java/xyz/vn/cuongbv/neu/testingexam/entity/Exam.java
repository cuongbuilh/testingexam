package xyz.vn.cuongbv.neu.testingexam.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "exam")
public class Exam {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false, length = 200)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creator_id")
    private Account creator;

    @Column(name = "time_in_minute")
    private Integer timeInMinute;

    @Column(name = "start_time", nullable = false)
    private Instant startTime;

    @Column(name = "finish_time", nullable = false)
    private Instant finishTime;

    @Column(name = "is_public")
    private Boolean isPublic;

    @Column(name = "active")
    private Boolean active;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Account getCreator() {
        return creator;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
    }

    public Integer getTimeInMinute() {
        return timeInMinute;
    }

    public void setTimeInMinute(Integer timeInMinute) {
        this.timeInMinute = timeInMinute;
    }

    public Instant getStartTime() {
        return startTime;
    }

    public void setStartTime(Instant startTime) {
        this.startTime = startTime;
    }

    public Instant getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Instant finishTime) {
        this.finishTime = finishTime;
    }

    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

}