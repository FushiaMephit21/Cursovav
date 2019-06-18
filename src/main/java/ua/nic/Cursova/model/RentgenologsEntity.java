package ua.nic.Cursova.model;

import javax.persistence.*;

@Entity
@Table(name = "rentgenologs", schema = "cursova", catalog = "")
public class RentgenologsEntity {
    private long id;
    private Long idPers;
    private String name;
    private String dateOfBirth;
    private Byte male;
    private Long attachment;
    private String naukzvannya;
    private Double kfZarplata;
    private Byte trivalishavidpustka;

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
    @Column(name = "attachment", nullable = true)
    public Long getAttachment() {
        return attachment;
    }

    public void setAttachment(Long attachment) {
        this.attachment = attachment;
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
    @Column(name = "kfZarplata", nullable = true, precision = 0)
    public Double getKfZarplata() {
        return kfZarplata;
    }

    public void setKfZarplata(Double kfZarplata) {
        this.kfZarplata = kfZarplata;
    }

    @Basic
    @Column(name = "trivalishavidpustka", nullable = true)
    public Byte getTrivalishavidpustka() {
        return trivalishavidpustka;
    }

    public void setTrivalishavidpustka(Byte trivalishavidpustka) {
        this.trivalishavidpustka = trivalishavidpustka;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RentgenologsEntity that = (RentgenologsEntity) o;

        if (id != that.id) return false;
        if (idPers != null ? !idPers.equals(that.idPers) : that.idPers != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(that.dateOfBirth) : that.dateOfBirth != null) return false;
        if (male != null ? !male.equals(that.male) : that.male != null) return false;
        if (attachment != null ? !attachment.equals(that.attachment) : that.attachment != null) return false;
        if (naukzvannya != null ? !naukzvannya.equals(that.naukzvannya) : that.naukzvannya != null) return false;
        if (kfZarplata != null ? !kfZarplata.equals(that.kfZarplata) : that.kfZarplata != null) return false;
        if (trivalishavidpustka != null ? !trivalishavidpustka.equals(that.trivalishavidpustka) : that.trivalishavidpustka != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (idPers != null ? idPers.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (male != null ? male.hashCode() : 0);
        result = 31 * result + (attachment != null ? attachment.hashCode() : 0);
        result = 31 * result + (naukzvannya != null ? naukzvannya.hashCode() : 0);
        result = 31 * result + (kfZarplata != null ? kfZarplata.hashCode() : 0);
        result = 31 * result + (trivalishavidpustka != null ? trivalishavidpustka.hashCode() : 0);
        return result;
    }
}
