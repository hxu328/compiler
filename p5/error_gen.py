"""
Generate test cases for error checking
Error descriptions:
Type of Error	Error Message	Position to Report
Writing a function; e.g., "disp << f", where f is a function name.	Write attempt of function	1st character of the function name.
Writing a struct name; e.g., "disp << P", where P is the name of a struct type.	Write attempt of struct name	1st character of the struct name.
Writing a struct variable; e.g., "disp << p", where p is a variable declared to be of a struct type.	Write attempt of struct variable	1st character of the struct variable.
Writing a void value (note: this can only happen if there is an attempt to write the return value from a void function); e.g., "disp << f()", where f is a void function.	Write attempt of void	1st character of the function name.
Reading a function; e.g., "input >> f", where f is a function name.	Read attempt of function	1st character of the function name.
Reading a struct name; e.g., "input >> P", where P is the name of a struct type.	Read attempt of struct name	1st character of the struct name.
Reading a struct variable; e.g., "input >> p", where p is a variable declared to be of a struct type.	Read attempt of struct variable	1st character of the struct variable.
Calling something other than a function; e.g., "x();", where x is not a function name. Note: In this case, you should not type-check the actual parameters.	Call attempt on non-function	1st character of the variable name.
Calling a function with the wrong number of arguments. Note: In this case, you should not type-check the actual parameters.	Function call with wrong # of args	1st character of the function name.
Calling a function with an argument of the wrong type. Note: you should only check for this error if the number of arguments is correct. If there are several arguments with the wrong type, you must give an error message for each such argument.	Actual type and formal type do not match	1st character of the first identifier or literal in the actual parameter.
Returning from a non-void function with a plain return statement (i.e., one that does not return a value).	Return value missing	0,0
Returning a value from a void function.	Return with value in void function	1st character of the first identifier or literal in the returned expression.
Returning a value of the wrong type from a non-void function.	Bad return value	1st character of the first identifier or literal in the returned expression.
Applying an arithmetic operator (+, -, *, /) to an operand with type other than int. Note: this includes the ++ and -- operators.	Arithmetic operator with non-numeric operand	1st character of the first identifier or literal in an operand that is an expression of the wrong type.
Applying a relational operator (<, >, <=, >=) to an operand with type other than int.	Relational operator with non-numeric operand	1st character of the first identifier or literal in an operand that is an expression of the wrong type.
Applying a logical operator (!, &&, ||) to an operand with type other than bool.	Logical operator with non-bool operand	1st character of the first identifier or literal in an operand that is an expression of the wrong type.
Using a non-bool expression as the condition of an if.	Non-bool expression in condition of if	1st character of the first identifier or literal in the condition.
Using a non-bool expression as the condition of a while.	Non-bool expression in condition of while	1st character of the first identifier or literal in the condition.
Applying an equality operator (==, !=) to operands of two different types (e.g., "j == true", where j is of type int), or assigning a value of one type to a variable of another type (e.g., "j = true", where j is of type int).	Type mismatch	1st character of the first identifier or literal in the left-hand operand.
Applying an equality operator (==, !=) to void function operands (e.g., "f() == g()", where f and g are functions whose return type is void).	Equality operator used with void functions	1st character of the first function name.
Comparing two functions for equality, e.g., "f == g" or "f != g", where f and g are function names.	Equality operator used with functions	1st character of the first function name.
Comparing two struct names for equality; e.g., "A == B" or "A != B", where A and B are the names of struct types.	Equality operator used with struct names	1st character of the first struct name.
Comparing two struct variables for equality; e.g., "a == b" or "a != b", where a and a are variables declared to be of struct types.	Equality operator used with struct variables	1st character of the first struct variable.
Assigning a function to a function; e.g., "f = g;", where f and g are function names.	Function assignment	1st character of the first function name.
Assigning a struct name to a struct name; e.g., "A = B;", where A and B are the names of struct types.	Struct name assignment	1st character of the first struct name.
Assigning a struct variable to a struct variable; e.g., "a = b;", where a and b are variables declared to be of struct types.	Struct variable assignment	1st character of the first struct variable.
"""
LOGIC = ['&&', '||']
RELATION = ['<', '>', '<=', '>=']
ARITH = ['+', '-', '*', '/']
EQUALITY = ['==', '!=']

def gen_err_message(type: list) -> str:
    """
    Generate an error message for a given type
    """
    if type == LOGIC:
        return 'Logical operator with non-bool operand'
    elif type == RELATION:
        return 'Relational operator with non-numeric operand'
    elif type == ARITH:
        return 'Arithmetic operator with non-numeric operand'
    elif type == EQUALITY:
        return 'Type mismatch'
    else:
        raise Exception('Unknown type')

curr_equality_index = 0
equality_values = ['true', '999', '\"string\"']
def gen_wrong_value(type: list) -> str:
    """
    Generate a wrong value for a given type
    """
    if type == LOGIC:
        return '999'
    elif type == RELATION:
        return 'true'
    elif type == ARITH:
        return 'true'
    elif type == EQUALITY:
        global curr_equality_index
        curr_equality_index += 1
        return equality_values[curr_equality_index % len(equality_values)]
    else:
        raise Exception('Unknown type')


def gen_error_cases(line_offset=2+1, char_offset=3+4):
    """
    Generate test cases for error checking
    For each combination of error type, generate a test case
    """
    line_number = line_offset
    error_cases, error_messages = [], []
    outer_types = inner_types = [LOGIC, RELATION, ARITH, EQUALITY]
    for outer_type in outer_types:
        for inner_type in inner_types:
            for outer_op in outer_type:
                for inner_op in inner_type:
                    # generate wrong value for each type
                    inner_val_lhs =  gen_wrong_value(inner_type)
                    inner_val_rhs = gen_wrong_value(inner_type)
                    # generate inner expression
                    inner_exp = '({} {} {})'.format(inner_val_lhs, inner_op, inner_val_rhs)
                    # generate outer rhs value
                    outer_val_rhs = gen_wrong_value(outer_type)
                    # generate outer expression, using the inner expression as lhs
                    outer_exp = '{} {} {}'.format(inner_exp, outer_op, outer_val_rhs)
                    stmt = '    a({});'.format(outer_exp)
                    error_cases.append(stmt)

                    # generate specific error message, including the character position of the error
                    # for each error case, there are 3 error messages:
                    # 1. the error message for the inner expression's lhs
                    # 2. the error message for the inner expression's rhs
                    # 3. the error message for the outer expression's rhs
                    char_offset_err1 = char_offset + 1  # the left parenthesis
                    char_offset_err2 = char_offset_err1 + len(inner_val_lhs) + 1 + len(inner_op) + 1 # the lhs, space, and operator
                    char_offset_err3 = char_offset + len(inner_exp) + 1 + len(outer_op) + 1  # the inner expression, space, and operator

                    error_messages.append('{}:{} ****ERROR**** {}'.format(line_number, char_offset_err1, gen_err_message(inner_type)))
                    if inner_type != EQUALITY: error_messages.append('{}:{} ****ERROR**** {}'.format(line_number, char_offset_err2, gen_err_message(inner_type)))
                    if outer_type != EQUALITY: error_messages.append('{}:{} ****ERROR**** {}'.format(line_number, char_offset_err3, gen_err_message(outer_type)))

                    line_number += 1

    return error_cases, error_messages

if __name__ == '__main__':
    error_cases, error_messages = gen_error_cases()
    with open('testErr.minim', 'w') as f:
        f.write('void a(int x){}\n')
        f.write('void b(int x){\n')
        for case in error_cases:
            f.write(case + '\n')
        f.write('}\n')
    with open('testErr.expect', 'w') as f:
        for message in error_messages:
            f.write(message + '\n')