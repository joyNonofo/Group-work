 FOOTBALL – TRANSFER-MARKET

## Project Overview
Football-Transfer- Market is a Java application designed to manage and analyze football players based on their market value and rating. The system allows for sorting and searching operations on a list of players to assist in scouting, ranking, and comparison.

This project demonstrates core data structures and algorithms in Java including:
- Selection Sort
- Insertion Sort
- Linear Search
- Binary Search
- Custom Exceptions
- Class Encapsulation and Object-Oriented Principles

---

##Project Structure


com.football-transfer-fantasy/
 - Player.java          // Model class representing a football player
 -Club.java      //Method to buy a player from a club
 - Sorter.java      // Utility class for sorting/searching players
 - InvalidArrayException.java// Custom exception for error handling
 - MainPlayer.java   // Main class to run and test all features



 ##Classes and Responsibilities

1. Player.java
Represents a player with the following attributes:
- name (String)
-age(int)
-position(String)
- marketValue (int)
- rating (int)

Includes:
- Constructors
- Getters
-Setters

2. Sorter.java
Provides utility methods:
- selectionSortMV(Player[] array) – Sort players by market value using Selection Sort.
- insertionSortMV(Player[] array) – Sort players by market value using Insertion Sort.
- selectionSortRA(Player[] array) – Sort players by rating using Selection Sort.
- linearSearchMV(Player[] array, int target) – Find player index by market value using Linear Search.
- binarySearchMV(Player[] array, int target) – Find player by market value using Binary Search (requires pre-sorted array).

3. Club.java
-Method to buy a player from a Club by entering the player and the amount based on the Market Value

4. MainPlayer.java
Main class to demonstrate and test the project. It:
- Initializes a sample array of players.
- Performs sorting and searching using all the implemented methods.
- Catches exceptions and displays meaningful error messages.


##Features
- Sort players by market value or rating.
- Search players using linear or binary search.

- Console-based output for easy viewing of sorted/search results.


## How to Run

1. Compile the classes:
 bash
 javac Player.java Club.java Sorter.java MainPlayer.java
 2. Run the test:
 bash
 java MainPlayer

 ## Technology Used
-Java
-GitHub for Collaboration and version Control

## Repository link
- https://github.com/joyNonofo/Group-work/blob/main

