# Lab Reflection: Git Version Control + Debugging (BuggyProgram)

## Student Name
Abdullah Asher 

## GitHub Repository URL
Paste your GitHub repository URL here.

---

# Commit 1: Initial Commit

## What did you include in this commit?
- BuggyProgram.java with three buggy methods, three JUnit test files, and README.md

## What was the purpose of this commit?
- To save the original starter code as a baseline before making any changes

---

# Commit 2: Task 1 (getGrade)

## Which tests in Task1Test were failing before your fix?
- testEdges was failing because a score of 90 returned Meets instead of Exceeds

## What was the issue in the code?
- Used > instead of >= so boundary scores were classified incorrectly

## What change did you make to fix it?
- Changed score > 90 to score >= 90 and score > 80 to score >= 80

## How did the tests help guide your fix?
- The error showed expected Exceeds but was Meets, pointing directly to the boundary values

---

# Commit 3: Task 2 (sumEvenNumbers)

## Which tests in Task2Test were failing before your fix?
- All tests failed due to wrong initial value and loop going out of bounds

## What was the issue in the code?
- sum was initialized to 1 instead of 0, and loop used i <= values.length instead of i < values.length

## What change did you make to fix it?
- Changed sum = 1 to sum = 0 and changed i <= values.length to i < values.length

## How did the tests help guide your fix?
- Results were all off by 1 and the program crashed, revealing both bugs immediately

---

# Commit 4: Task 3 (sumRange)

## Which tests in Task3Test were failing before your fix?
- testSumRangeReverseOrder was failing, expected 15 but got 0

## What was the issue in the code?
- When start is greater than end the loop never runs and returns 0

## What change did you make to fix it?
- Added a swap so if start > end the values are swapped before the loop runs

## How did the tests help guide your fix?
- The test name and expected value showed that reverse order input must be handled correctly

---

# Overall Reflection

## Which task was the easiest to fix? Why?
- Task 2 was easiest because the bugs were common mistakes easy to spot from the test output

## Which task was the most difficult? Why?
- Task 3 was hardest because the bug only appeared with reverse order input, not obvious at first

## How did Git help you track your progress through the debugging process?
- Each commit saved a working state so all changes could be tracked and reversed if needed

## Why is it important to make small, frequent commits when debugging code?
- Small commits isolate each change making it easy to find exactly what caused a new bug

## What did you learn about using JUnit tests to guide debugging?
- Tests show exactly which input fails and what the correct output should be, making debugging faster

---

# Commit 5: Final Reflection

## What did you complete or update before making this final commit?
- All three bug fixes in BuggyProgram.java and all README reflection sections

## Why is it useful to document your work after completing a programming task?
- It helps others understand the fixes and reinforces your own understanding of the process

