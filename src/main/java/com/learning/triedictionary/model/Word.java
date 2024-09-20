package com.learning.triedictionary.model;

import jakarta.persistence.*;

@Entity
@Table(name = "word_table")
public class Word
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String word;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
