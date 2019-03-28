package org.superbiz.moviefun.moviesapi;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestOperations;

import java.util.List;

public class AlbumsClient {

    private String albumsUrl;
    private RestOperations restOperations;

    public AlbumsClient (String albumsUrl, RestOperations restOperations){
        this.restOperations = restOperations;
        this.albumsUrl = albumsUrl;
    }

    public List<AlbumInfo> getAlbums() {
        return restOperations.getForEntity(albumsUrl, List.class).getBody();
    }

    public void addAlbum(AlbumInfo albumInfo) {
        restOperations.postForEntity(albumsUrl, albumInfo, null);
    }


    public AlbumInfo find(@PathVariable long id) {
        return restOperations.getForEntity(albumsUrl+"/"+ id, AlbumInfo.class).getBody();
    }


    public void deleteAlbum(AlbumInfo albumInfo){
        restOperations.delete(albumsUrl,albumInfo);
    }


    public void updateAlbum(AlbumInfo albumInfo){
        restOperations.put(albumsUrl,albumInfo);
    }
}
