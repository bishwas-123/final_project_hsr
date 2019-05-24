package com.hsr.demo.application.service;

import com.hsr.demo.application.model.Review;
import com.hsr.demo.application.repository.IReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService implements IReviewService {
    IReviewRepository reviewRepository;

    public ReviewService (IReviewRepository reviewRepository){
        this.reviewRepository=reviewRepository;
    }

    @Override
    public List<Review> findAll() {
        return reviewRepository.findAll();
    }

    @Override
    public Review save(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public Review findById(Integer reviewId) {
        return reviewRepository.findById(reviewId).orElse(null);
    }
}
