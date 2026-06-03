package com.jcstudio.inmobiliaria.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "SESIONES")
public class Sesion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SES_ID")
    private Long sesId;

    // Relación: Muchas sesiones pueden pertenecer a un mismo usuario
    @ManyToOne
    @JoinColumn(name = "USR_ID", nullable = false)
    private Usuario usuario;

    @Column(name = "TOKEN", nullable = false, unique = true)
    private String token;

    @Column(name = "IP_ADDRESS", length = 45)
    private String ipAddress;

    @Column(name = "LOG_IN", nullable = false)
    private LocalDateTime logIn;

    @Column(name = "LAST_ACTIVITY")
    private LocalDateTime lastActivity;

    @Column(name = "LOG_OUT")
    private LocalDateTime logOut;

    // Constructor vacío (requerido por JPA)
    public Sesion() {}

    // Getters y Setters

    public Long getSesId() {
        return sesId;
    }

    public void setSesId(Long sesId) {
        this.sesId = sesId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public LocalDateTime getLogIn() {
        return logIn;
    }

    public void setLogIn(LocalDateTime logIn) {
        this.logIn = logIn;
    }

    public LocalDateTime getLastActivity() {
        return lastActivity;
    }

    public void setLastActivity(LocalDateTime lastActivity) {
        this.lastActivity = lastActivity;
    }

    public LocalDateTime getLogOut() {
        return logOut;
    }

    public void setLogOut(LocalDateTime logOut) {
        this.logOut = logOut;
    }
}