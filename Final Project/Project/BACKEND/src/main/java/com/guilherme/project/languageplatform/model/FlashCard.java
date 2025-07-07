package com.guilherme.project.languageplatform.model;

import jakarta.persistence.*;

@Entity
@Table(name = "FlashCard")

public class FlashCard {
    // Variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer flashCardID;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String sentence;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String translation;

    // Constructors
    public FlashCard() {
    }

    public FlashCard(String sentence, String translation) {
        this.sentence = sentence;
        this.translation = translation;
    }

    // Getters and Setters
    public Integer getFlashCardID() {
        return flashCardID;
    }

    public void setFlashCardID(Integer flashCardID) {
        this.flashCardID = flashCardID;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

}
