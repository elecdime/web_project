package com.firstproject.web.Repository;

import com.firstproject.web.controllers.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts ,Long> {

}
