package com.booker.application.service;

import com.booker.application.repository.ImageRepository;

public class ImageService {

	private ImageRepository imageRepository;

	public ImageService (ImageRepository imageRepository) {
		super();
		this.imageRepository = imageRepository;
	}
	
}
