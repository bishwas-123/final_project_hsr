package com.hsr.demo.application.service;

import com.hsr.demo.application.model.Review;

import java.util.List;

public interface IReviewService {
    List<Review> findAll();
    Review save(Review review);
    Review findById(Integer reviewId);
}
