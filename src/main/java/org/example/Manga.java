package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Manga {
    private int id;
    private String nombre;
    private String fecha_pub;
    private int paginas;


    public Manga(int id,String nombre,String fecha_pub, int paginas){
        this.id = id;
        this.nombre = nombre;
        this.fecha_pub = fecha_pub;
        this.paginas = paginas;
    }

    public Manga(String  nombre,String fecha_pub,int paginas){
        this.id = -1;
        this.nombre = nombre;
        this.fecha_pub = fecha_pub;
        this.paginas = paginas;
    }

    public Manga(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_pub() {
        return fecha_pub;
    }

    public void setFecha_pub(String fecha_pub) {
        this.fecha_pub = fecha_pub;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString(){
        return this.nombre + " - " + " Fecha Publicacion: " + this.fecha_pub +  " - " + "Paginas: " + this.paginas;
    }
}