package com.jdzl.models;

public class User {

    private String nombre;
    private String cedula;
    private String correo;
    private String url_reporte;
    private boolean enviar_correo;

    public User(String nombre, String cedula, String correo, String url_reporte) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.url_reporte = url_reporte;
        this.enviar_correo = false;
    }
    public User(String nombre, String cedula, String correo, String url_reporte, boolean enviar_correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.url_reporte = url_reporte;
        this.enviar_correo = enviar_correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUrl_reporte() {
        return url_reporte;
    }

    public void setUrl_reporte(String url_reporte) {
        this.url_reporte = url_reporte;
    }

    public boolean isEnviar_correo() {
        return enviar_correo;
    }

    public void setEnviar_correo(boolean enviar_correo) {
        this.enviar_correo = enviar_correo;
    }
}
