package com.learning.triedictionary.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordServiceImpl implements WordService
{
    @Autowired
    private WordRepository wordRepository;

    @Override
    public void addWord(Word word) {
        wordRepository.save(word);
    }

    @Override
    public List<Word> findAllWords() {
        return wordRepository.findAll();
    }
}
