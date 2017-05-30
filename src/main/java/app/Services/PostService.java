package app.Services;
 
import java.util.List;
import app.DTOs.*;

public interface PostService {
    PostDTO create(PostDTO post);
    PostDTO delete(PostDTO post);
    List<PostDTO> findAll();
    PostDTO findById(String id);
    PostDTO update(PostDTO post);

}
 

