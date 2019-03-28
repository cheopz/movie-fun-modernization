package org.superbiz.moviefun.albums;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumsController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final AlbumsRepository albumsRepository;


    public AlbumsController(AlbumsRepository albumsRepository) {
        this.albumsRepository = albumsRepository;

    }

    @PostMapping
    public void addAlbum(@RequestBody Album album) {
        albumsRepository.addAlbum(album);
    }

    @GetMapping("/{id}")
    public Album find(@PathVariable long id) {
        return albumsRepository.find(id);
    }

    @GetMapping
    public List<Album> getAlbums(){
        return albumsRepository.getAlbums();
    }

    @DeleteMapping
    public void deleteAlbum(Album album){
        albumsRepository.deleteAlbum(album);
    }

    @PutMapping
    public void updateAlbum(Album album){
        albumsRepository.updateAlbum(album);
    }
}
