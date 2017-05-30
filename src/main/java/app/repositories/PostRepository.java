package app.repositories;

import org.springframework.data.repository.Repository;

import java.util.Optional;
import java.util.List;
import app.models.*;

public interface PostRepository extends Repository<Post, String> {
     
     void delete(Post toBeDeleted);
     List<Post> findAll();
     Optional<Post> findOne(String id);
     Post save(Post toBeSaved);


}
