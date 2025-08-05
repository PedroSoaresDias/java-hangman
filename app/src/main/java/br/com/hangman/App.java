package br.com.hangman;

import java.util.stream.Stream;

import br.com.hangman.model.HangmanChar;
import br.com.hangman.model.HangmanGame;

public class App {
    
    public static void main(String[] args) {
        var characters = Stream.of(args)
            .map(a -> a.toLowerCase().charAt(0))
                .map(HangmanChar::new).toList();
            
        System.out.println(characters);
        System.out.println(new HangmanGame(characters));
    }
}
