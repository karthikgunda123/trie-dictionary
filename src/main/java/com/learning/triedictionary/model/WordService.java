package com.learning.triedictionary.model;

import java.util.List;

public interface WordService
{
    void addWord(Word word);
    List<Word> findAllWords();
}
