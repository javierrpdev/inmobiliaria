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
}