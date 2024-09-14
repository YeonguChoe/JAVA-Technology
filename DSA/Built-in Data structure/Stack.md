# Stack
- Stack allows duplicate value
- There are only 5 available method for Stack class:
    - push()
    - pop()
    - peek()
    - empty()
    - search()

## Import Statement
```java
import java.util.Stack;
```

## Declaring a Stack
```java
// Declaring a stack
Stack<Integer> x = new Stack<>();
```

## Adding an element to the stack
```java
// Adding element to the stack
// It allows adding duplicate value
x.push(1);
```

## Removing an element at the top of the stack
```java
// Removing an element from the top of the stack
// It returns the value of removed element
x.pop();
```

### Popping an element from an empty stack results in _EmptyStackException_
> How to handle exception
```java
if (!x.isEmpty()) {
    x.pop();
}
```

## Peeking an element at the top
```java
// Looking at element at the top
// It doesn't remove the element from the stack
x.peek();
```

## Checking the stack is empty
```java
// Checking if the stack is empty
x.empty();
```

## Searching value from the stack
```java
// Count how far the element with the value from the top of the stack
// Topmost element is considered as 1
// If there are multiple elements with the same value, return the distance of the closest element from the top of the stack
// If the value is not found, it returns -1
x.search(1);
```