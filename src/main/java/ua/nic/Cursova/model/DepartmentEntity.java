package ua.nic.Cursova.model;

import javax.persistence.*;

@Entity
@Table(name = "department", schema = "cursova", catalog = "")
public class DepartmentEntity {
    private long id;
    private Long idMedInst;
    private Long number;
    private String speciality;
    private Long attachment;
    private Long countWard;
    private Long countBeds;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_medInst", nullable = true)
    public Long getIdMedInst() {
        return idMedInst;
    }

    public void setIdMedInst(Long idMedInst) {
        this.idMedInst = idMedInst;
    }

    @Basic
    @Column(name = "number", nullable = true)
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    @Basic
    @Column(name = "speciality", nullable = true, length = 100)
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Basic
    @Column(name = "attachment", nullable = true)
    public Long getAttachment() {
        return attachment;
    }

    public void setAttachment(Long attachment) {
        this.attachment = attachment;
    }

    @Basic
    @Column(name = "countWard", nullable = true)
    public Long getCountWard() {
        return countWard;
    }

    public void setCountWard(Long countWard) {
        this.countWard = countWard;
    }

    @Basic
    @Column(name = "countBeds", nullable = true)
    public Long getCountBeds() {
        return countBeds;
    }

    public void setCountBeds(Long countBeds) {
        this.countBeds = countBeds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartmentEntity that = (DepartmentEntity) o;

        if (id != that.id) return false;
        if (idMedInst != null ? !idMedInst.equals(that.idMedInst) : that.idMedInst != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (speciality != null ? !speciality.equals(that.speciality) : that.speciality != null) return false;
        if (attachment != null ? !attachment.equals(that.attachment) : that.attachment != null) return false;
        if (countWard != null ? !countWard.equals(that.countWard) : that.countWard != null) return false;
        if (countBeds != null ? !countBeds.equals(that.countBeds) : that.countBeds != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (idMedInst != null ? idMedInst.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (speciality != null ? speciality.hashCode() : 0);
        result = 31 * result + (attachment != null ? attachment.hashCode() : 0);
        result = 31 * result + (countWard != null ? countWard.hashCode() : 0);
        result = 31 * result + (countBeds != null ? countBeds.hashCode() : 0);
        return result;
    }
}
