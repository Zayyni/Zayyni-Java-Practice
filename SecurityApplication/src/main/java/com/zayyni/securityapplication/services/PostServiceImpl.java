package com.zayyni.securityapplication.services;

import com.zayyni.securityapplication.dto.PostDTO;
import com.zayyni.securityapplication.entities.PostEntity;
import com.zayyni.securityapplication.exceptions.ResourceNotFoundException;
import com.zayyni.securityapplication.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service @RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    private final ModelMapper modelMapper;

    @Override
    public List<PostDTO> getAllPosts() {
        return postRepository
                .findAll()
                .stream()
                .map(postEntity -> modelMapper.map(postEntity, PostDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public PostDTO createNewPost(PostDTO inputPost) {
        PostEntity postEntity = modelMapper.map(inputPost, PostEntity.class);
        return modelMapper.map(postRepository.save(postEntity),PostDTO.class);
    }

    @Override
    public PostDTO getPostById(Long postId) {
        PostEntity postEntity = postRepository
                .findById(postId)
                .orElseThrow(()-> new ResourceNotFoundException("Post not found"));
        return modelMapper.map(postEntity, PostDTO.class);
    }

    @Override
    public PostDTO updatePost(PostDTO inputPost, Long postId) {
        PostEntity olderPost = postRepository.findById(postId).orElseThrow(()-> new ResourceNotFoundException("Post not found"));
        inputPost.setId(postId);
        modelMapper.map(inputPost, olderPost);
        return modelMapper.map(postRepository.save(olderPost),PostDTO.class);
    }
}
