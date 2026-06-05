package day_5;

public class BackTracking {
	
//	# Backtracking in Java
//
//	## What is Backtracking?
//
//	**Backtracking** is a problem-solving technique where you:
//
//	1. Make a choice.
//	2. Explore that choice.
//	3. If it doesn't lead to a solution, undo the choice.
//	4. Try another choice.
//
//	Think of it as:
//
//	```text
//	Choose
//	   ↓
//	Explore
//	   ↓
//	Wrong?
//	   ↓
//	Undo (Backtrack)
//	   ↓
//	Try Again
//	```
//
//	---
//
//	# Real-Life Example
//
//	Imagine you're in a maze.
//
//	```text
//	Start
//	  |
//	  +-- Left Path
//	  |      |
//	  |      +-- Dead End ❌
//	  |
//	  +-- Right Path
//	         |
//	         +-- Exit ✅
//	```
//
//	You:
//
//	1. Go left.
//	2. Reach a dead end.
//	3. Come back.
//	4. Try the right path.
//	5. Reach the exit.
//
//	This "come back and try another option" is **backtracking**.
//
//	---
//
//	# Why Use Backtracking?
//
//	When a problem has:
//
//	* Multiple choices
//	* Multiple paths
//	* Need to find all solutions
//	* Need to find one valid solution
//
//	Examples:
//
//	* N Queens
//	* Sudoku Solver
//	* Rat in a Maze
//	* Generate Permutations
//	* Generate Subsets
//	* Word Search
//
//	---
//
//	# Core Concept
//
//	Every backtracking solution follows:
//
//	```text
//	Make a Choice
//	      ↓
//	Explore Recursively
//	      ↓
//	Undo the Choice
//	```
//
//	The "Undo" step is what makes backtracking different from normal recursion.
//
//	---
//
//	# Example: Generate All Binary Strings of Length 3
//
//	Possible answers:
//
//	```text
//	000
//	001
//	010
//	011
//	100
//	101
//	110
//	111
//	```
//
//	Tree:
//
//	```text
//	                 ""
//	              /      \
//	            0          1
//	          /   \      /   \
//	        00    01   10    11
//	       / \    / \  / \   / \
//	    000 001 ...
//	```
//
//	Backtracking explores one branch completely before returning.
//
//	---
//
//	# Example 1: Print All Subsets
//
//	Array:
//
//	```text
//	[1, 2]
//	```
//
//	Possible subsets:
//
//	```text
//	[]
//	[1]
//	[2]
//	[1,2]
//	```
//
//	### Idea
//
//	For each element:
//
//	```text
//	Take it
//	OR
//	Don't take it
//	```
//
//	---
//
//	## Java Code
//
//	```java
//	import java.util.ArrayList;
//
//	public class BacktrackingDemo {
//
//	    static void subsets(int[] arr, int index,
//	                        ArrayList<Integer> current) {
//
//	        if(index == arr.length) {
//	            System.out.println(current);
//	            return;
//	        }
//
//	        // Take current element
//	        current.add(arr[index]);
//	        subsets(arr, index + 1, current);
//
//	        // Backtrack
//	        current.remove(current.size() - 1);
//
//	        // Don't take current element
//	        subsets(arr, index + 1, current);
//	    }
//
//	    public static void main(String[] args) {
//
//	        int[] arr = {1, 2};
//
//	        subsets(arr, 0, new ArrayList<>());
//	    }
//	}
//	```
//
//	Output:
//
//	```text
//	[1, 2]
//	[1]
//	[2]
//	[]
//	```
//
//	---
//
//	# Understanding the Backtrack Step
//
//	Suppose:
//
//	```text
//	Current = [1]
//	```
//
//	You add:
//
//	```text
//	2
//	```
//
//	Now:
//
//	```text
//	[1,2]
//	```
//
//	After exploring:
//
//	```java
//	current.remove(current.size()-1);
//	```
//
//	becomes:
//
//	```text
//	[1]
//	```
//
//	You undo your previous decision.
//
//	This is **backtracking**.
//
//	---
//
//	# Example 2: String Permutations
//
//	Input:
//
//	```text
//	ABC
//	```
//
//	Output:
//
//	```text
//	ABC
//	ACB
//	BAC
//	BCA
//	CAB
//	CBA
//	```
//
//	### Concept
//
//	Choose one character.
//
//	```text
//	ABC
//
//	Choose A
//	Remaining BC
//
//	Choose B
//	Remaining C
//
//	Choose C
//	Done
//	```
//
//	Then return and try other choices.
//
//	---
//
//	## Java Code
//
//	```java
//	public class Permutation {
//
//	    static void permute(String str, String ans) {
//
//	        if(str.length() == 0) {
//	            System.out.println(ans);
//	            return;
//	        }
//
//	        for(int i = 0; i < str.length(); i++) {
//
//	            char ch = str.charAt(i);
//
//	            String remaining =
//	                    str.substring(0, i)
//	                  + str.substring(i + 1);
//
//	            permute(remaining, ans + ch);
//	        }
//	    }
//
//	    public static void main(String[] args) {
//
//	        permute("ABC", "");
//	    }
//	}
//	```
//
//	---
//
//	# Recursion vs Backtracking
//
//	### Recursion
//
//	```text
//	Problem
//	 ↓
//	Smaller Problem
//	 ↓
//	Smaller Problem
//	```
//
//	Focuses on solving smaller versions.
//
//	---
//
//	### Backtracking
//
//	```text
//	Choose
//	 ↓
//	Explore
//	 ↓
//	Undo
//	 ↓
//	Choose Again
//	```
//
//	Focuses on exploring all possibilities.
//
//	---
//
//	# Common Interview Problems
//
//	1. Subsets
//	2. Permutations
//	3. N-Queens
//	4. Sudoku Solver
//	5. Rat in a Maze
//	6. Word Search
//	7. Combination Sum
//
//	---
//
//	# Easy Formula
//
//	Whenever you see:
//
//	```text
//	For every choice:
//	    Choose
//	    Recurse
//	    Undo
//	```
//
//	you're looking at a **backtracking problem**.
//
//	### Mental Model
//
//	```text
//	Take
//	 ↓
//	Explore
//	 ↓
//	Remove
//	 ↓
//	Try another option
//	```
//
//	That "remove" (undo) step is the heart of backtracking.
//

}
