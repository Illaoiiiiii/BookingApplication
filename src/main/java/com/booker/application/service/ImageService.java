package com.booker.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import com.booker.application.model.Image;
import com.booker.application.repository.ImageRepository;

public class ImageService {

	private ImageRepository imageRepository;

	public ImageService(ImageRepository imageRepository) {
		super();
		this.imageRepository = imageRepository;
	}

	@Transactional
	public List<Image> findAllImages() {
		return (List<Image>) imageRepository.findAll();
	}
	@Transactional
	public Optional<Image> findById(Integer imageId) {
		return imageRepository.findById(imageId);
	}
	@Transactional
	public void saveAll(List<Image> images) {
		imageRepository.saveAll(images);
	}
	@Transactional
	public void delete(Image image) {
		imageRepository.delete(image);
	}
	@Transactional
	public Image save(Image image) {
		return imageRepository.save(image);
	}
	

}
