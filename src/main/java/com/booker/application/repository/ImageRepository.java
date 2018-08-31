package com.booker.application.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.booker.application.model.Image;

@Repository
public interface ImageRepository extends CrudRepository<Image, Integer> {

}
