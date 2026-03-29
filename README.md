# score-board
# Live Football World Cup Scoreboard

## Overview

This project is a simple Java library that implements a Live Football World Cup Scoreboard. It allows tracking of ongoing football matches and their scores in real time.

The implementation follows the given requirements, focusing on simplicity, clean code, and in-memory data storage.

## Features

The scoreboard supports the following operations:

* **Start a new match**

  * Adds a match with an initial score of 0–0
  * Requires:

    * Home team
    * Away team

* **Update score**

  * Updates the score of an existing match using absolute values

* **Finish match**

  * Removes a match from the scoreboard

* **Get match summary**

  * Returns matches ordered by:

    1. Total score (descending)
    2. Most recently started match (if scores are equal)

## Technologies Used

* **Java 17**
* **Maven**
* **IntelliJ IDEA**


## Testing

I attempted to follow **Test-Driven Development (TDD)** while developing this solution.
As this was my first time working with TDD, I did my best to write tests alongside the implementation and cover the main functionality of the system.


## How to Run

This project was developed and tested using **IntelliJ IDEA**.

To run the project:

1. Open the project in IntelliJ IDEA
2. Allow Maven dependencies to load
3. Run the test classes directly from the IDE

