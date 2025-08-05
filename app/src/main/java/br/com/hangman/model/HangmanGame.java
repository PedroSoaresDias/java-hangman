package br.com.hangman.model;

import java.util.List;

import static br.com.hangman.model.HangmanGameStatus.PENDING;

public class HangmanGame {
    private final static int HANGMAN_INITIAL_LINE_LENGTH = 9;
    private final static int HANGMAN_INITIAL_LINE_LENGTH_WITH_LINE_SEPARATOR = 10;

    private final int lineSize;
    private final List<HangmanChar> characters;

    private String hangman;
    private HangmanGameStatus hangmanGameStatus;

    public HangmanGame(final List<HangmanChar> characters) {
        var whiteSpace = " ".repeat(characters.size());
        var characterSpace = "-".repeat(characters.size());
        this.lineSize = HANGMAN_INITIAL_LINE_LENGTH_WITH_LINE_SEPARATOR + whiteSpace.length();
        this.hangmanGameStatus = PENDING;
        buildHangmanDesign(whiteSpace, characterSpace);
        this.characters = setCharacterSpacesPositionInGame(characters, whiteSpace.length());
    }
    
    private void buildHangmanDesign(final String whiteSpace, final String characterSpace) {
        this.hangman = "  -----  " + whiteSpace + System.lineSeparator() +
                "  |   |  " + whiteSpace + System.lineSeparator() +
                "  |   |  " + whiteSpace + System.lineSeparator() +
                "  |      " + whiteSpace + System.lineSeparator() +
                "  |      " + whiteSpace + System.lineSeparator() +
                "  |      " + whiteSpace + System.lineSeparator() +
                "  |      " + whiteSpace + System.lineSeparator() +
                "=========" + characterSpace + System.lineSeparator();
    }
    
    private List<HangmanChar> setCharacterSpacesPositionInGame(final List<HangmanChar> characters, final int whiteSpaceAmount) {
        final var LINE_LETTER = 6;
        for (int i = 0; i < characters.size(); i++) {
            characters.get(i).setPosition(this.lineSize * LINE_LETTER + HANGMAN_INITIAL_LINE_LENGTH + i);
        }

        return characters;
    }

    @Override
    public String toString() {
        return this.hangman;
    }
}
