# Overview
write a type checker for minim programs represented as abstract-syntax trees

## Type Checking
1. The type checker will determine the type of every expression represented in the abstract-syntax tree and will use that information to identify type errors. In the minim language we have the following types:

- int, bool, void (as function return types only), strings, struct types, and function types

2. A struct type includes the name of the struct (i.e., when it was declared/defined). A function type includes the types of the parameters and the return type.

3. The operators in the minim language are divided into the following categories:

- logical: not, and, or
- arithmetic: plus, minus, times, divide, unary minus
- equality: equals, not equals
- relational: less than (<), greater than (>), less then or equals (<=), greater than or equals (>=)
- assignment: assign

4. The type rules of the minim language are as follows:

- logical operators and conditions: Only boolean expressions can be used as operands of logical operators or in the condition of an if or while statement. The result of applying a logical operator to bool operands is bool.
- arithmetic and relational operators: Only integer expressions can be used as operands of these operators. The result of applying an arithmetic operator to int operand(s) is int. The result of applying a relational operator to int operands is bool.
- equality operators: Only integer expressions, boolean expressions, or string literals can be used as operands of these operators. Furthermore, the types of both operands must be the same. The result of applying an equality operator is bool.
- assignment operator: Only integer or boolean expressions can be used as operands of an assignment operator. Furthermore, the types of the left-hand side and right-hand side must be the same. The type of the result of applying the assignment operator is the type of the right-hand side.
- disp and input: Only an int or bool expression or a string literal can be printed by disp. Only an int or bool identifer can be read by input. Note that the identifier can be a field of a struct type (accessed using . ) as long as the field is an int or a bool.
- function calls: A function call can be made only using an identifier with function type (i.e., an identifier that is the name of a function). The number of actuals must match the number of formals. The type of each actual must match the type of the corresponding formal.
- function returns: A void function may not return a value. A non-void function may not have a return statement without a value. A function whose return type is int may only return an int; a function whose return type is bool may only return a bool.

## Preventing Cascading Errors
One way to accomplish this is to use a special ErrorType for expressions that contain type errors. In the second example above, the type given to (true + 3) should be ErrorType, and the type-check method for the multiplication node should not report "Arithmetic operator with non-numeric operand" for the first operand.
