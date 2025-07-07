// Helper class required for a table with a composite primary key
// The unique identifier for this table is made of two fields together.

package com.guilherme.project.languageplatform.model;

import java.io.Serializable; // Required by JPA to allow object comparison and caching
import java.util.Objects;

public class PracticeSessionFlashCardId implements Serializable {
    // Variables
    private Integer session;
    private Integer flashCard;

    // Constructors
    public PracticeSessionFlashCardId() {
    }

    public PracticeSessionFlashCardId(Integer session, Integer flashCard) {
        this.session = session;
        this.flashCard = flashCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof PracticeSessionFlashCardId that))
            return false;
        return Objects.equals(session, that.session) && Objects.equals(flashCard, that.flashCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(session, flashCard);
    }
}
