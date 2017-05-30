package app.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
import java.util.Optional;
 
import static java.util.stream.Collectors.toList;

import app.DTOs.*;
import app.models.Post;
import app.repositories.*;

public final class MongoDBPostService implements PostService {

    private final PostRepository repository;

    @Autowired
    MongoDBPostService(PostRepository _repository) {
        this.repository = _repository;
    }

    /*@Override
    public PostDTO create(PostDTO toCreate) {
        Post toPersist = Post.getBuilder(toCreate.getDate(), toCreate.getOwner(), toCreate.getTitle(), ).
    }*/
}