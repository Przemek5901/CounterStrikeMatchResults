/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.counterstrikematchresults.model;

/**
* Custom exception class representing an invalid number of rounds in a Counter Strike match result.
 * @author Przemyslaw Bednarz
 * @version 1.1
 */
public class InvalidRoundsNumberException extends Exception {
    
    /**
     * Constructor for the InvalidRoundsNumberException class with a specified error message.
     *
     * @param message The error message describing the reason for the exception.
     */
    public InvalidRoundsNumberException(String message) {
        super(message);
    }
}

