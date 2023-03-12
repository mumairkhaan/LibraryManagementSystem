
// this is an example of a DSL (Domain-Specific Language)
package com.ybrikman.funky.tictactoe;

import com.google.common.collect.ImmutableList;

import java.util.Optional;

public class BoardDsl {

    public static Optional<Player> x() {
        return Optional.of(Player.X);
    }

    public static Optional<Player> o() {
        return Optional.of(Player.O);
    }

    public static Optional<Player> empty() {
        return Optional.empty();
    }

    @SafeVarargs
    public static Board board(Optional<Player> ... players) {
        return new Board(ImmutableList.<Optional<Player>>builder().add(players).build());
    }
}

// EXPLANATION:


// Here the BoardDsl class provides methods that allow you to create a Board object with a specific configuration of Player objects. 
// The methods x(), o() and empty() create Optional<Player> objects representing the Player values X, O, and empty, respectively.
// The board() method takes an array of Optional<Player> objects and returns a Board object that is constructed from 
// an ImmutableList of those players.

// these methods allow us to create a Board object with a concise and  easy-to-read syntax. this class serves as a DSL for 
// configuring Board objects in a specific way.
