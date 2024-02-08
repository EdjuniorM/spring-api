package br.com.edjunior.userpool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.edjunior.userpool.external.jsonPlaceholder.JsonService;
import br.com.edjunior.userpool.external.jsonPlaceholder.dto.PostDto;

@RestController
@RequestMapping(value = "/post")
public class JsonPlaceholderController {

    @Autowired
    private JsonService jsonPlaceholderService;

    @GetMapping("/{id}")
    public PostDto getPost(@PathVariable("id") Long id) {
        return jsonPlaceholderService.getPost(id);
    }
}
