/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author lv1822
 */
@Entity
@Table(name = "juegos")
public class JuegosEntity implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "desarrolladora", length = 100, nullable = false)
    private String desarrolladora;
    
    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "juegos", cascade = CascadeType.PERSIST)
    private List<TrofeosEntity> listaTrofeos;
    
    public JuegosEntity() {
    }

    public JuegosEntity(String desarrolladora, String nombre) {
        this.desarrolladora = desarrolladora;
        this.nombre = nombre;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<TrofeosEntity> getListaTrofeos() {
        return listaTrofeos;
    }

    public void setListaTrofeos(List<TrofeosEntity> listaTrofeos) {
        this.listaTrofeos = listaTrofeos;
    }
    
    public Long getId() {
        return id;
    }

    public String getDesarrolladora() {
        return desarrolladora;
    }

    public void setDesarrolladora(String desarrolladora) {
        this.desarrolladora = desarrolladora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JuegosEntity{");
        sb.append("id=").append(id);
        sb.append(", desarrolladora=").append(desarrolladora);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }
    
}
