🔹 Pattern 1 – Single Star Pattern

Description:
Prints a single star using basic loop execution.
This pattern introduces simple output printing and loop structure in Java.

Code:
Array-Patterns/Pattern1.java

Output:

*

🔹 Pattern 2 – Square Star Pattern

Description:
Prints a square of stars using nested loops.
This pattern helps understand row–column traversal using loops.

Code:
Array-Patterns/Pattern2.java

Output:

* * *

🔹 Pattern 3 – Rectangular Star Pattern

Description:
Prints a rectangle of stars where the number of rows and columns can differ. 
This improves clarity on loop boundaries and variable-driven dimensions.

Code: Array-Patterns/Pattern3.java

Output: 
* * *
* * *
* * *

🔹 Pattern 4 – Right-Angled Triangle Pattern

Description:
Prints a right-angled triangle with increasing stars per row.
Demonstrates dependency of inner loop on outer loop index.

Code:
Array-Patterns/Pattern3.java

Output:

*
* *
* * *
* * * *

🔹 Pattern 5 – Inverted Right-Angled Triangle

Description:
Prints an inverted right-angled triangle by decreasing the number of stars in each row. 
This pattern focuses on reverse loop logic.

Code: Array-Patterns/Pattern5.java

Output: 
* * * * *
* * * *
* * *
* *
* 

🔹 Pattern 6 – Pyramid Star Pattern
Description:
Prints a centered pyramid using spaces and stars.
Focuses on alignment and coordination between multiple loops.

Code:
Array-Patterns/Pattern6.java

Output:
                *
              * * *
            * * * * *
          * * * * * * *

🔹 Pattern 7 – Inverted Pyramid Pattern
Description:
Prints an inverted pyramid of stars. 
This pattern strengthens understanding of space-star balance and decreasing sequences.

Code: Array_Patterns/Pattern7.java

Output: 
                * * * * * * *
                  * * * * *
                    * * *
                      *

🔹 Pattern 8 – Diamond Star Pattern

Description:
Prints a diamond shape by combining a pyramid and an inverted pyramid. 
This pattern improves understanding of symmetry and code reuse.

Code: Array-Patterns/Pattern8.java

Output: 
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 

🔹 Pattern 9 – Special / Conditional Star Pattern

Description:
Prints a pattern using conditional logic inside loops. 
This pattern bridges basic patterns and complex logic-based problems.

Code: Array-Patterns/Pattern9.java

Output: 
         * * *  *
         *      *
         *      *
         
         *      *
         * * *  *

🔹 Pattern 10 – Number Triangle Pattern

Description:
Prints a triangle of numbers starting from 1 in each row.
Strengthens understanding of numeric patterns and nested loops.

Code:
Array-Patterns/Pattern8.java

Output:

1
1 2
1 2 3
1 2 3 4

🛠 Tools Used

Java

Eclipse IDE

🧠 Key Learnings

Nested loop mastery

Pattern logic development

Output formatting

Strong foundation for DSA


# Check if Array is in Ascending Order — Java

This program checks whether a given integer array is sorted in
ascending order or not.

---

## 🟢 Problem Statement

Given an array `arr[]`, determine whether the array elements are in
strict ascending order.

Example

Input  : [11, 27, 29, 31, 33]  
Output : Array is in Ascending order

Input  : [11, 27, 29, 31, 3]  
Output : Array is not in Ascending order

---

## ✅ Approach

1. Assume the array is sorted (`isSorted = true`)
2. Iterate through the array
3. Compare each element with the next element
4. If any element is greater than the next element
   - mark `isSorted = false`
   - break the loop
5. Print result based on the flag

---

## 🧠 Logic Used

arr[i] > arr[i+1] → array is not sorted

---

## ⏱️ Time & Space Complexity

- Time Complexity  : O(n)
- Space Complexity : O(1)

---

## 🧪 Test Cases Considered

- Sorted array
- Unsorted array
- Duplicate values
- Single element array

---

## 🎯 Learning Outcome

- Array traversal
- Conditional comparisons
- Boolean flag usage
- Early loop termination for efficiency

Descending Order Check

# Check if Array is in Descending Order — Java

This program checks whether a given integer array is sorted in
descending order or not.

---

## 🟢 Problem Statement

Given an array `arr[]`, determine whether the elements are in
strict descending order.

Example

Input  : [31, 29, 27, 20, 11]
Output : Array is in Descending order

Input  : [29, 27, 28, 31, 3]
Output : Array is not in Descending order

---

## ✅ Approach

1. Assume the array is sorted (`isSorted = true`)
2. Traverse the array
3. Compare each element with the next one
4. If any element is **less than** the next element
   - array is not descending
   - stop early using `break`
5. Print result

---

## 🧠 Logic Used

arr[i] < arr[i+1] → array is not descending

yaml
Copy code

---

## ⏱️ Time & Space Complexity

- Time Complexity  : O(n)
- Space Complexity : O(1)

---

## 🧪 Test Cases Considered

- Strict descending array
- Not descending
- Duplicate values
- Single element array

---

## 🎯 Learning Outcome

- Pairwise element comparison
- Boundary condition handling
- Efficient early exit logic


Array Left Rotation — Java Solutions

This repository contains two implementations of the Left Rotation of an Array problem in Java:

Iterative Single-Shift Approach (Brute Force)

Optimal Reversal Algorithm (O(n), In-Place)

Both programs rotate the array to the left by k positions.

🟢 Problem Statement

Given an array arr[] and an integer k, rotate the array to the left by k positions.

Example:

Input  : [1, 2, 3, 4], k = 2
Output : [3, 4, 1, 2]

✅ Solution 1 — Iterative Single-Shift (Brute Force)

File: LeftRotateArray.java

Approach

Normalize rotation count using k % n

Repeat k times:

Store arr[0] in temp

Shift elements one step left

Place temp at last index

Complexity

Time : O(k * n)

Space : O(1)

✔ Simple and readable
❌ Slower for large k

🚀 Solution 2 — Optimal Reversal Algorithm

File: OptimalSolutionOfLeftRotateArray.java

Approach (3-Step Reverse)

1️⃣ Reverse first k elements
2️⃣ Reverse remaining n-k elements
3️⃣ Reverse entire array

Complexity

Time : O(n)

Space : O(1) (in-place)

✔ Efficient for large arrays
✔ No extra memory

🧪 Test Cases Covered

k = 0

k = 1

k > n

Single-element array

Normal rotation

🎯 Learning Outcomes

Difference between brute-force vs optimal solutions

In-place array manipulation

Time–space trade-offs

Writing clean & structured Java code
