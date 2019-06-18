package ua.nic.Cursova.model;

import javax.persistence.*;

@Entity
@Table(name = "polikliniks", schema = "cursova", catalog = "")
public class PolikliniksEntity {
    private long id;
    private Long idMedInst;
    private String name;

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
    @Column(name = "name", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PolikliniksEntity that = (PolikliniksEntity) o;

        if (id != that.id) return false;
        if (idMedInst != null ? !idMedInst.equals(that.idMedInst) : that.idMedInst != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (idMedInst != null ? idMedInst.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
