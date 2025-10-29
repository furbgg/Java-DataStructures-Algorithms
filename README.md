> **Note: Language Context**
>
> Please note that this project was written in **German** as part of my `Ausbildung` (German vocational training). Therefore, all variable names, comments, and package/class names are in German.

---

# Java Data Structures & Algorithms (DSA) Toolkit

## About This Project

This repository is a core Computer Science showcase, demonstrating my from-scratch implementations of fundamental Data Structures and Sorting Algorithms.

This toolkit is divided into two main components:
1.  **A Custom `LinkedList`**: A generic, node-based data structure.
2.  **A `SorterApp`**: A collection of classic sorting algorithms.

---

## 1. Custom `LinkedList` (From Scratch)

Found in the `/linkedlist` directory.

This is a complete, from-scratch implementation of a singly `LinkedList`, built to understand the core concepts of node-based data structures.

### Key Features:

* **Generics (`<E>`)**: The list is fully generic and type-safe (it's a `PrivLinkedList<E>`), allowing it to hold any object type (`String`, `Integer`, etc.).
* **Internal `Node` Class**: Uses a private inner `Node` class to manage the `value` and the `next` pointer.
* **Core Methods Implemented:**
    * `add(E element)`: Adds an element to the end of the list (O(n) complexity).
    * `addIndex(int index, E element)`: Inserts an element at a specific index.
    * `get(int index)`: Retrieves an element by traversing the list.
    * `remove(int index)`: Removes an element by "unlinking" it from the chain.
    * `size()`: Tracks the list size.
    * `toString()`: A custom `toString` method to visualize the list (e.g., `[A -> B -> C]`).
* **`ListApp.java`**: A `main` class that fully tests and demonstrates all functionalities of the `PrivLinkedList`.

---

## 2. Sorting Algorithm Implementations

Found in the `/sorting` directory (`sorterApp.java`).

This is a collection of three fundamental sorting algorithms, implemented from scratch to compare their logic and performance.

### Algorithms Included:

1.  **`bubbleSort()`**: The classic O(n²) algorithm that repeatedly swaps adjacent elements if they are in the wrong order.
2.  **`insertionSort()`**: An efficient O(n²) algorithm that builds the final sorted array one item at a time.
3.  **`mergeSort()`**: A highly efficient O(n log n) "Divide and Conquer" algorithm.
    * **Recursive Logic:** `mergeSortrecursive()` splits the array into halves until it has
