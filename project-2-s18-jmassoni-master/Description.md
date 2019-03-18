# Project Description

### You may work with a partner on this project.

### Due Sunday, February 25, at 11:59 PM

## Description

Complete the interpreter we began in class. There are a set of basic features you must complete to get full credit and an additional set of optional features you may implement to get additional points.

Test your code with included Python script:

```
prompt$ python test.py
```

## Basic Features

Add three new features:

- Relational comparisions

- `if` statements

- `while` loops

Here is an example program that uses an `if` statement:

```
program basic_if_1:

    a := 1
    b := 1

    if a = b:
        print "Equal"
    end
end
```

Here is an example that uses a `while` loop:

```
program basic_while_1:

    count := 0

    while count < 10:
        print count
        count := count + 1
    end
end
```

Relational comparisons use the six basic Pascal-style relational operators:

```
=  <>  >  <  >=  <=
```

The left and the right sides of the comparison must be arithmetic expressions:

- You do not need to implement any logical operators (`and`, `or`, `not`)

- You do not need to implement "truthiness" for expressions or values that are not part of a comparison

Here is the updated grammar for all of the basic language elements:

```
Program --> 'program' NAME ':' Block 'end'

Block --> {Statement}

Statement --> PrintStatement
              | AssignStatement
              | IfStatement
              | WhileStatement
         
PrintStatement --> 'print' Expression
              
AssignStatement --> Name ':=' Expression

IfStatement --> 'if' Comparison ':' Block 'end'

WhileStatement --> 'while' Comparison ':' Block 'end'

Comparison --> AddExpr RelOp AddExpr

Expression --> AddExpr | StringLiteral

AddExpr --> MultExpr [('+' | '-') AddExpr]

MultExpr --> NegExpr [('*' | '/') MultExpr]

NegExpr --> '-' NegExpr | Atom
                    
Atom --> IntegerLiteral
         | '(' Expression ')'
         | Name
         
RelOp --> '=' | '<>' | '>' | '<' | '>=' | '<='
```

Tips:

- You'll need to create new `IfStmt` and `WhileStmt` classes in `Stmt.java` and a new `Comparison` class in `Expr.java`. Then add code to the parser to create and return these objects, then code to the interpreter to execute them.

- The comparision will evaluate to a Boolean. The code to parse and evaluate it will be structured similar to `AddExpr` and `MultExpr`,
in terms of having left and right sides and an operator. There are now six operator choices.

- Work on modifying one part of the program at a time, testing your modifications, then adding the next bit of functionality. **DON'T TRY TO IMPLEMENT ALL OF THE FEATURES AT ONCE**.

## Optional Features

There are four optional feaures:

- A `for` loop

- Overloading the `+` operator to support string concatenation

- Allowing real numbers

- Subroutine definitions and calls

You can do all, some, or none of the additional feaures. There are eight tests and each test counts for 5 bonus points, 40 in total.

Here is the grammar with all of the langauge features present:

```
Program --> 'program' NAME ':' Block 'end'

Block --> {Statement}

Statement --> PrintStatement
              | AssignOrCallStatement
              | IfStatement
              | WhileStatement
              | ForToStatement
              | SubDefinition
         
PrintStatement --> 'print' Expression
              
AssignOrCallStatement --> Name ':=' Expression
                          | Name '(' ')'

IfStatement --> 'if' Comparison ':' Block 'end'

WhileStatement --> 'while' Comparison ':' Block 'end'

ForToStatement --> 'for' Name ':=' AddExpr 'to' AddExpr ':' Block 'end'

SubDefinition --> 'sub' Name '(' ')' ':' Block 'end'

Comparison --> AddExpr RelOp AddExpr

Expression --> AddExpr | StringExpr

StringExpr --> String ['+' StringExpr] 

AddExpr --> MultExpr [('+' | '-') AddExpr]

MultExpr --> NegExpr [('*' | '/') MultExpr]

NegExpr --> '-' NegExpr | Atom
                    
Atom --> IntegerLiteral
         | '(' Expression ')'
         | Name
         | RealLiteral
         
RelOp --> '=' | '<>' | '>' | '<' | '>=' | '<='
```

**`for` Loop**

The loop increments an index variable through a specific range:

```
for i := 1 to 10:
    print i
end
```

Parsing this is fairly straightforward (make sure you've completed the `while` loop before trying this one). When executing it, you have to enter the loop variable into the symbol table at the beginning of the loop, then update it after every iteration. Remove the variable after the loop ends.

** String Concatenation **

Use `+` to add strings.

```
print "Hello, " + "friend."
```

No other operator on strings is defined and you don't have to implement concatenation of strings with values that aren't string literals.

** Real values **

The first version of the interpreter only supported integer numbers. Modify it to support fractional values, implemented as Java `Double` objects.

To do this, you need to first modify the Lexer to recognize and return `REAL` tokens, including the value of the number as a `Double` object. This is not that bad.

You then need to modify the `atom` methods in the parser and interpreter to deal appropriately with real values; look at how integers are handled and use that as model for working with reals.

The hardest part is implementing correct arithmetic on reals:

- If both arguments are integers, the result of any arithmetic operation should still be an integer, implemented as a Java  `Integer` object.

- If one or both are real, the result should be a Java `Double` object.

- You'll need to use add some code to `evalAddExpr` and `evalMultExpr` to check the types of inputs to each arithmetic operation (using `instanceof`) and return the appropriate result

** Subroutines **

The best one.

```
program say_hello:

    sub hello():
        print "Hello"
    end
    
    hello()  { Prints "Hello" }
end
```

You need to add both the code to define a subroutine and then call it.

For the definition, you can create a `SubroutineDefinition` statement that saves the `Block` and `Name` of the subroutine. When that
statement is executed by the interpreter, it puts the `Name-->Block` pair into the symbol table, so you can look up the subroutine's
body given its name in the future.

To call a subroutine, you first need to be able to recognize calls. Calls begin with a `Name`, like assignments, but are always followed by a pair of parenthesis. Therefore, you can distinguish between a call and an assignment by looking at the token that comes after the name. You should create a `CallStmt` class that saves the name of the called function.

To execute a call, look up its code block in the symbol table, then interpret the block.

There are a few more features we'd need to add to get a complete implementation of subroutines:

- Passing input arguments and binding them to parameters in the subroutine definition
    
- Local scoping, which allows for local variables within a subroutine. This can be implemented by saving the current `environment` symbol table each time you call a subrotuine, then creating a new one to represent the local scope of the new call. On exiting, restore the environment from the previous scope.

- Finally, you'd want to be able to return values.

I'll award **at least 10 additional bonus points** to any person or group that can implement any of these extra features. There are no tests for them, so you just need to come to my office and talk about what you've built.
