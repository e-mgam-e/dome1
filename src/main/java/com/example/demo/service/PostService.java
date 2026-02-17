package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.model.Post;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Arrays;

@Service
public class PostService {

    private List<Post> posts = new ArrayList<>();
    //блок инициализации первоначальных запросов
    {
        posts.add(new Post("Первый пост: Привет, мир!", new Date()));
        posts.add(new Post("Второй пост: Изучаю Spring Boot", new Date()));
        posts.add(new Post("Третий пост: Сентябрь всё ещё горит", new Date()));
    }
    public List<Post> listAllPosts() {
        // Создаем и возвращаем список из трех постов
        return posts;
    }
    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}
