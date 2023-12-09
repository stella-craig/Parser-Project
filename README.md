# Parser-Project
Parser Project for CS 4450 Principles of Programming Languages (Fall 2023) at Mizzou

## Our Group
**Group name:** Please Give Us a Parsing Grade

**Programming language:** Python

**GitHub repo:** https://github.com/stella-craig/Parser-Project

**Group Member Information:**
- Maya Bowman ([@mbowman21](https://github.com/mbowman21))
- Stella Craig ([@stella-craig](github.com/stella-craig))
- Patrick Gardner ([@MakingStuffandThings](https://github.com/MakingStuffandThings))

## Demo Video
[(Demo video here!)](https://youtu.be/o743JFQYA4E)

## Our Parser
When given an inputted python file, our parser will properly detect arithmetic operations, assignment operations, conditional statements, comments, loop statements, and any of the aforementioned nested.

## How to Use/Run
1. Make sure you have python 3 installed
2. Make sure to have the python packages: antlr4-tools and antlr4-python3-runtime installed
3. Clone down the repository
4. Open a terminal in the directory where the repository is located
5. First run `antlr4 -Dlanguage=Python3 MyLanguage.g4`
6. Next, run `antlr4-parse MyLanguage.g4 start -tree -gui [Testcase.py]`

This should give a pop up of a parse tree. There are a few testcases in the repository that work already (ie. project_deliverable_1_testcase.py, project_deliverable_2_testcase.py, and project_deliverable_3_testcase.py), so if you would like to see a working version first please replace [Testcase.py] with those.

## Other Help
If you need further reference for setting up antlr, refer to here: https://github.com/antlr/antlr4/blob/master/doc/getting-started.md
