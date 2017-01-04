->In java every variable and every expression has some type. Each and every data type is clearly defined. Every assignment should be checked by compiler for type compatibility. Because of  above reasons we can conclude java language is strongly typed programming language.

->Java is not considered as pure object oriented programming language, because several oop features are satisifed by java (like operator overloading, multiple inheritance and etc..). More over we are depending on primitive data types which are non objects.
 
#primitive data type(8)

numeric data type(6)
		-> Integer data type (4) -> byte, int, short, long
		-> floating point data type (2) -> double, float
non numeric data type(2)
		-> char and boolean
		
->Except boolean and char remaining data types are considered as signed data types. Becaues, we can represent both positive and negative numbers.

#byte

size 8 bits(1 byte)
max value : +127
min value : -128
range : -128 to +127 

-> The most significant bit acts as the sign bit. o means positive number, 1 means negative number.
-> positives numbers will be represented directly in the memory where as negative numbers will be represented in 2's compliment form

example: 

byte b = 128; -> compile error: Possible loss of precision
				 found: int 
				 required: byte  
				 
byte b = 10.5; -> compile error: Possible loss of precision
				 found: double
				 required: byte
				 
byte b = true; -> compile error: Incompatible types
				 found: boolean
				 required: byte

byte b = "string"; -> compile error: Incompatible types
				 found: string 
				 required: byte				 
				 
->Byte is the best choice if we want to handle data in terms of streams either from the file or from the network(file supported form or network supported form is byte).

#short
size : 2 bytes (16 bits)
range: -2^15   to 2^15 -1 (-32768 to 32767)

Examples:

short s = 32767;
short s = 32768; -> compile error: possible loss of precision
				 found: string 
				 required: byte

short s = 10.5; -> compile error: possible loss of precision
				 found: double 
				 required: byte

short s = true; -> compile error: Incompatible types
				 found: boolean 
				 required: byte

->short data type is best suitable for 16 bit processors like 8085 but these processors are completely out dated and hence corresponding short data type is also out dated.

#int 
size : 4 bytes (32 bits)
range: -2^31 to -2^31 -1 (-2147483648 to 2147483647)

int i = 2147483647;
int i = 2147483648; -> compile error: integer number too large
int i = 2147483648l; -> compile error: possible loss of precision
						found: long
						required: int 				  
int i = true -> compile error: Incompatible types
						found: boolean
						required: int

#long
->Sometimes int may not be enough to hold big values then we should go for long type.

ex: The amount of distance traveled by light in 1000 days, int is not enough to hold this value. we should go for long data type.

long l = 126000 * 6o * 60 *24 * 1000 miles

ex: The number of characters present in a big file may exceed int range, hence the return type of length method is long but not int. long l = file.length();

size: 8 bytes ( 64 bits)
range:  - 2^63  to 2^63 -1

Note: All the above data types (short, byte, int, long) meant for representing integral values. If we want to represent floating point values then we should go for floating point data types. 

#floating point data types:
-> If we want 5 to 6 decimal place of accuracy then float, If we want 15 to 16 decimal place of accuracy then double.
-> float follows single precision(less accuracy), double follows double precision
-> float has 4 bytes, double has 8 bytes
-> float range -3.4e38 to 3.4e38, double range -1.7e308 to 1.7e308

#boolean
size: Not applicable(based on virtual machine)
range: Not applicable

allowed values are true or false.

ex:
boolean b = True; -> compile error: cannot find sysmbol
					 symbol: variable True
					 location: class Test

boolean b = "true"; -> compile error: Incompatible types
					   found : java.lang.String
					   required: boolean					

#char
size: 2 byte
range: 0 to 65535

java is unicode based characters
we can use any world wide langauges and characters (>= 256 to 65536) first 256 aare nothing but the ascii code values only.

-> Old languages(c/c++) are ascii code based and the number of different allowed ascii code characters are less than are equal to 256. To represent these 256 characters 8 bits are enough. Hence, the size of char in old languages is 1 byte. 
-> But java is unicode based and the number of different unicode characters are greater than 256 and less than or equal to 65536. To accommodate these many characters 8 bits may not be sufficient. We might need 16 bits. Hence, the size of char in java is 2 bytes.

-> null is a default value for object reference and we can't apply for primitives. If we are trying to use for primitive then we will get compile time error.

ce: incompatible types
found: null type 
required: char 