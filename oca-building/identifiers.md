#Language Fundamentals

1. Identifiers
2. Reserved words
3. Data types
4. literals
5. Arrays
6. Types of variables
7. var-arg methods
8. main method
9. command line arguments
10. java coding standards

#Identifiers
A name in java program is called identifier which can be used for identification purpose. It can be method name or variable name class name or label name.

look into identifier/IdentifierSample.java class

#Rules for defining java identifiers
1. The only allowed characters in identifiers are 0-9, a-z, A-Z, $, _. If we are using any other character, we will get compile time error. ex: t_number is valid and number# is not valid.
2. Identifiers can not start with digit. ex: total123 is valid, but 123total is not valid.
3. Identifiers are case sensitive. Java language is case sensitive programming language.
4. There is no length limit for java identifiers. But, it is not recommended to take too lengthy identifiers.
5. we can not use reserved words as identifiers. invalid statement -> int if=10; 
6. All predefined java class names and interface names can be used as identifiers. But, using this is considered as bad programming. As, it reduces readability.

Which of the following are valid java identifiers?
total123            Java3Share
123total           Integer
t_number           Int
number#            int
cas$h
_$_$_$_
all@hands
  
#Reserved words
In java some words are reserved to represent some meaning or functionality which are called reserved words. In java there are 53 reserved words.

keywords are 50 and reserved literals are 3 -> true, false, null
used keywords are 48 and unused keywords are 2 -> got and const

#keywords for data types
There are 8 keywords for data types. They are byte, short, int, long, float, double, boolean, char
There are 11 keywords for flow control. They are if, else, switch, case, default, while, do, for, break, continue, 		return
There are 12(with default) keywords for modifiers. They are public, private, protected, static, final, abstract,    		synchronized, native, strictfp, transient, volatile.
There are 6 keywords for exception handling. They are try, catch, finally, throws, throw, assert.
There are 6 keywords for class. They are class, interface, extends, implements, package, import.
There are 4 keywords for objects. They are new, instanceof, super, this.

void return type keyword: In java return type is mandatory. If a method wont return anything then we have to declare that method with void return type. But in c language return type is optional and default return type is int.

#unused Keywords:
#goto: 
 Usage of goto created several problems in previous languages and hence Sun organization banned the usage of goto keyword in java.

#const:
 Final keyword replace the const keyword.

Goto and const are unused keywords, if we are trying to use we will get compile time error.

#Reserved literals:
true and false are values for boolean types, null is value for default object reference.

#enum keyword:(1.5 version)
We can use enum to define a group of named constants.

#Conclusions: 
->All 53 reserved words in java contains only lower case alphabets symbols 
->In java we have only new keyword and there is no delete keyword because destruction of useless objects is taken care by garbage collector.
->strictfp, assert, enum are new keywords in java.
