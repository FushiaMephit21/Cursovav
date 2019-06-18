package ua.nic.Cursova.model;

import javax.persistence.*;

@Entity
@Table(name = "ottolaringologs", schema = "cursova", catalog = "")
public class OttolaringologsEntity {
    private long id;
    private Long idPers;
    private String name;
    private String dateOfBirth;
    private Byte male;
    private String naukzvannya;
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
    @Column(name = "id_pers", nullable = true)
    public Long getIdPers() {
        return idPers;
    }

    public void setIdPers(Long idPers) {
        this.idPers = idPers;
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
    @Column(name = "dateOfBirth", nullable = true, length = 100)
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
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
    @Column(name = "naukzvannya", nullable = true, length = 100)
    public String getNaukzvannya() {
        return naukzvannya;
    }

    public void setNaukzvannya(String naukzvannya) {
        this.naukzvannya = naukzvannya;
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

        OttolaringologsEntity that = (OttolaringologsEntity) o;

        if (id != that.id) return false;
        if (idPers != null ? !idPers.equals(that.idPers) : that.idPers != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(that.dateOfBirth) : that.dateOfBirth != null) return false;
        if (male != null ? !male.equals(that.male) : that.male != null) return false;
        if (naukzvannya != null ? !naukzvannya.equals(that.naukzvannya) : that.naukzvannya != null) return false;
        if (attachment != null ? !attachment.equals(that.attachment) : that.attachment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (idPers != null ? idPers.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (male != null ? male.hashCode() : 0);
        result = 31 * result + (naukzvannya != null ? naukzvannya.hashCode() : 0);
        result = 31 * result + (attachment != null ? attachment.hashCode() : 0);
        return result;
    }
}
