package day_5;

public class Recursion {
	
	
//	
//	# Recursion in Java
//
//	## Definition
//
//	**Recursion** is a programming technique in which a method solves a problem by **calling itself repeatedly** until a stopping condition is reached.
//
//	In simple words:
//
//	> A recursive method is a method that calls itself to solve a smaller version of the same problem.
//
//	---
//
//	# Real-Life Analogy
//
//	Imagine standing between two mirrors.
//
//	You see:
//
//	```text
//	You
//	 ↓
//	You
//	 ↓
//	You
//	 ↓
//	You
//	 ↓
//	...
//	```
//
//	The image keeps repeating.
//
//	Recursion works similarly: a method keeps calling itself.
//
//	The difference is that recursion must eventually stop, otherwise it continues forever.
//
//	---
//
//	# Core Idea
//
//	Every recursive problem has two parts:
//
//	## 1. Base Case
//
//	The condition that stops recursion.
//
//	Think of it as:
//
//	```text
//	"When should I stop asking the same question?"
//	```
//
//	Without a base case, recursion never ends.
//
//	---
//
//	## 2. Recursive Case
//
//	The part where the method calls itself.
//
//	Think of it as:
//
//	```text
//	"I can't solve the whole problem,
//	but I can solve a smaller version of it."
//	```
//
//	---
//
//	# How Recursion Thinks
//
//	Suppose you want to reach the top of a staircase.
//
//	Instead of thinking:
//
//	```text
//	I need to climb 100 steps.
//	```
//
//	You think:
//
//	```text
//	To reach step 100,
//	first reach step 99.
//	```
//
//	To reach step 99:
//
//	```text
//	First reach step 98.
//	```
//
//	To reach step 98:
//
//	```text
//	First reach step 97.
//	```
//
//	And so on.
//
//	Eventually you reach:
//
//	```text
//	Step 1
//	```
//
//	which is easy to handle.
//
//	This is exactly how recursion works.
//
//	---
//
//	# Divide Big Problems into Smaller Problems
//
//	Recursion is useful because many large problems can be expressed as:
//
//	```text
//	Big Problem
//	    =
//	Smaller Version of Same Problem
//	```
//
//	Example:
//
//	```text
//	Factorial of 5
//
//	=
//	5 × Factorial of 4
//	```
//
//	The method doesn't solve everything at once.
//
//	It reduces the problem size repeatedly.
//
//	---
//
//	# What Happens Internally
//
//	When a recursive method is called:
//
//	1. Java remembers the current state.
//	2. Pauses that method.
//	3. Calls the same method again.
//	4. Repeats until the base case is reached.
//
//	Once the base case is reached:
//
//	1. The deepest call finishes.
//	2. Java goes back to the previous call.
//	3. Continues returning answers.
//	4. Eventually reaches the original call.
//
//	---
//
//	# Two Phases of Recursion
//
//	## Phase 1: Going Down
//
//	The method keeps calling itself.
//
//	```text
//	Problem 5
//	 ↓
//	Problem 4
//	 ↓
//	Problem 3
//	 ↓
//	Problem 2
//	 ↓
//	Problem 1
//	```
//
//	No final answer yet.
//
//	---
//
//	## Phase 2: Coming Back Up
//
//	After reaching the base case:
//
//	```text
//	Problem 1 solved
//	 ↑
//	Problem 2 solved
//	 ↑
//	Problem 3 solved
//	 ↑
//	Problem 4 solved
//	 ↑
//	Problem 5 solved
//	```
//
//	The final answer is built while returning.
//
//	---
//
//	# Why Recursion Works
//
//	Recursion works because:
//
//	1. Every call handles a smaller problem.
//	2. Smaller problems eventually become simple enough.
//	3. The simplest problem is the base case.
//	4. Solutions combine while returning.
//
//	---
//
//	# Memory Concept
//
//	Each recursive call needs its own information.
//
//	Java stores this information temporarily.
//
//	Think of it like stacking books:
//
//	```text
//	Book 5
//	Book 4
//	Book 3
//	Book 2
//	Book 1
//	```
//
//	When the last book is processed:
//
//	```text
//	Book 1 removed
//	Book 2 removed
//	Book 3 removed
//	Book 4 removed
//	Book 5 removed
//	```
//
//	This is why recursion uses extra memory.
//
//	---
//
//	# Advantages of Recursion
//
//	### Simpler Logic
//
//	Many complex problems become easier to think about.
//
//	### Natural for Hierarchical Structures
//
//	Examples:
//
//	* Trees
//	* Graphs
//	* File systems
//	* Folder structures
//
//	### Elegant Solutions
//
//	Problems often look cleaner and shorter.
//
//	---
//
//	# Disadvantages of Recursion
//
//	### More Memory Usage
//
//	Each call requires additional memory.
//
//	### Can Be Slower
//
//	Creating many method calls has overhead.
//
//	### Risk of Infinite Recursion
//
//	Without a proper base case:
//
//	```text
//	Method
//	 ↓
//	Method
//	 ↓
//	Method
//	 ↓
//	...
//	```
//
//	Eventually the program crashes.
//
//	---
//
//	# Stack Overflow
//
//	A common recursion error is:
//
//	```text
//	StackOverflowError
//	```
//
//	This happens when:
//
//	* Recursion never stops
//	* Base case is missing
//	* Too many recursive calls occur
//
//	Think of it as adding books to a stack until there is no space left.
//
//	---
//
//	# When Should You Think About Recursion?
//
//	Look for problems involving:
//
//	* Repeating patterns
//	* Self-similar structures
//	* Breaking a problem into smaller versions of itself
//	* Trees and hierarchical data
//	* Divide-and-conquer algorithms
//
//	---
//
//	# One-Line Summary
//
//	> Recursion is a problem-solving technique where a method repeatedly calls itself to solve smaller versions of the same problem until it reaches a simple stopping condition, after which the solutions are combined while returning back through the calls.


}
