package com.learning.triedictionary.services;

import org.springframework.stereotype.Service;

@Service
public class Trie implements TrieService
{
    TrieNode head = new TrieNode();

    // Method to insert a key into the Trie
    @Override
    public void insertKey(String word) {
        TrieNode temp = head;
        for(char ch : word.toCharArray()) {
            int idx = getCharIndex(ch);
            if (temp.children[idx] == null) {
                TrieNode child = new TrieNode();
                temp.children[idx] = child;
            }
            temp = temp.children[idx];
        }
        temp.EOW = true;
    }


    @Override
    // Method to search a key in the Trie
    public boolean searchKey(String word) {
        TrieNode temp = head;
        for (char ch : word.toCharArray()) {
            int idx = getCharIndex(ch);
            if (temp.children[idx] == null) {
                return false;
            }
            temp = temp.children[idx];
        }
        return temp.EOW;
    }

    // Helper method to calculate the index based on the character
    public int getCharIndex(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return ch - 'a';  // Lowercase characters (0-25)
        } else if (ch >= 'A' && ch <= 'Z') {
            return ch - 'A' + 26;  // Uppercase characters (26-51)
        }
        return -1;  // If it's not a valid character
    }
}
