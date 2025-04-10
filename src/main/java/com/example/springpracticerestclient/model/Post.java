package com.example.springpracticerestclient.model;

public record Post(
        Integer id,
        Integer userId,
        String title,
        String body
) {
}
