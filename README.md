# Data Structures with Java

This repository is dedicated to studying **data structures** in Java in an organized and practical way.
My main goal is to strengthen my understanding through hands-on practice, writing examples, and applying the concepts to real problems.

## Objective

* Learn and explore different **data structure types**.
* Practice coding implementations to consolidate knowledge.
* Compare their advantages, disadvantages, and real-world applications.

---

## Sequential Data Structures

**Sequential data structures** store elements in a specific order, where each element has a defined position (index).
This organization improves certain operations such as **searching**, **sorting**, and **iteration**.

Examples of sequential data structures in Java:

* Arrays
* ArrayList
* Strings (as a sequence of characters)
* LinkList

---

### Array

An **Array** in Java:

* Stores a fixed number of elements of the same type.
* Uses indexes (starting from 0) to access elements.
* Is efficient for direct access but not for insertion/removal in the middle.

Example:

```java
int[] numbers = {1, 2, 3, 4, 5};
System.out.println(numbers[0]); // Output: 1
```

Advantages:

* Fast access by index.
* Memory-efficient for fixed-size collections.

Limitations:

* Fixed size (cannot be resized once created).
* Inserting/removing elements requires shifting other elements.

---
> [Study about array](./src/estruturas/sequenciais/Arr.java)

### ArrayList

An **ArrayList**:

* Belongs to the `java.util` package.
* Is a **dynamic array** — it can grow or shrink as needed.
* Offers built-in methods for adding, removing, and searching elements.

Example:

```java
import java.util.ArrayList;

ArrayList<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Orange");

System.out.println(fruits.get(1)); // Output: Banana
```

Advantages:

* Dynamic resizing.
* Rich set of methods (add, remove, contains, etc.).

Limitations:

* Slower insertions/removals in the middle compared to linked structures.
* Slightly more memory usage than arrays due to dynamic nature.

## Future Topics

I plan to expand this repository with:

* Linked Lists
* Stacks
* Queues
* HashMaps
* Trees
* Graphs
