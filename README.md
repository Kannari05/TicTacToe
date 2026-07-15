# Tic Tac Toe

A console-based implementation of the classic Tic Tac Toe game developed in Java. The application enables two players to compete in a turn-based game while enforcing game rules, validating user input, and determining win or draw conditions.

## Overview

This project demonstrates the implementation of core Java programming concepts through a simple interactive game. It focuses on clean program structure, modular design, and logical problem-solving using arrays, methods, loops, and conditional statements.

## Features

- Two-player turn-based gameplay
- Interactive console interface
- Input validation for row and column values
- Prevention of duplicate moves on occupied cells
- Automatic win detection for rows, columns, and diagonals
- Automatic draw detection when the board is full
- Real-time board updates after each move

## Technologies Used

- Java
- Object-Oriented Programming
- 2D Arrays
- Scanner Class
- Control Statements
- Methods and Modular Programming

## Project Structure

```
TicTacToe/
│── TicTacToe.java
└── README.md
```

## Game Rules

- Player **X** always starts the game.
- Players take turns entering the row and column (1–3).
- A player wins by placing three identical symbols in:
  - Any row
  - Any column
  - Either diagonal
- If all nine cells are occupied without a winner, the game ends in a draw.

## Getting Started

### Prerequisites

- Java JDK 8 or later
- Command Prompt / Terminal

### Clone the Repository

```bash
git clone https://github.com/Kannari05/TicTacToe.git
```

### Compile

```bash
javac TicTacToe.java
```

### Run

```bash
java TicTacToe
```

## Sample Execution

```
Board:

   |   |
---+---+---
   |   |
---+---+---
   |   |

Player X, enter row and column (1-3):
1 1

Board:

 X |   |
---+---+---
   |   |
---+---+---
   |   |
```

### Winning Scenario

```
Player X wins!
```

### Draw Scenario

```
It's a draw!
```

## Project Highlights

- Modular implementation using dedicated methods
- Efficient winner validation logic
- Clean and readable code structure
- User-friendly console interaction
- Suitable for beginners learning Java programming fundamentals

## Future Enhancements

- Single-player mode with AI (Minimax Algorithm)
- Graphical User Interface using Java Swing or JavaFX
- Score tracking across multiple games
- Restart game without restarting the application
- Difficulty levels for AI
- Improved exception handling for invalid inputs

## Learning Outcomes

This project helped strengthen understanding of:

- Java fundamentals
- Object-Oriented Programming concepts
- 2D array manipulation
- User input handling
- Game logic implementation
- Problem-solving and algorithmic thinking

## License

This project is licensed under the MIT License.

## Author

**Kannari Meghana**

- GitHub: https://github.com/Kannari05
- LinkedIn: *(Add your LinkedIn profile here)*
