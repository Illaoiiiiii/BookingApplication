package com.booker.application.service;

import com.booker.application.repository.FeedbackRepository;

public class FeedbackService {

	private FeedbackRepository feedbackRepository;
	public FeedbackService(FeedbackRepository feedbackRepository) {
		super();
		this.feedbackRepository = feedbackRepository;
	}
	
}
