# Array
- Arrays allow both primitive types and reference types in their declaration
- The size of array is fixed
- Trying to access index out of declared array will result in exception

## Declaring an array
- Java에서는 Array를 Heap 영역에 동적할당으로만 선언할 수 있다.

```java
// Declaring an array
int[] x = new int[100]; // int[]는 stack에 저장되는 레퍼런스이다. int[100]은 heap에 저장된다.
// It is also possible to put [] after variable name
// But int[] x is preferred
int y[] = new int[100];
// Declaring and assigning value at the same time
int[] z = { 1, 2, 3, 4, 5 };
```

## Assigning a value to the array
```java
x[0] = 1;
```

## Getting the length value of the array
```java
// length is a property (variable) implemented with final
// It is a variable that cannot be modified
System.out.println(x.length);
```

## Iterating over the array
```java
// This is called foreach statement
for (int i : x) {
    System.out.print(i);
}
```

## 2D array
```java
// Declaring a 2D array
int[][] x = new int[5][5];
int y[][] = new int[5][5];

// Declaring and assigning value simultaneously
int[][] z = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
```

# Using Arrays class

## Import Statement
```java
import java.util.Arrays;
import java.util.Collections;
```

## Checking if two arrays are the same
```java
// In order for two arrays to be equal,
// Two arrays should contain the same elements in the same order
Arrays.equals(x, y);
```

## Sorting the array

### Ascending order
```java
// Sorting the array into ascending order
int[] x = { 3, 2, 1 };
Arrays.sort(x);
```

### Descending order
```java
// Sorting the array into descending order
// In order to use descending order sorting, data type should be reference type
Integer[] y = { 1, 2, 3 };
Arrays.sort(y, Collections.reverseOrder());
```

## Replace elements with specific value
```java
// Fill all the index with specific value
Arrays.fill(x, 1);
// Fill only specific range into specific value
// toIndex is not included
Arrays.fill(x, 2, 3, 1);
```

## Copy specific range from the array
```java
// Copy the first three elements from the array
int[] y = Arrays.copyOf(x, 3);
```

## Converting the array into a String
```java
String y = Arrays.toString(x);
```

## Binary Search
> Note that if the array is not sorted in ascending order, this method may not return correct answer
```java
// To use this binarySearch() method
// Array should be sorted in ascending order
// Because of its implementation
int index = Arrays.binarySearch(x, 1);
```
