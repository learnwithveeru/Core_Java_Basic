1-	What is JDK?
The Java Development Kit (JDK) is a core software development environment used by developers to create, compile, debug, and run Java applications.
It is a core package used in Java, along with the JVM (Java Virtual Machine) and the JRE (Java Runtime Environment). 
JDK contains:
•	Java Runtime Environment (JRE),
•	An interpreter/loader (Java),
•	A compiler (javac),
•	An archiver (jar) and many more.
 

Array :
An array is an indexed collection of fixed number of homogeneous data elements.
The main advantage of arrays is we can represent multiple values with the same name so that readability of the code will be improved.

Fixed in size that is once we created an array there is no chance of increasing or decreasing the size based on our requirement that is to use arrays concept compulsory we should know the size in advance which may not possible always.

Types of Variables :

•	Based the type of value represented by the variable all variables are divided into 2 types.
They are:
1)	Primitive variables
2)	Reference variables
   
Primitive variables: Primitive variables can be used to represent primitive values.
Example: int x=10;

Reference variables: Reference variables can be used to refer objects.
Example: Student s=new Student();

•	Based on the purpose and position of declaration all variables are divided into the following 3 types.
1)	Instance variables
2)	Static variables
3)	Local variables
   
Instance variables: 
•	If the value of a  is varied from object to object such type of variables are called instance variables.

•	For every object a separate copy of instance variables will be created.

•	Instance variables will be created at the time of object creation and destroyed at the time of object destruction hence the scope of instance variables is exactly same as scope of objects.

•	Instance variables will be stored on the heap as the part of object.

•	Instance variables should be declared with in the class directly but outside of any method or block or constructor.7

•	Instance variables can be accessed directly from Instance area. But cannot be accessed directly from static area.

•	But by using object reference we can access instance variables from static area.

•	For the instance variables it is not required to perform initialization JVM will always provide default values.

•	Instance variables also known as object level variables or attributes.



