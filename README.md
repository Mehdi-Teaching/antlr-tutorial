# Getting Started with Antlr
ANTLR (ANother Tool for Language Recognition) is a powerful parser generator for reading, processing, executing, or translating structured text or binary files. It's widely used to build languages, tools, and frameworks. From a grammar, ANTLR generates a parser that can build and walk parse trees.
[Link to Website](https://www.antlr.org/)

# Notes
- Grammar file name format is `[NAME].g4`.
    - `[NAME]` must be the same as grammar's name.
- Tokens start with capital letters.
- Grammar rules start with small letters.

# Generate Files from Grammar
use command `java -jar antlr.jar [GRAMMAR-ADDRESS].g4 -o [OUTPUT-DIRECTORY]`.



      