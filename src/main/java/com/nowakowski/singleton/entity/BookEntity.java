package com.nowakowski.singleton.entity;

public class BookEntity extends Entity {

    private String id;

    private String tytul;

    private String autor;

    private String user_id;

    public BookEntity() {
    }

    public BookEntity(String id, String tytul, String autor, String user_id) {
        this.id = id;
        this.tytul = tytul;
        this.autor = autor;
        this.user_id = user_id;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTutul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "BookEntity{"
            + "id='"
            + id
            + '\''
            + ", tytul='"
            + tytul
            + '\''
            + ", autor='"
            + autor
            + '\''
            + ", user_id='"
            + user_id
            + '\''
            + '}';
    }
}
