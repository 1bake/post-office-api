package kz.dar.academy.java.spring.postofficeapi.controllers;

import kz.dar.academy.java.spring.postofficeapi.feign.PostOfficeFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/office")
public class PostOfficeController {

    @Autowired
    PostOfficeFeign postOfficeFeign;


    @GetMapping("/check")
    public String check(){
        return "Post-office-api is working";
    }

    @GetMapping("/post/check")
    public String checkPostOfficeFeignClient(){
        return postOfficeFeign.checkPost();
    }

    @GetMapping("/post/{postId}")
    public String getPostById(){
        return postOfficeFeign.getPostById();
    }

    @GetMapping("/post/all")
    public String getAllPosts(){
        return postOfficeFeign.getAllPosts();
    }

}
