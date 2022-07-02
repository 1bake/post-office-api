package kz.dar.academy.java.spring.postofficeapi.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name = "post-core-api")
public interface PostOfficeFeign {

    @GetMapping("/post/check")
    String checkPost();

    @GetMapping("/post/all")
    String getAllPosts();

    @GetMapping("/post/{postId}")
    String getPostById();

    
}
