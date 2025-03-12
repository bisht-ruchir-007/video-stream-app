package com.app.practice.repository;

import com.app.practice.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {

    List<Video> findByDirectorContainingIgnoreCase(String director);

    List<Video> findByIsDelistedFalse();

    boolean existsByTitle(String title);
}
