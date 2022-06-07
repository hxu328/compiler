# Overview
write a name analyzer for minim programs represented as abstract-syntax trees

## Name Analysis
1. Build symbol tables
2. Find multiply declared names, uses of undeclared names, bad struct accesses, and bad declarations
3. Add IdNode links

## Error Reporting
1. name analyzer should find all of the errors described in the table given below; it should report the specified position of the error, and it should give exactly the specified error message (each message should appear on a single line, rather than how it is formatted in the following table). Error messages should have the same format as in the scanner and parser (i.e., they should be issued using a call to ErrMsg.fatal).

2. If a declaration is both "bad" (e.g., a non-function declared void) and is a declaration of a name that has already been declared in the same scope, you should give two error messages (first the "bad" declaration error, then the "multiply declared" error).
