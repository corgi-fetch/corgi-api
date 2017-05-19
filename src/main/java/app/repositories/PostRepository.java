package app.repositories;

import org.springframework.data.repository.CrudRepository;

import app.models.*;

public interface PostRepository extends CrudRepository<Post, Long> {

}
