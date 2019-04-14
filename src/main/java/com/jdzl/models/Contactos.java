package com.jdzl.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

public class Contactos {
    String nombre;
    String foto;
    @JsonIgnore
    MultipartFile file;
    public Contactos(){}

    public Contactos(String nombre, String foto, MultipartFile file) {
        this.nombre = nombre;
        this.foto = foto;
        this.file = file;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
