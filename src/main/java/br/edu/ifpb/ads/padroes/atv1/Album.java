package br.edu.ifpb.ads.padroes.atv1;

public class Album {

    private String artist;
    private String title;
    private String genre;
    private int releaseDate;

    public Album(String artist, String title, String genre, int releaseDate) {
        this.artist = artist;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}
