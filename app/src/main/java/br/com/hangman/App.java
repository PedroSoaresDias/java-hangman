package br.com.hangman;

import java.util.stream.Stream;

import br.com.hangman.model.HangmanChar;
import br.com.hangman.model.HangmanGame;

public class App {
    
    public static void main(String... args) {
        var characters = Stream.of(args)
            .map(a -> a.toLowerCase().charAt(0))
                .map(HangmanChar::new).toList();
            
        System.out.println(characters);
        var hangmanGame = new HangmanGame(characters);
        System.out.println(hangmanGame);
        hangmanGame.inputCharacter('t');
        System.out.println(hangmanGame);
        hangmanGame.inputCharacter('e');
        System.out.println(hangmanGame);
        hangmanGame.inputCharacter('s');
        // System.out.println(hangmanGame);
        // hangmanGame.inputCharacter('t');
        // System.out.println(hangmanGame);
        // hangmanGame.inputCharacter('e');
        // System.out.println(hangmanGame);
        // hangmanGame.inputCharacter('t');
        // System.out.println(hangmanGame);
        // hangmanGame.inputCharacter('e');
        // System.out.println(hangmanGame);
        // hangmanGame.inputCharacter('s');
        // System.out.println(hangmanGame);
        // hangmanGame.inputCharacter('t');
        // System.out.println(hangmanGame);
        // hangmanGame.inputCharacter('e');
    }
}
