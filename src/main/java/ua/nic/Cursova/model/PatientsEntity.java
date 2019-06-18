package ua.nic.Cursova.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "patients", schema = "cursova", catalog = "")
public class PatientsEntity {
    private long id;
    private String name;
    private Date dateOfBirth;
    private Byte male;
    private String historyDisease;
    private Long countOperations;
    private Long countAppointment;
    private String fromReferral;
    private Long dogtor;
    private Long attachment;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "dateOfBirth", nullable = true)
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Basic
    @Column(name = "male", nullable = true)
    public Byte getMale() {
        return male;
    }

    public void setMale(Byte male) {
        this.male = male;
    }

    @Basic
    @Column(name = "HistoryDisease", nullable = true, length = -1)
    public String getHistoryDisease() {
        return historyDisease;
    }

    public void setHistoryDisease(String historyDisease) {
        this.historyDisease = historyDisease;
    }

    @Basic
    @Column(name = "countOperations", nullable = true)
    public Long getCountOperations() {
        return countOperations;
    }

    public void setCountOperations(Long countOperations) {
        this.countOperations = countOperations;
    }

    @Basic
    @Column(name = "countAppointment", nullable = true)
    public Long getCountAppointment() {
        return countAppointment;
    }

    public void setCountAppointment(Long countAppointment) {
        this.countAppointment = countAppointment;
    }

    @Basic
    @Column(name = "fromReferral", nullable = true, length = 100)
    public String getFromReferral() {
        return fromReferral;
    }

    public void setFromReferral(String fromReferral) {
        this.fromReferral = fromReferral;
    }

    @Basic
    @Column(name = "dogtor", nullable = true)
    public Long getDogtor() {
        return dogtor;
    }

    public void setDogtor(Long dogtor) {
        this.dogtor = dogtor;
    }

    @Basic
    @Column(name = "attachment", nullable = true)
    public Long getAttachment() {
        return attachment;
    }

    public void setAttachment(Long attachment) {
        this.attachment = attachment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatientsEntity that = (PatientsEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(that.dateOfBirth) : that.dateOfBirth != null) return false;
        if (male != null ? !male.equals(that.male) : that.male != null) return false;
        if (historyDisease != null ? !historyDisease.equals(that.historyDisease) : that.historyDisease != null)
            return false;
        if (countOperations != null ? !countOperations.equals(that.countOperations) : that.countOperations != null)
            return false;
        if (countAppointment != null ? !countAppointment.equals(that.countAppointment) : that.countAppointment != null)
            return false;
        if (fromReferral != null ? !fromReferral.equals(that.fromReferral) : that.fromReferral != null) return false;
        if (dogtor != null ? !dogtor.equals(that.dogtor) : that.dogtor != null) return false;
        if (attachment != null ? !attachment.equals(that.attachment) : that.attachment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (male != null ? male.hashCode() : 0);
        result = 31 * result + (historyDisease != null ? historyDisease.hashCode() : 0);
        result = 31 * result + (countOperations != null ? countOperations.hashCode() : 0);
        result = 31 * result + (countAppointment != null ? countAppointment.hashCode() : 0);
        result = 31 * result + (fromReferral != null ? fromReferral.hashCode() : 0);
        result = 31 * result + (dogtor != null ? dogtor.hashCode() : 0);
        result = 31 * result + (attachment != null ? attachment.hashCode() : 0);
        return result;
    }
}
