package com.zayyni.securityapplication.utils;

import com.zayyni.securityapplication.dto.PostDTO;
import com.zayyni.securityapplication.entities.User;
import com.zayyni.securityapplication.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class PostSecurity {

    private final PostService postService;

    public boolean isOwnerOfPost(Long postId) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        PostDTO postEntity = postService.getPostById(postId);
        return postEntity.getAuthor().getId().equals(user.getId());
    }



}
