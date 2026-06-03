package com.jcstudio.inmobiliaria.model;

import jakarta.persistence.*;

@Entity
@Table(name = "PROPIEDADES") // Nombre de tu tabla en mayúsculas
public class Propiedad {

    @Id // Marca esta columna como la clave primaria
    @Column(name = "PROP_ID")
    private int propId;

    @Column(name = "SUPERFICIE") // Nombre de tu columna en mayúsculas
    private Double superficie;

    @Column(name = "PRECIO") // Este es el nombre en la BD
    private Double precio;   // Este es el nombre que usará el JSON



    @Column(name = "PRECIO_CON_IVA", insertable = false, updatable = false)
    private Double precioConIva;

    @Column(name = "DIRECCION", length = 500)
    private String direccion;

    @Column(name = "ESTADO", length = 20)
    private String estado;

    // Constructor vacío (obligatorio para Hibernate)
    public Propiedad() {}

    // Constructor con parámetros (opcional, útil para crear objetos nuevos)
    public Propiedad(int propId, Double superficie) {
        this.propId = propId;
        this.superficie = superficie;
    }

    // Getters y Setters
    public int getPropId() {
        return propId;
    }

    public void setPropId(int propId) {
        this.propId = propId;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    public Double getPrecioConIva() {
        return precioConIva;
    }

    public void setPrecioConIva(Double precioConIva) {
        this.precioConIva = precioConIva;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Asegúrate de tener este Getter
    public Double getPrecio() {
        return precio;
    }
}