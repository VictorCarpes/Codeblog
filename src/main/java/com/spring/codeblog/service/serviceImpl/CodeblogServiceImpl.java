package com.spring.codeblog.service.serviceImpl;

import com.spring.codeblog.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.codeblog.repository.CodeblogRepository;
import com.spring.codeblog.service.CodeblogService;

import java.util.List;

@Service
public class CodeblogServiceImpl implements CodeblogService {

    @Autowired
    CodeblogRepository codeblogRepository;
    @Override
    public List<Post> findAll() {
        return codeblogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return codeblogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return codeblogRepository.save(post);
    }
}
