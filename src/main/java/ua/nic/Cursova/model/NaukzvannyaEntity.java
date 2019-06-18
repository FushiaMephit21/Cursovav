package ua.nic.Cursova.model;

import javax.persistence.*;

@Entity
@Table(name = "naukzvannya", schema = "cursova", catalog = "")
public class NaukzvannyaEntity {
    private long id;
    private String name;
    private Byte giveConsultation;

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
    @Column(name = "giveConsultation", nullable = true)
    public Byte getGiveConsultation() {
        return giveConsultation;
    }

    public void setGiveConsultation(Byte giveConsultation) {
        this.giveConsultation = giveConsultation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NaukzvannyaEntity that = (NaukzvannyaEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (giveConsultation != null ? !giveConsultation.equals(that.giveConsultation) : that.giveConsultation != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (giveConsultation != null ? giveConsultation.hashCode() : 0);
        return result;
    }
}
