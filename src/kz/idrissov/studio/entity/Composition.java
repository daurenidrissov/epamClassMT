package kz.idrissov.studio.entity;

public class Composition {
    private String singer;
    private String name;
    private String author;
    private String album;
    private String genre;
    private int durationInSec;

    public Composition(String singer, String name, String author, String album, String genre, int durationInSec) {
        this.singer = singer;
        this.name = name;
        this.author = author;
        this.album = album;
        this.genre = genre;
        this.durationInSec = durationInSec;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDurationInSec() {
        return durationInSec;
    }

    public void setDurationInSec(int durationInSec) {
        this.durationInSec = durationInSec;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "[" + singer + " - " + name + ", duration: " + durationInSec
                + "] (author: " + author + ", genre: " + genre + ", from " + album + " album)";
    }
}
