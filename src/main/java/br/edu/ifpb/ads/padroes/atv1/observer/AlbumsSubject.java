package br.edu.ifpb.ads.padroes.atv1.observer;

import br.edu.ifpb.ads.padroes.atv1.Album;

import java.util.LinkedList;
import java.util.List;

public class AlbumsSubject extends Subject<Album> {

    private final List<Album> albums = new LinkedList<>();

    public List<Album> findAlbum(String title) {
        return albums.stream().filter(d -> d.getTitle().toLowerCase()
                .contains(title.toLowerCase())).toList();
    }

    public List<Album> findAlbumByArtist(String artist) {
        return albums.stream().filter(d -> d.getArtist().toLowerCase()
                .contains(artist.toLowerCase())).toList();
    }

    public List<Album> findAlbumByGenre(String genre) {
        return albums.stream().filter(d -> d.getGenre().toLowerCase()
                .contains(genre.toLowerCase())).toList();
    }

    public List<Album> findAlbumByReleaseDate(int releaseDate) {
        return albums.stream().filter(d -> d.getReleaseDate() == releaseDate).toList();
    }

    public void addAlbum(Album album) {
        albums.add(album);
        super.notifyObservers(album);
    }

    public void removeAlbum(Album album) {
        albums.remove(album);
    }
}
