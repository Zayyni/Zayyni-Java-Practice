package com.zayyni.securityapplication.repositories;

import com.zayyni.securityapplication.entities.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity,Long> {
}
