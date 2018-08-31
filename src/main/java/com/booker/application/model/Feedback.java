package com.booker.application.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feedback {
	
	@Id
	private int feedbackId;
	private String feedback;
	private float rate;
	
	public int getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	
}
