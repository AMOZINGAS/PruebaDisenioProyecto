/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.awt.List;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author lv1822
 */
@Entity
@Table(name = "trofeos")
public class TrofeosEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre", length = 20, nullable = false)
    private String nombre;
    
    @Column(name = "puntuacion", nullable = false)
    private int puntuacion;

    @ManyToOne()
    @JoinColumn(name = "idJuego", nullable = false)
    private JuegosEntity juegos;
    
    public TrofeosEntity() {
    }

    public TrofeosEntity(String nombre, int puntuacion, JuegosEntity juegos) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.juegos = juegos;
    }

    public JuegosEntity getJuegos() {
        return juegos;
    }

    public void setJuego(JuegosEntity juegos) {
        this.juegos = juegos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }
}
