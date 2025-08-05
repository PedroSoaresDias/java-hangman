package br.com.hangman.model;

public class HangmanChar {
    private final char character;
    private boolean isVisible;
    private int position;
    
    public HangmanChar(final char character) {
        this.character = character;
        this.isVisible = false;
    }
    
    public HangmanChar(final char character, final int position) {
        this.character = character;
        this.position = position;
        this.isVisible = true;
    }
    
    public char getCharacter() {
        return character;
    }

    public boolean isVisible() {
        return isVisible;
    }
    
    public boolean isInVisible() {
        return !isVisible;
    }

    public int getPosition() {
        return position;
    }

    public void enableVisibility() {
        isVisible = true;
    }

    public void setPosition(final int position) {
        this.position = position;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + character;
        result = prime * result + (isVisible ? 1231 : 1237);
        result = prime * result + position;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        HangmanChar other = (HangmanChar) obj;
        if (character != other.character)
            return false;
        if (isVisible != other.isVisible)
            return false;
        if (position != other.position)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "HangmanChar [character=" + character + ", isVisible=" + isVisible + ", position=" + position + "]";
    }

    
}
