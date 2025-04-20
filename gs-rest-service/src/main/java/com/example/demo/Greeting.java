package com.example.demo;

public record Greeting(long id, String content, boolean isBrand) {
    public boolean isVIP (String content) {
        return content.contains("hao");
    }
}
