/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.counterstrikematchresults.model;

/**
 * Class representing a Counter Strike player.
 * @author Przemyslaw Bednarz
 * @version 1.1
 */
public class Player {
    private String nickName;

    /**
     * Constructor for the Player class with a specified nickname.
     *
     * @param nickName The nickname of the player.
     */
    public Player(String nickName) {
        this.nickName = nickName;
    }

    /**
     * Get the nickname of the player.
     *
     * @return The player's nickname.
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Set the nickname of the player.
     *
     * @param nickName The nickname to be set.
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
