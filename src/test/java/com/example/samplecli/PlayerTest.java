package com.example.samplecli;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    @Test
    void constructPlayerWithConstructor() {
        Player player = new Player("❌");
        assertEquals("❌",player.getCharacter());
    }
}