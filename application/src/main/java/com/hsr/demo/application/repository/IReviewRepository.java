package com.hsr.demo.application.repository;

import com.hsr.demo.application.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReviewRepository extends JpaRepository<Review,Integer> {
}
