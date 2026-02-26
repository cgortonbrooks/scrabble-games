# Lesson: Reading & Analyzing CSV Data in Java

## Overview

In this lesson you will practice **file I/O**, **String manipulation**, and **ArrayList traversal** — all topics covered on the AP Computer Science A exam — by analysing a real-world dataset of competitive Scrabble games.

**Goal:** Read a CSV file of Scrabble tournament results and determine which player **lost the most games**.

---

## Files in This Project

| File | Purpose |
|---|---|
| `scrabble_games.csv` | Full dataset — ~1.5 million games |
| `scrabble_games_sample.csv` | Smaller 5,000-row excerpt for faster testing |
| `ScrabbleLossesStarter.java` | Starter template with TODOs for you to complete |

---

## The Dataset

Each row in the CSV represents one Scrabble game. The columns are:

| Index | Column | Description |
|-------|--------|-------------|
| 0 | `gameid` | Unique game identifier |
| 1 | `tourneyid` | Tournament identifier |
| 2 | `tie` | Whether the game was a tie |
| 3 | `winnerid` | Winner's player ID |
| 4 | `winnername` | Winner's full name |
| 5 | `winnerscore` | Winner's score |
| 6 | `winneroldrating` | Winner's rating before the game |
| 7 | `winnernewrating` | Winner's rating after the game |
| 8 | `winnerpos` | Winner's finishing position |
| 9 | `loserid` | Loser's player ID |
| **10** | **`losername`** | **Loser's full name** ← this is the column we need |
| 11 | `loserscore` | Loser's score |
| 12 | `loseroldrating` | Loser's rating before the game |
| 13 | `losernewrating` | Loser's rating after the game |
| 14 | `loserpos` | Loser's finishing position |
| 15 | `round` | Round number |
| 16 | `division` | Division number |
| 17 | `date` | Date of the game |
| 18 | `lexicon` | Lexicon used (True/False) |

---

## AP CSA Concepts Used

This activity reinforces the following AP topics:

- **File I/O** — `java.io.File` and `java.util.Scanner`
- **String methods** — `.split()`, `.equals()` (via `.indexOf()`)
- **ArrayList** — `.add()`, `.get()`, `.set()`, `.size()`, `.indexOf()`
- **Traversal with `for` and `while` loops**
- **Finding a maximum** in a list (standard AP algorithm)
- **Parallel ArrayLists** — using two lists where index *i* in one corresponds to index *i* in the other

---

### Expected Output (sample file)

```
Player with the most losses:
  Name:   Tom Kelly
  Losses: 36
```

### Expected Output (full file)

```
Player with the most losses:
  Name:   Paul Avrin
  Losses: 4027
```

> **Note:** The full dataset has ~1.5 million rows and ~15,000 unique players. Because `ArrayList.indexOf()` does a linear scan, running on the full file will take noticeably longer than the sample.