package com.mse.forum.persistance;

import org.springframework.data.jpa.repository.JpaRepository;


import com.mse.forum.persistance.entities.ScoreEntity;

public interface ScoreRepository extends JpaRepository<ScoreEntity, Long> {

}
