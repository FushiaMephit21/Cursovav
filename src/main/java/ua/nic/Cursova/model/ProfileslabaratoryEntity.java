package ua.nic.Cursova.model;

import javax.persistence.*;

@Entity
@Table(name = "profileslabaratory", schema = "cursova", catalog = "")
public class ProfileslabaratoryEntity {
    private long id;
    private String name;
    private String specifics;

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
    @Column(name = "specifics", nullable = true, length = -1)
    public String getSpecifics() {
        return specifics;
    }

    public void setSpecifics(String specifics) {
        this.specifics = specifics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProfileslabaratoryEntity that = (ProfileslabaratoryEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (specifics != null ? !specifics.equals(that.specifics) : that.specifics != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (specifics != null ? specifics.hashCode() : 0);
        return result;
    }
}
