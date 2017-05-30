/*package app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import app.interfaces.*;
import app.models.*;
import app.repositories.*;

@Controller
@RequestMapping(path="/post")
public class PostController {
    @Autowired
    private PostRepository postRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Post> getAllPosts() {
        return postRepository.findAll();
    }
}

*/