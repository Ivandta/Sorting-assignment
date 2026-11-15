# Sorting Algorithms with Linked List in Java

A collection of six classic sorting algorithms implemented in Java to sort a **singly linked list**.
Every program is self-contained, and runs with built-in sample data in its
own `main` method, so no manual input is needed.

## Author

| | |
|---|---|
| **Name** | Mohammad Ivan Andita |
| **Student ID** | F1D02510076 |
| **Class** | A |
| **GitHub** | [Ivandta](https://github.com/Ivandta) |

## Project Structure

```
.
├── Node.java            # Linked list node and helper methods
├── BubbleSort.java
├── InsertionSort.java
├── SelectionSort.java
├── MergeSort.java
├── QuickSort.java
├── ShellSort.java
└── README.md
```

## Algorithms

| File | Algorithm | How it works on a linked list | Average time |
|------|-----------|-------------------------------|--------------|
| `BubbleSort.java` | Bubble Sort | Swaps the data of adjacent nodes until no swap is needed | O(n²) |
| `InsertionSort.java` | Insertion Sort | Re-links each node into a new sorted list | O(n²) |
| `SelectionSort.java` | Selection Sort | Finds the smallest node and swaps it to the front of the unsorted part | O(n²) |
| `MergeSort.java` | Merge Sort | Splits the list with slow/fast pointers, then merges sorted halves | O(n log n) |
| `QuickSort.java` | Quick Sort | Partitions the nodes around the last node as pivot | O(n log n) |
| `ShellSort.java` | Shell Sort | Gapped insertion sort with a shrinking gap, accessing nodes by index | depends on gap |

## The `Node` Class

`Node.java` is the building block shared by all algorithms:

- `data` and `next` fields for the value and the link to the next node
- `fromArray(int[])` builds a linked list from sample values
- `length(Node)` returns the number of nodes
- `print(String, Node)` prints the list as `64 -> 34 -> 25`

## How to Run

Compile everything once:

```bash
javac *.java
```

Then run any algorithm:

```bash
java BubbleSort
```

## Example Output

```
Before sorting: 64 -> 34 -> 25 -> 12 -> 22 -> 11 -> 90
After sorting : 11 -> 12 -> 22 -> 25 -> 34 -> 64 -> 90
```

## Requirements

- Java Development Kit (JDK) 8 or newer
