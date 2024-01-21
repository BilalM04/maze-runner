package ca.mcmaster.se2aa4.mazerunner;

public enum Tile {
    WALL('#'), EMPTY(' ');

    private final char symbol;

    Tile(char symbol) { 
        this.symbol = symbol; 
    }

    public String toString() { 
        return "" + symbol; 
    }
}
