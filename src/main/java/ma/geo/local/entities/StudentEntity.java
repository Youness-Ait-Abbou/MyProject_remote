package ma.geo.local.entities;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentEntity {
    @Id
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
