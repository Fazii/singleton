package com.nowakowski.singleton.entity;

public class UserEntity extends Entity {

    private String id;

    private String imie;

    private String nazwisko;

    private String rok;

    private String kara;

    public UserEntity() {
    }

    public UserEntity(String id, String imie, String nazwisko, String rok, String kara) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rok = rok;
        this.kara = kara;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getRok() {
        return rok;
    }

    public void setRok(String rok) {
        this.rok = rok;
    }

    public String getKara() {
        return kara;
    }

    public void setKara(String kara) {
        this.kara = kara;
    }

    @Override
    public String toString() {
        return "UserEntity{"
            + "id='"
            + id
            + '\''
            + ", imie='"
            + imie
            + '\''
            + ", nazwisko='"
            + nazwisko
            + '\''
            + ", rok='"
            + rok
            + '\''
            + ", kara='"
            + kara
            + '\''
            + '}';
    }
}
