package com.ms.email.models;

import com.ms.email.enums.StatusEmail;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "emails")
public class EmailModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID emailId;
    private UUID userId;
    private String emailFrom;
    private String emailTo;
    private String subject;

    @Column(columnDefinition = "text")
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;

    public UUID getEmailId() {
        return emailId;
    }

    public void setEmailId(UUID emailId) {
        this.emailId = emailId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getSendDateEmail() {
        return sendDateEmail;
    }

    public void setSendDateEmail(LocalDateTime sendDateEmail) {
        this.sendDateEmail = sendDateEmail;
    }

    public StatusEmail getStatusEmail() {
        return statusEmail;
    }

    public void setStatusEmail(StatusEmail statusEmail) {
        this.statusEmail = statusEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmailModel that = (EmailModel) o;
        return Objects.equals(emailId, that.emailId) && Objects.equals(userId, that.userId) && Objects.equals(emailFrom, that.emailFrom) && Objects.equals(emailTo, that.emailTo) && Objects.equals(subject, that.subject) && Objects.equals(text, that.text) && Objects.equals(sendDateEmail, that.sendDateEmail) && statusEmail == that.statusEmail;
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailId, userId, emailFrom, emailTo, subject, text, sendDateEmail, statusEmail);
    }
}
