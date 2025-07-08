package com.guilherme.project.languageplatform.repository;

import com.guilherme.project.languageplatform.entity.PracticeSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PracticeSessionRepository extends JpaRepository<PracticeSession, Integer> {
}