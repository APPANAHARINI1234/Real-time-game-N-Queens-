# N-Queens Solver

N-Queens Solver is a Java-based application that allows users to solve the N-Queens problem on a dynamically sized chessboard.

## Problem Description

The N-Queens problem is to place N queens on an N-by-N chessboard so that no two queens threaten each other. A queen threatens another queen if they are in the same row, column, or diagonal.

## Project Structure

The project is organized into three packages:

1. `board`: Contains the `Board` class representing the chessboard.
2. `player`: Contains the `Player` class representing the player.
3. `logic`: Contains the `Logic` class implementing the game logic.

## Classes

### `Board`

- The `Board` class represents the chessboard.
- Users can specify the size of the board.
- All cells are initially filled with the default character 'X'.
- Queens are represented by the character 'Q'.
- Provides methods to access and manipulate the board configuration.
- The `getBoardConfig()` method returns the current configuration of the board.

### `Player`

- The `Player` class manages player details.
- The `getDetails()` method provides player details.

### `Logic`

- The `Logic` class contains methods for checking if it's safe to place a queen in a given position and if the game is won.
- `isSafe(row, col)`: Checks if it's safe to place a queen at the specified row and column.
- `isWinner()`: Checks if the game is won, i.e., all queens are successfully placed on the board according to the rules.

