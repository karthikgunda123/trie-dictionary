package com.learning.triedictionary;

import com.learning.triedictionary.model.Word;
import com.learning.triedictionary.model.WordService;
import com.learning.triedictionary.services.TrieService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class TrieController
{
    @Autowired
    TrieService trieService;

    @Autowired
    private WordService wordService;

    @GetMapping("/")
    public ModelAndView intro() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");

        // Adding Database data into the trie.
        List<Word> words = wordService.findAllWords();

        if (!words.isEmpty()) {
            for (Word word : words) {
                String w = word.getWord();
                trieService.insertKey(w);
            }
        }
        return modelAndView;
    }

    @PostMapping("adding")
    public ModelAndView addingData(HttpServletRequest request) {
        String word = request.getParameter("word");

        ModelAndView modelAndView = new ModelAndView("index");

        trieService.insertKey(word);
        Word word1 = new Word();
        word1.setWord(word);
        wordService.addWord(word1);

        modelAndView.addObject("message", "The added word is " + word);
        return modelAndView;
    }

    @GetMapping("search")
    public ModelAndView search() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("searchWord");
        return modelAndView;
    }

    @PostMapping("searching")
    public ModelAndView searchingData(HttpServletRequest request) {
        String word = request.getParameter("word");

        ModelAndView modelAndView = new ModelAndView("searchWord");

        boolean result = trieService.searchKey(word);

        if (result){
            modelAndView.addObject("message", "The searched word is found");
        }
        else {
            modelAndView.addObject("message", "The searched word is not found");
        }

        return modelAndView;
    }
}
