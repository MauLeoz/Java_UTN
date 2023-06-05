package org.example;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Persona {
    private boolean active;
    private int id;
    private int age;
    private String eyeColor;
    private String nombre;
    private String genero;
    private String registered;
    private double latitude;
    private double longitude;
    private List<String> tags;
    private List<Book> book;
    public Persona() {
    }

    public Persona(boolean active, int id, int age, String eyeColor, String nombre, String genero, String registered, double latitude, double longitude, List<String> tags, List<Book> book) {
        this.active = active;
        this.id = id;
        this.age = age;
        this.eyeColor = eyeColor;
        this.nombre = nombre;
        this.genero = genero;
        this.registered = registered;
        this.latitude = latitude;
        this.longitude = longitude;
        this.tags = tags;
        this.book = book;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }



    @JsonProperty("book")
    public List<Book> getBook() {
        return book;
    }

    @JsonProperty("book")
    public void setBook(List<Book> book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "active=" + active +
                ", id=" + id +
                ", age=" + age +
                ", eyeColor='" + eyeColor + '\'' +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", registered='" + registered + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", tags=" + tags +
                ", book=" + book +
                '}';
    }
}
