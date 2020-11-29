# Sort manager

This program generates an array of numbers of a chosen length.
This array is then sorted by a sort algorithm of the user's choosing.

## Requirements
- Create a program that can sort a given array using a bubble sort, merge sort or binary tree
- A factory pattern must be used to create the sorter object

## Technology
### Exceptions
- A user defined exception - ChildNotFoundException - is called if the binary tree does not contain a child node
### Logging
- Exceptions are logged in a text file
### Design Patterns
- A factory pattern is used to abstract object creation
- Each sort type extends the Sorter interface, this allows the sort object to be created in a factory class

## User Guide

- You will be prompted to enter the number of elements you wish to sort
- An array of your chosen number of elements will be created at random
- You may now select a type of sort to run in the array:

1. Bubble Sort
2. Merge Sort
3. Binary Tree

- Once the sort type has been selected, the elements will be sorted and the time elapsed will also be shown.

