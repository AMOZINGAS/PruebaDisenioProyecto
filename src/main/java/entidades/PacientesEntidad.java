/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Amos Heli Olguin Quiroz
 */

@Entity
@Table(name = "pacientes")
public class PacientesEntidad implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "telefono", length = 18, nullable = false)
    private String telefono;
    
    @Column(name = "numeroSeguroSocial", length = 30, nullable = false, unique = true)
    private String numeroSeguroSocial;
    
    @Column(name = "fechaNacimiento", nullable = false)
    private Date fechaNacimiento;
    
    @Column(name = "curp", length = 20, nullable = false, unique = true)
    private String curp;

    @Column(name = "nombres", length = 45, nullable = false)
    private String nombres;
    
    @Column(name = "apellidoPaterno", length = 45, nullable = false)
    private String apellidoPaterno;
    
    @Column(name = "apellidoMaterno", length = 45, nullable = false)
    private String apellidoMaterno;
    
    @Column(name = "calle", length = 45, nullable = false)
    private String calle;
    
    @Column(name = "colonia", length = 45, nullable = false)
    private String colonia;
    
    @Column(name = "codigoPostal", length = 45, nullable = false)
    private String codigoPostal;
    
    @Column(name = "edad", columnDefinition = "timestampdiff(YEAR,`fechaNacimiento`,curdate())", nullable = false)
    private int edad;

    public PacientesEntidad() {
    }

    public PacientesEntidad(String telefono, String numeroSeguroSocial, Date fechaNacimiento, String curp, String nombres, String apellidoPaterno, String apellidoMaterno, String calle, String colonia, String codigoPostal) {
        this.telefono = telefono;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.fechaNacimiento = fechaNacimiento;
        this.curp = curp;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.calle = calle;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }
    
    public int getId() {
        return id;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCurp() {
        return curp;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClientesEntidad{");
        sb.append("id=").append(id);
        sb.append(", telefono=").append(telefono);
        sb.append(", numeroSeguroSocial=").append(numeroSeguroSocial);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", curp=").append(curp);
        sb.append(", nombres=").append(nombres);
        sb.append(", apellidoPaterno=").append(apellidoPaterno);
        sb.append(", apellidoMaterno=").append(apellidoMaterno);
        sb.append(", calle=").append(calle);
        sb.append(", colonia=").append(colonia);
        sb.append(", codigoPostal=").append(codigoPostal);
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
}
