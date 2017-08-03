package io.joel.controllers;

import io.joel.models.Playlist;
import io.joel.repositories.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    PlaylistRepository playlistRepo;

    @RequestMapping("/")
    public String index() {
        Iterable<Playlist> lists = playlistRepo.findAll();
        return "index";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }
}
