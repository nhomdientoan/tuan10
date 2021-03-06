package bootsample.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bootsample.dao.PostRepository;
import bootsample.model.Post;;

@Service
@Transactional
public class PostService {

	@Autowired
	private PostRepository postRepository;

	public PostService(PostRepository postRepository) {
		this.postRepository = postRepository;
	}
	
	public List<Post> findAll(){
		List<Post> tasks = new ArrayList<>();
		for(Post task : postRepository.findAll()){
			tasks.add(task);
		}
		return tasks;
	}
	
	public Post findOne(int id){
		return postRepository.findOne(id);
	}
	
	public void save(Post task){
		postRepository.save(task);
	}
	
	public void delete(int id){
		postRepository.delete(id);
	}
}
