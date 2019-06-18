package ua.nic.Cursova.model;

import javax.persistence.*;

@Entity
@Table(name = "dogtors", schema = "cursova", catalog = "")
public class DogtorsEntity {
    private long id;
    private String name;
    private String dateOfBirth;
    private Byte male;
    private String posada;
    private String naukzvannya;
    private Long attachment;
    private Byte consultacions;

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
    @Column(name = "date_of_birth", nullable = true, length = 100)
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
    @Column(name = "posada", nullable = true, length = 100)
    public String getPosada() {
        return posada;
    }

    public void setPosada(String posada) {
        this.posada = posada;
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

    @Basic
    @Column(name = "consultacions", nullable = true)
    public Byte getConsultacions() {
        return consultacions;
    }

    public void setConsultacions(Byte consultacions) {
        this.consultacions = consultacions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DogtorsEntity that = (DogtorsEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(that.dateOfBirth) : that.dateOfBirth != null) return false;
        if (male != null ? !male.equals(that.male) : that.male != null) return false;
        if (posada != null ? !posada.equals(that.posada) : that.posada != null) return false;
        if (naukzvannya != null ? !naukzvannya.equals(that.naukzvannya) : that.naukzvannya != null) return false;
        if (attachment != null ? !attachment.equals(that.attachment) : that.attachment != null) return false;
        if (consultacions != null ? !consultacions.equals(that.consultacions) : that.consultacions != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (male != null ? male.hashCode() : 0);
        result = 31 * result + (posada != null ? posada.hashCode() : 0);
        result = 31 * result + (naukzvannya != null ? naukzvannya.hashCode() : 0);
        result = 31 * result + (attachment != null ? attachment.hashCode() : 0);
        result = 31 * result + (consultacions != null ? consultacions.hashCode() : 0);
        return result;
    }
}
