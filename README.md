# Formatter

## So you want to format a string list do you?


[![Run on Repl.it](https://repl.it/badge/github/cascadia-dev/Formatter)](https://repl.it/github/cascadia-dev/Formatter)

# Usage:
Formatter class can format an array list with commas or other punctuation, with optional [serial comma](https://en.wikipedia.org/wiki/Serial_comma).

Simplest - `Formatter.format(String[] thing)`

Optional formatting can be applied with `setFormat(true)` which will apply simple Oxford commas; or `setFormat(s1, s2)` where:
s1 specifies the punctuation between item 0 and 1 ... item N-1,
s2 specifies the punctuation between item N-1 and item N

## Examples with s1 and s2:
If the input string list is 
- John, the plain
- Quasimodo, the crooked
- Zebulon, the confused

`Formatter.setFormat(";", "; and ");`
result:
John, the plain; Quasimodo, the crooked; and Zebulon, the confused

`Formatter.setFormat(" &", " & ");`
result:
John, the plain & Quasimodo, the crooked & Zebulon, the confused