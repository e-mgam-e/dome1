package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.model.Post;

import java.util.Date;
import java.util.List;
import java.util.Arrays;

@Service
public class PostService {

    public List<Post> listAllPosts() {
        // Создаем и возвращаем список из трех постов
        return Arrays.asList(
                new Post("Первый пост: Привет, мир!", new Date()),
                new Post("Второй пост: Изучаю Spring Boot", new Date()),
                new Post("Третий пост: Сентябрь всё ещё горит", new Date())
        );
    }
}
