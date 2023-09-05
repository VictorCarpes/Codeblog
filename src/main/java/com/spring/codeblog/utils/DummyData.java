package com.spring.codeblog.utils;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    CodeblogRepository codeblogRepository;

    //@PostConstruct
    public void savePosts(){

        List<Post> postList = new ArrayList<>();

        Post post1 = new Post();
        post1.setAutor("Victor Carpes");
        post1.setData(LocalDate.now());
        post1.setTitulo("Docker");
        post1.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus tempor consectetur neque, vitae congue tortor " +
                "pharetra at. In efficitur massa vitae arcu rhoncus, mollis aliquam diam faucibus. Integer commodo sem quis nibh ullamcorper" +
                " accumsan. Vestibu orci luctus et ultrices posuere cubilia curae; Morbi ultrices tincidunt" +
                " lectus, ut auctor augue eleifend eu. Suspendisse finibus odio ut sem hendrerit, non eleifend est tincidunt. Suspendisse " +
                "potenti. Sed felis nunc, eleifend eget augue nec, lacinia volutpat lectus. Vivamus nisi libero, hendrerit sed feugiat et," +
                " fringilla id dui. Phasellus porta, lectus a auctor facilisis, nisl ante tempor nulla, non pellentesque tellus quam sit " +
                "amet sapien.");


        Post post2 = new Post();
        post2.setAutor("Victor Carpes");
        post2.setData(LocalDate.now());
        post2.setTitulo("API REST");
        post2.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus tempor consectetur neque, vitae congue tortor " +
                "pharetra at. In efficitur massa vitae arcu rhoncus, mollis aliquam diam faucibus. Integer commodo sem quis nibh ullamcorper" +
                " accumsan. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Morbi ultrices tincidunt" +
                " lectus, ut auctor augue eleifend eu. Suspendisse finibus odio ut sem hendrerit, non eleifend est tincidunt. Suspendisse " +
                "potenti. Sed felis nunc, eleifend eget augue nec, lacinia volutpat lectus. Vivamus nisi libero, hendrerit sed feugiat et," +
                " fringilla id dui. Phasellus porta, lectus a auctor facilisis, nisl ante tempor nulla, non pellentesque tellus quam sit " +
                "amet sapien.");

        postList.add(post1);
        postList.add(post2);

        for (Post post : postList){
            Post postSaved = codeblogRepository.save(post);
            System.out.println(postSaved.getId());
        }

    }


}
