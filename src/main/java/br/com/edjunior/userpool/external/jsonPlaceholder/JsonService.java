package br.com.edjunior.userpool.external.jsonPlaceholder;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.edjunior.userpool.external.jsonPlaceholder.dto.PostDto;

@Service
public class JsonService {
    private final RestTemplate restTemplate = new RestTemplate();
    private final String baseUrl = "https://jsonplaceholder.typicode.com";

    public PostDto getPost(Long postId) {
        String url = baseUrl + "/posts/" + postId;
        return restTemplate.getForObject(url, PostDto.class);
    }

    public PostDto createPost(PostDto newPost) {
        String url = baseUrl + "/posts";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        HttpEntity<PostDto> request = new HttpEntity<>(newPost, headers);
        return restTemplate.postForObject(url, request, PostDto.class);
    }
}
