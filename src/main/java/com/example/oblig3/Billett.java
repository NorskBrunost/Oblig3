package com.example.oblig3;



public class Billett {
    private String film;
    private String billettAntall;
    private String fornavn;
    private String etternavn;
    private String telefonnr;
    private String epost;

    public Billett(String film, String billettAntall, String fornavn, String etternavn, String telefonnr, String epost) {
        this.film = film;
        this.billettAntall = billettAntall;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefonnr = telefonnr;
        this.epost = epost;
    }

    public String getFilm() {
        return film;
    }
    public String getBillettAntall() {
        return billettAntall;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public String getEpost() {
        return epost;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public void setBillettAntall(String billettAntall) {
        this.billettAntall = billettAntall;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }
}