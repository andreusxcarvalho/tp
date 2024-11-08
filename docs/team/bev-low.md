# Project Portfolio: Low Beverly

## Project: BuffBuddy
BuffBuddy is a fitness tracker that tracks your programmes, workouts, meals and water intake. The user interacts wtih
it using a CLI, and it has a GUI created with JavaFX. It is written in Java. 

## Summary of Contributions

### Code Contributed
- **Code Link**: [Click here to view my code on the tP Code Dashboard](https://nus-cs2113-ay2425s1.github.io/tp-dashboard/?search=bev-low&breakdown=true&sort=groupTitle%20dsc&sortWithin=title&since=2024-09-20&timeframe=commit&mergegroup=&groupSelect=groupByRepos&checkedFileTypes=docs~functional-code~test-code~other&tabOpen=true&tabType=authorship&tabAuthor=Bev-low&tabRepo=AY2425S1-CS2113-W10-3%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code~other&authorshipIsBinaryFileTypeChecked=false&authorshipIsIgnoredFilesChecked=false)

### Enhancements Implemented

- **Save/Load Feature**: Designed and wrote the code to save and load files into JSON Objects using the Gson Library.
    - **What it does**: This feature allows the application to save and load data seamlessly, storing it in JSON format to ensure data persistence between sessions. The feature uses the Gson library to serialize and deserialize data into JSON objects, enabling a structured and readable file format.
    - **Justification**: The save/load feature is essential for users to maintain their progress and data across sessions, making the application more reliable and user-friendly. Without this feature, users would risk losing their data upon closing the application.
    - **Highlights**: This feature required careful design and implementation to integrate with the application's data model. Converting complex data into JSON format required precise management of data structures and file handling to ensure accuracy and consistency. The implementation also included error handling to manage file I/O exceptions and ensure robust file-saving capabilities.
    - **Credits**: The Gson library was used extensively to handle JSON serialization and deserialization, making it easier to manage structured data within the application.

- **Water Intake Features**: Brief description of additional features or optimizations you contributed.

### Contributions to the User Guide (UG)
- Added/edited the following sections:
    - **Added documentation for programme edit features**: Provided comprehensive explanations and examples on how users can utilize the programme editing functionality, including steps to modify existing programmes and commands to customize their workout schedules.
    - **Added documentation for day edit features**: Detailed the process for editing day-specific attributes within a programme, explaining how users can change, add, or remove day information, and offering clear usage examples for better understanding.

### Contributions to the Developer Guide (DG)
- **Sections Contributed**: Storage component, Save/Load implementation, DailyRecord Class, Programme component, Exceptions
- **UML Diagrams**:
    - **Storage Component**: Illustrates the structure and interactions of the Storage class within the system, including its methods and relationships with other components such as FileManager, ProgrammeList, and History. This diagram highlights how data is loaded, saved, and managed to ensure file operations are seamless and robust.
    - **DailyRecord Class**: Shows the design of the DailyRecord class, detailing its attributes (e.g., Day, MealList, Water) and methods (e.g., logging and retrieving records). This diagram showcases the relationships between DailyRecord and other classes it interacts with, demonstrating how it integrates within the system to manage daily workout, meal, and water intake data.
    - **Save/Load Feature**: Depicts the sequence of operations involved in saving and loading data within the application. This includes interactions between the Storage, FileManager, and any serialization or deserialization logic. The diagram highlights the workflow of data persistence, ensuring data integrity and user session restoration.
    - **Programme component**: Provides an overview of the Programme component structure, displaying the relationships between ProgrammeList, Programme, Day, and Exercise classes. This diagram showcases how workout programmes are organized, managed, and stored, emphasizing the hierarchical relationship and flow of data within the system.
    - **Exceptions**: Describes the custom exceptions defined in the system, detailing their inheritance from standard exception classes. The diagram displays how each custom exception (e.g., InvalidInputException, FileLoadException) is used and where it fits into the error-handling framework of the application, ensuring graceful degradation and user feedback during unexpected events.

### Contributions to Team-Based Tasks
- Participated in team meetings.
- Assisted with [mention any collaborative tasks, like integrating code from different features or team-based debugging sessions].

### Review/Mentoring Contributions
- **Pull Request Reviews**:
    - [PR #229 - Adjust history commands](https://github.com/AY2425S1-CS2113-W10-3/tp/pull/229)
    - [PR #228 - Update Programme Features in UG](https://github.com/AY2425S1-CS2113-W10-3/tp/pull/228)
    - [PR #212 - Add Water features JUnit tests](https://github.com/AY2425S1-CS2113-W10-3/tp/pull/212)
    - [PR #208 - Polish v1 features](https://github.com/AY2425S1-CS2113-W10-3/tp/pull/208)
    - [PR #179 - Update Developer Guide](https://github.com/AY2425S1-CS2113-W10-3/tp/pull/179)
    - [PR #178 - Add documentation and testing for edit programme](https://github.com/AY2425S1-CS2113-W10-3/tp/pull/178)
    - [PR #165 - Add delete log functionality](https://github.com/AY2425S1-CS2113-W10-3/tp/pull/165)
    - [PR #164 - Add calorie information to Exercise objects](https://github.com/AY2425S1-CS2113-W10-3/tp/pull/164)
    - [PR #162 - Refactor EditCommand](https://github.com/AY2425S1-CS2113-W10-3/tp/pull/162)
    - [PR #159 - Fix History and Logging Issue](https://github.com/AY2425S1-CS2113-W10-3/tp/pull/159)
    - [PR #151 - Added WaterCommandFactory and ViewWaterCommand classes](https://github.com/AY2425S1-CS2113-W10-3/tp/pull/151)
    - [PR #90 - Add assertions and logging details for files in parser package](https://github.com/AY2425S1-CS2113-W10-3/tp/pull/90)
    - [PR #81 - Add assertions & logging to Command classes](https://github.com/AY2425S1-CS2113-W10-3/tp/pull/81)
    - [PR #79 - Unit Test for Core Command Classes](https://github.com/AY2425S1-CS2113-W10-3/tp/pull/79)
    - [PR #73 - Fixing the loading and logging of History class PR](https://github.com/AY2425S1-CS2113-W10-3/tp/pull/73)
    - [#52 - Finalize version one](https://github.com/AY2425S1-CS2113-W10-3/tp/pull/52)
    - [PR #51 - History PR](https://github.com/AY2425S1-CS2113-W10-3/tp/pull/51)
    - [#49 - Adjust Storage class for better separation of concern PR](https://github.com/AY2425S1-CS2113-W10-3/tp/pull/49)
    - [#48 - Add skeleton code for JUnit Testing PR](https://github.com/AY2425S1-CS2113-W10-3/tp/pull/48)
    - [#46 - Add date parsing support for logging workouts PR](https://github.com/AY2425S1-CS2113-W10-3/tp/pull/46)
    - [#45 - Add delete & create day functionality to edit command PR](https://github.com/AY2425S1-CS2113-W10-3/tp/pull/46)
    - [#44 - Add delete programme functionality](https://github.com/AY2425S1-CS2113-W10-3/tp/pull/44)
- Mentored team members by providing code feedback and debugging assistance.

### Contributions Beyond the Project Team
