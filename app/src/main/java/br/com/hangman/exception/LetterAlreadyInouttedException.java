package br.com.hangman.exception;

public class LetterAlreadyInouttedException extends RuntimeException {
    public LetterAlreadyInouttedException(final String message) {
        super(message);
    }
}
