#Arrays Introduction

* An Array is an indexed collection of fixed number of homogeneous data elements.
* The main advantage of arrays is we can represent huge number of values by using single variable, so that readability of the code will be improved. But, the main disadvantage of arrays is fixed in size i.e, once we create an array there is no chance of increasing or decreasing the size based on our requirement. Hence, to use arrays concept we should know the size in advance in advance, which may not possible always.

#Array declaration:

#One dimensional array declaration:
* int[] x; int []x; int x[];

* Recommended int[] x, because name is clearly separated from type.
* At the time of declaration we can't specify the size. otherwise, we will get compile time error.

#Two dimensional array declaration:
int[][] x;
int x[][];
int [][]x;
int[] []x;
int[] x[];
int []x[];

Which of the following are valid?
int[] a,b;
int[] a[],b;
int[] a[],b[];
int[] []a,b;
int[] []a,b[];
int[] []a,[]b;--> not valid compile time error.

conclusion: If we want to specify the dimension before the variable that facility is applicable only for first variable in a declaration. If we are trying to apply for remaining variables we will get compile time error.

#Three dimensiona array declaration:
int[][][] a;
int [][][]a;
int a[][][];
int[] [][]a;
int[] a[][];
int[] []a[];
int[][] []a;
int[][] a[];
int [][]a[];
int []a[][];

#Array Creation:
* Every array in java is an object only. Hence, we can create arrays by using new operator.
ex: int[] a = new int[3]; 
* For every array type corresponding classes are available and these classes are part of java language and not available to the programmer level.

loop hole:
1. At the time of array creation compulsary we should specify the size, otherwise we will get compile time error.
2. It is legal to have an array with size 0 in java.
3. If we are trying to specify array size with some negative int value, then we will get run time exception saying NegativeArraySizeException.
Ex: int[] x = new int[-3]; RE:NegativeArraySizeException.
4. To specify array size the allowed data types are byte, short, char, int. If we are trying to specify any other type then we will get compilw time error -> possible loss of precision.
5. The maximum allowed array size in java is 2147483647 which is the maximum value of int data type. 
int x = new int[2147483647];
int x = new int[2147483648] --> integer number too large.
Even in the first case we may get run time exception if sufficient heap memory is not available.

#Two dimensional array creation
* In java two dimensional array not implemented by using matrix representation. Sun people followed array of arrays approach for multi dimentional array creation.
* The main advantage of this approach is memory utilization will be improved.
Ex 1: int[][] x = new int[2][];
x[0] = new int[2];
x[1] = new int[3];

Ex 2: int[][][] x = new int[2][][];
x[0] = new int[3][];
x[0][0] = new int[1];
x[0][1] = new int[2];
x[0][2] = new int[3];
x[1] = new int[2][2];

#Array initialization
* Once we create an array every element by default initialized with default values. Whenever we are trying to print any reference variable internally toString() will be called which is implemented by default to return the string in the following form. classname@hashcode_in_Hexa form.
Ex 1: int[][] x = new int[2][3];
sop(x); //object value
sop(x[0]); //object value since it stores an array object
sop(x[0][0]); //0

Ex 2: int[][] x = new int[2][];
sop(x); //object value
sop(x[0]); //null
sop(x[0][0]); //Null Pointer Exception

Note: If we are trying to perform any operation on null then we will get run time exception saying Null Pointer Exception.

* Once we create an array every array element by default initialized with default values. If we are not satisfied with default values then we can override these values with our customized values.

x[6] = 70 -> Runtime exception saying ArrayIndexOutOfBoundsException
x[-6] = 80 -> Run time exception saying ArrayIndexOutOfBoundsException
x[2.5] = 40 -> compile time error saying PossibleLossOfPrecision

* If we are trying to access array element with out of range index(either positive or negative value) then we will get runtimeexception saying ArrayIndexOutOfBoundsException. 

#Array declaration, creation and initialization in one line:
* we can declare, create and initialize an array in a single line. 
	int[] x = {10, 20, 30};
* we can extend this method for multi dimensional arrays also. 
	int[][] x = {{10,20}, {30,40,50}};
* If we want to use this shortcut, compulsary we should perform all activities in a single line. If we are trying to divide into multiple lines then we will get compile time error.(Illegal start of expression).

#length versus length():

int x = new int[6];
x.lenght() -> compile time: cannot find symbol
				symbol:method length()
				location :class int[]
x.length --> 6 will be output.
* Length is a final variable applicable for arrays. Length variable represents the size of the array.
* Length() is a final method applicable for string objects. Length() returns number of characters present in the string.
Note: Length variable applicable for arrays but not for string objects, where as length method applicable for string objects but not for arrays.

Question?
String[] s = {'a','aa','aaa'};

s.length;
s.length();
s[0].length;
s[0].length();

* In multi dimensional arrays length variable represents only base size but not total size.
int[] x = new int[6][3];
x.length -->6
x[0].length --> 3

* There is no direct way to find total length of multi dimensional array. But, indirectly we can find as follows. 
x[0].lenght + x[1].lenght+...

#Anonymous arrays:
* some times we can declare an array without name, such type of name less arrays are called anonymous arrays. The main purpose of anonymous arrays is just for instant use(one time usage).

* We can create anonymous arrays as follows
new int[]{10,20,30}
* While creating the anonymous arrays we can't specify the size otherwise we will get compile time error. Also, we can create multi dimensional anonymous arrays also. new int[][]{{10,20},{30,40,50}};
* Based on our requirement we can give the name for anonymous array then it is no longer anonymous.

#Array Element assignments:
case 1: In the case of primitive type arrays as array elements we can provide any type which can be implicitly promoted to declared type.
In the case of float type arrays the allowed data types are byte, short, int, char, long, float.

case 2: In the case of object type arrays as array elements we can provide either declared type objects or its child class objects.
case 3: For interface type arrays as array elements its implementation class objects are allowed. runnable and threads are examples.

#Array variable assignments:
Case 1: Element level promotions are not applicable at array level for example char element can be propmoted to int type whereas char array can not be promoted to int array.
* But in the case of object type arrays child class type array can be promoted to parent class type array.

Case 2: When ever we are assigning one array to another array internal elements wont be copied just reference variable will be reassigned.

Case 3: when ever we are assigning one array to another array the dimensions must be matched. For example
In the place one dimensional int array we should provide one dimensional array only. If we are trying to provide any other dimension then we will get compile time error.
int[][] a = new int[3][];

a[0] = new int[2][3]; --> not valid
a[0] =10 --> not valid
a[0] = new int[2]; -->valid
* when ever we are assigning one array to another array both dimensions and types must be matched but sizes are not required to match. 