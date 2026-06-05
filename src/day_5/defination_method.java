package day_5;

public class defination_method {
	
	
//	
//	// public### Method Signature in Java
//
//method signature is made up of:
//
//1. **Method name**
//2. **Parameter list** (number, type, and order of parameters)
//
//---
//
//### Example
//
//```java
//public void add(int a, int b)
//```
//
//Method Signature:
//
//```java
//add(int, int)
//```
//
//Java ignores:
//
//* `public`
//* `private`
//* `static`
//* Return type (`void`, `int`, etc.)
//
//when determining the signature.
//
//---
//
//### Example 1
//
//```java
//public void add(int a, int b) { }
//```
//
//Signature:
//
//```text
//add(int, int)
//```
//
//---
//
//### Example 2
//
//```java
//public int add(int a, int b) { }
//```
//
//Signature:
//
//```text
//add(int, int)
//```
//
//Even though the return type changed from `void` to `int`, the signature is still the same.
//
//---
//
//### Why is it Important?
//
//Method signatures are used for **method overloading**.
//
//✅ Valid Overloading:
//
//```java
//public void add(int a, int b) { }
//
//public void add(int a, int b, int c) { }
//
//public void add(double a, double b) { }
//```
//
//Signatures:
//
//```text
//add(int, int)
//add(int, int, int)
//add(double, double)
//```
//
//All are different.
//
//---
//
//### Invalid Overloading
//
//```java
//public int add(int a, int b) { }
//
//public void add(int x, int y) { }
//```
//
//Both have:
//
//```text
//add(int, int)
//```
//
//Compiler Error:
//
//```text
//Duplicate method add(int, int)
//```
//
//because the signature is identical.
//
//---
//
//### Quick Rule
//
//For:
//
//```java
//public static int add(int a, int b)
//```
//
//* Method Name = `add`
//* Parameters = `(int, int)`
//* Return Type = `int`
//
//**Method Signature =**
//
//```text
//add(int, int)
//```
//
//Only the **method name + parameter list** form the method signature.
//

}
