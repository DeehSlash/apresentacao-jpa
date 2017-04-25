package dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


@Entity(name = "MARCA")
public class Marca implements Serializable{
    
    @Id
    @Column(name = "MARCA_ID")
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    
    @Column (name = "NOME", unique = true)
    private String nome;

    
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
