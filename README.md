# User Guide

## Introduction

BuffBuddy is your all-in-one fitness tracking companion, designed to help you streamline and organize your workout routines. 
Whether you’re planning custom programs, tracking daily exercises, or logging your workout history, BuffBuddy keeps everything in one place. 
Build personalized workout plans, log progress, and stay motivated with an intuitive interface that’s perfect for fitness enthusiasts of all levels.

## Quick Start

1. Ensure that you have Java 17 or above installed.
2. Download the latest version of `BuffBuddy` from [here](https://github.com/AY2425S1-CS2113-W10-3/tp/releases/tag/v1.0).
3. Open a command terminal, cd into the folder you put the jar file in, and use the `java -jar BuffBuddy.jar` command to run the application.

## TERMINOLOGY:
- **EXERCISE**: An exercise defined by a name, rep, set, and weight.
- **DAY**: A ‘workout day’ is a collection of exercises to be done together.
- **PROGRAMME**: A programme is a collection of workout days.

---

## Features 


### 1. Create a New Program

Command: `prog create PROG_NAME /d /e /n EXERCISE_NAME /s SET /r REP /w WEIGHT`

Example: `prog create Starter /d ONE /e /n Bench_Press /s 3 /r 12 /w 30 /e /n Squat /s 3 /r 12 /w 50 /d TWO /e /n Bicep_Curl /s 3 /r 12 /w 10`

(To create a programme ‘Starter’ with Day One being Bench & Squat, Day Two being Bicep Curl.)

**Note**: Since this command can be quite long when adding multiple exercises across multiple days, you can alternatively create an empty program first and then edit it step by step.

### Alternative Method: Create an Empty Program and Edit It

1. **Create an Empty Program**:
    - Command: `prog create PROG_NAME`

   Example: `prog create Starter`

This creates a new program called "Starter" without adding any days or exercises.

2. **Edit the Program**:
- You can now use the `prog edit` command to add exercises or days to your program incrementally.

Example: `prog edit /p 1 /ad ONE /e /n Bench_Press /r 10 /s 30 /w 50`

This adds a new day "ONE" and inserts the exercise "Bench Press" with 10 reps, 30 sets, and 50kg.

---

### 2. View Program
Command: `prog view [INDEX]`

Displays the detailed workout routine of the selected program. If no index is provided, defaults to the currently active program.

Example: `prog view 1`

Program: Starter

Day 1: Chest Press [3x12 30kg], Squat [3x12 50kg]

Day 2: Squat [3x12 10kg]

---

### 3. List All Programs
Command: `prog list`

Lists all workout programs with their index and name.

Example: `prog list`

1: Starter  --  ACTIVE

2: Full Body

---

### 4. Edit Program
Command: `prog edit /p PROG_INDEX /d DAY [command] INDEX [args]`

`p_index`: Program index (optional - defaults to active program).  
`d_day`: Day index (optional - defaults to active day).  
`command`: Abbreviated edits (/a for create exercise, /u for update exercise, /x for remove exercise, /ad for create day, /xd for remove day).  
`Args`: A set of flags to update for that specific exercise. (e.g., /w WEIGHT to update weight, /r REPS, and /s SETS in any order).

Example behaviour: `prog edit /p 1 /d 1 /u 1 /w 30`

Update Exercise 1 of Day 1 of Prog 1 - Weight set to 30.

---

### 5. Set Program as Active
Command: `prog start PROGRAMME_INDEX`

Sets given programme as the ‘active programme’, which other commands will default to if `programme_index` is not supplied.

---

### 6. Log a Workout
Command: `log /p PROGRAMME_INDEX /d DAY_INDEX /t DATE`  
Date in form of dd/MM/yyyy

Log a workout as if each exercise was performed correctly.

Example: `log`

Marking Day 2 as Done!

You’ve completed:
Starter Programme  
Workout 1  
Deadlift [3x10 100kg], Bench [3x12 30kg].

---

### 7. Change Active Programme
Command: `prog active INDEX`

Changes the ‘active’ programme to a new programme.

---

### 8. List Completed Workouts
Command: `history`

View all completed workouts in order.

---

### 9. Delete Program
Command: `prog delete INDEX`

Deletes the programme at the given index.

## Command Summary

| Command                | Description                                                 | Format                                                                          | Example                                                         |
|------------------------|-------------------------------------------------------------|---------------------------------------------------------------------------------|-----------------------------------------------------------------|
| **Create Program**     | Creates a new workout program                               | `prog create PROG_NAME /d DAY_NAME /e /n EXERCISE_NAME /s SET /r REP /w WEIGHT` | `prog create Starter /d ONE /e /n Bench_Press /s 3 /r 12 /w 30` |
| **View Program**       | Displays the detailed workout routine of a specific program | `prog view [INDEX]`                                                             | `prog view 1`                                                   |
| **List Programs**      | Lists all workout programs with their index and name        | `prog list`                                                                     | `prog list`                                                     |
| **Edit Program**       | Edits exercises or days within a program                    | `prog edit /p PROG_INDEX /d DAY /u INDEX /w WEIGHT /r REP /s SET`               | `prog edit /p 1 /d 1 /u 1 /w 30`                                |
| **Set Active**         | Sets a program as the active one                            | `prog start INDEX`                                                              | `prog start 1`                                                  |
| **Log Workout**        | Logs a workout for a specific day                           | `log /p PROGRAMME_INDEX /d DAY_INDEX /t DATE`                                   | `log /p 1 /d 1 /t 12/10/2024`                                   |
| **View History**       | Displays the history of completed workouts                  | `history`                                                                       | `history`                                                       |
| **Delete Program**     | Deletes a program by its index                              | `prog delete INDEX`                                                             | `prog delete 1`                                                 |
| **Set Active Program** | Changes the active program to a new one                     | `prog active INDEX`                                                             | `prog active 2`                                                 |



