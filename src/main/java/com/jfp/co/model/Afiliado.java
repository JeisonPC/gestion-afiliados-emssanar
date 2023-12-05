package com.jfp.co.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "afiliados")
public class Afiliado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "edad")
    private int edad;

    @Column(name = "identificacion")
    private int identificacion;

    @Column(name = "genero")
    private String genero;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    public Afiliado() {
    }

    public Afiliado(String name, int edad, int identificacion, String genero, String direccion, String telefono, Date fechaNacimiento) {
        this.name = name;
        this.edad = edad;
        this.identificacion = identificacion;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getter y Setter para las nuevas propiedades

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Afiliado [id=" + id + ", name=" + name + ", edad=" + edad +
               ", identificacion=" + identificacion + ", genero=" + genero +
               ", direccion=" + direccion + ", telefono=" + telefono +
               ", fechaNacimiento=" + fechaNacimiento + "]";
    }
}
