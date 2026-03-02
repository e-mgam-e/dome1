package com.example.demo.service;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikesService {
    @Autowired
    private PostService postService;
    @Autowired
    private PostRepository postRepository;

    public int like(Long postId) {
        // Находим пост по индексу (как просили в задании)
        //Post post = postService.listAllPosts().get(postId.intValue());
        final Post post = postRepository.findById(postId).get();
        post.setLikes(post.getLikes() + 1);
        postRepository.save(post);
        return post.getLikes();
    }
}
