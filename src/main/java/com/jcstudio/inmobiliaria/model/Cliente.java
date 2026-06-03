package com.jcstudio.inmobiliaria.model;

import jakarta.persistence.*;


    @Entity
    @Table(name = "CLIENTES")
    public class Cliente {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "CLIENTE_ID")
        private Long clienteId;

        @Column(name = "NOMBRE", nullable = false)
        private String nombre;

        @Column(name = "AP_PATERNO", nullable = false)
        private String apPaterno;

        @Column(name = "AP_MATERNO")
        private String apMaterno;

        @Column(name = "TELEFONO")
        private String telefono;

        @Column(name = "EMAIL")
        private String email;

        // Genera aquí tus Getters y Setters


        public Long getClienteId() {
            return clienteId;
        }

        public void setClienteId(Long clienteId) {
            this.clienteId = clienteId;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApPaterno() {
            return apPaterno;
        }

        public void setApPaterno(String apPaterno) {
            this.apPaterno = apPaterno;
        }

        public String getApMaterno() {
            return apMaterno;
        }

        public void setApMaterno(String apMaterno) {
            this.apMaterno = apMaterno;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

