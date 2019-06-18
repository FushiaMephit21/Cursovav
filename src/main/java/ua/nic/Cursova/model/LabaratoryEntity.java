package ua.nic.Cursova.model;

import javax.persistence.*;

@Entity
@Table(name = "labaratory", schema = "cursova", catalog = "")
public class LabaratoryEntity {
    private long id;
    private Long attachment;
    private String specializ;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "specializ", nullable = true, length = 100)
    public String getSpecializ() {
        return specializ;
    }

    public void setSpecializ(String specializ) {
        this.specializ = specializ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LabaratoryEntity that = (LabaratoryEntity) o;

        if (id != that.id) return false;
        if (attachment != null ? !attachment.equals(that.attachment) : that.attachment != null) return false;
        if (specializ != null ? !specializ.equals(that.specializ) : that.specializ != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (attachment != null ? attachment.hashCode() : 0);
        result = 31 * result + (specializ != null ? specializ.hashCode() : 0);
        return result;
    }
}
