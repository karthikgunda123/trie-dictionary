package com.learning.triedictionary.services;

public class TrieNode {

    TrieNode[] children;  // Support for 26 lowercase + 26 uppercase letters
    boolean EOW;  // End Of Word flag

    public TrieNode(){
        children = new TrieNode[52];
        EOW = false;
    }
}

