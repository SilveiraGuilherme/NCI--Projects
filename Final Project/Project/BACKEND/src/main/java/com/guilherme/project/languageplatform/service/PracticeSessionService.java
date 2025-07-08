package com.guilherme.project.languageplatform.service;

import com.guilherme.project.languageplatform.entity.PracticeSession;
import com.guilherme.project.languageplatform.repository.PracticeSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PracticeSessionService {

    @Autowired
    private PracticeSessionRepository practiceSessionRepository;

    public List<PracticeSession> getAllSessions() {
        return practiceSessionRepository.findAll();
    }

    public Optional<PracticeSession> getSessionById(Integer id) {
        return practiceSessionRepository.findById(id);
    }

    public PracticeSession saveSession(PracticeSession session) {
        return practiceSessionRepository.save(session);
    }

    public void deleteSession(Integer id) {
        practiceSessionRepository.deleteById(id);
    }
}