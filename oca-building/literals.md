#literal

Any constant value which can be assigned to the variable is called literal.
ex: int x = 10;

#integral literals:

->For integral data types(byte, short, int, long) we can specify literal value in the following ways

1. Decimal form(base 10): allowed digits are  0-9 ex: int x = 10;
2. Octal form(base 8):  allowed digits are 0-7. value should be prefixed with zero. Ex: int x = 010;
3. Hexa decimal form(base 16): allowed digits are 0-9, a-f. value should be prefixed with 0x or 0X. ex: int x = 0x10;
we can use both lower and upper case characters(a-f or A-F). This is one of very few areas where java is not case sensitive. 

->These are the only possible ways to specify literal value for integral data types.

question:

int x = 0786; ce: integer too large

-> By default every integral literal is of int type, but we can specify explicitly as long type by suffixed with l or L. 

int x = 10l -> compile error: Possible loss of precision.

->There is no direct way to specify byte and short literals explicitly. But, indirectly we can specify. When ever we are assigning integral literal to byte variable and if the value is in range of byte, then compiler treats it automatically as byte literal. Similarly short literal also.

#Floating point literals:
-> By default every floating point literal is of double type. Hence, we can not assign directly to float variable. But, we can specify floating point literal as float type by suffixing with f or F.
-> We can specify explicitly floating point literal as double type by suffixing with d or D. Of course, this convention is not required. double d = 123.456d;, float f = 123.456d;-> ce - possible loss of precision.

-> We can specify floating point literals only in decimal form and we can not specify them in octal and hexa decimal forms.


ex: double d = 0X1234.566; ce: Malformed floating point literal
-> we can assign integral literal directly to floating point variables and that integral literal can be specified either in decimal or octal or hexa decimal forms

double d = 0786 not valid; // ce: integer number to large
double d = oxFace valid;
double d = 0786.0 valid;
double d = 0777 valid;
double d = 0xface.0 not valid

-> We can not assign floating point literals to integral types.
-> We can specify floating point literal even in exponential form(scientific notation). ex: double d = 1.2e3;
-> The only allowed values for boolean type is true or false.
-> we can specify char literal as single character with in single quotes. ex: char ch = 'a';
ex: char ch = 'ab'; -> ce : unclosed char literal, ce: uncloased char literal, ce: not a java statement
Above are the compile errors that we get for the example mentioned.
-> we can specify char literal as integral literal which represents unicode value of the character and that integral literal can be specified either in decimal or octal or hexa decimal forms. But, allowed range is 0 to 65535.
ex: char c = 65536 not valid ce: possible loss of precision

-> We can represent char literal in unicode presentation, which is nothing but '\uxxxx' xxxx- four digit hexa decimal number
ex: char ch = '\u0061'; -> output is a.

-> Every escape character is a valid char literal  ex: char ch = '\n'; char ch ='\t'' char ch = '\m'->not valid ce: illegal escape character.

In java there are 8 escape characters -> \n \t \r \b \f \' \" \\

#String literal:
Any sequence of characters with in double quotes is treated as String literal.
-> 1.7 version enhancements w.r.t literals

1. Binary literals:
-> For integral data types until 1.6 version we can specify literal value in the following ways -> decimal, octal, hexa decimal form.
-> But for 1.7 version onwards we can specify literal value even in binary form also. 
-> Allowed digits are 0 and 1.
-> Literal value should be prefixed with 0b or 0B
ex: int x = 0b1111; -> output is 15

2. Usage of underscore symbol in numeric literals
-> From 1.7 version onwards we can use underscore symbol between digits of numeric literal
ex: double d = 123_456.7_8_9; 
-> The main advantage of this is readability of the code will be improved.

-> We can use more than one underscore symbol also between the digits.
-> We can use underscore symbol only between the digits, if we are using any where else we will get compile time error.

-> 8 Byte long value we can assign to 4 byte float variable because, both are following different memory representations internally.