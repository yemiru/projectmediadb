package com.java.cmsc495.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.cmsc495.model.Video;


@Repository
public interface VideoRepository extends CrudRepository<Video,Integer>{

}
