import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
 
@Entity
@Table(name = "usuario")
public class ejemplo implements Serializable {

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ejemplo{" + "id=" + id + ", nombre=" + nombre + '}';
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    private String nombre;
 
    // Getters y Setters
}
