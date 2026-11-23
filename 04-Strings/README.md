# 📘 Day 6: Strings Basics in Java

## 🎯 Objective

Learn the fundamentals of strings in Java. Practice string declaration, initialization, accessing characters, finding string length, reversing strings, checking palindromes, and counting vowels and consonants.

---

## 📚 Topics Covered

- Introduction to Strings
- String Declaration and Initialization
- String Concatenation
- String Length
- `length()` Method
- `charAt()` Method
- String Traversal
- String Reversal
- Palindrome Checking
- `equals()` Method
- `toLowerCase()` Method
- Vowels and Consonants Counting

---

## 💻 Programs Practiced

| # | Program | Concepts |
|---|---|---|
| 1 | `StringBasics.java` | String declaration, initialization, and concatenation |
| 2 | `StringLength.java` | Finding string length using `length()` |
| 3 | `ReverseString.java` | Reversing a string using a loop and `charAt()` |
| 4 | `PalindromeString.java` | Palindrome checking and string comparison |
| 5 | `CountVowelsConsonants.java` | Counting vowels and consonants using conditions |

---

## 🧠 Key Concepts

### 1. Strings
A String in Java is a sequence of characters used to store text.

### 2. String Declaration and Initialization
```java
String name = "Java";
```

### 3. String Concatenation
The `+` operator is used to join strings.

### 4. String Length
The `length()` method returns the total number of characters in a string, including spaces.

### 5. `charAt()`
The `charAt(index)` method returns the character at a specified index.

### 6. String Traversal
Traversal means accessing each character of a string using a loop.

### 7. String Reversal
A string can be reversed by traversing it from the last index to the first.

### 8. Palindrome
A palindrome is a string that reads the same forward and backward.

### 9. `equals()`
The `equals()` method compares the contents of two strings.

### 10. Vowels and Consonants
Characters can be checked and counted based on whether they are vowels or consonants.

---

## ⏱️ Time Complexity

| Program | Time Complexity | Space Complexity |
|---|---|---|
| `StringBasics.java` | O(1) | O(1) |
| `StringLength.java` | O(1) | O(1) |
| `ReverseString.java` | O(n²)* | O(n²)* |
| `PalindromeString.java` | O(n²)* | O(n²)* |
| `CountVowelsConsonants.java` | O(n) | O(1) |

\*The reversal and palindrome programs use repeated string concatenation inside loops. In Java, strings are immutable, so repeated concatenation can result in quadratic time and space costs. Using `StringBuilder` can improve these operations to O(n).

---

## 🛠️ Tools Used

- Java
- VS Code
- Git
- GitHub

---

## 📈 Learning Outcome

- Learned how to declare and initialize strings.
- Practiced string concatenation.
- Used `length()` and `charAt()` methods.
- Traversed strings using loops.
- Reversed strings.
- Checked palindrome strings.
- Compared strings using `equals()`.
- Counted vowels and consonants.
- Improved logical thinking and problem-solving skills.

---

**📅 Day 6 completed — DSA Journey continues! 🚀**
