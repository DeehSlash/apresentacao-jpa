package dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity (name = "VEICULO")
public class Veiculo implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "VEICULO_ID")
    private long id;
    
    @Column (name = "MODELO", nullable = false, length = 20)
    private String modelo;
    
    @Column (name = "PLACA", nullable = false, length = 7)
    private String placa;
    
    @Column (name = "ANO_FABRICACAO")
    private int ano;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "MARCA_ID", referencedColumnName = "MARCA_ID")
    private Marca marca;
    
    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.modelo = nome;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public Marca getMarca() {
        return marca;
    }
}
