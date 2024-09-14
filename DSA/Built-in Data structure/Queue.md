# Queue
- Most of the times, `LinkedList` implements the `Queue` interface.
- Multiple elements can have the same value in the queue
- There are only 6 available method for Stack class:
    - add(): can throw exception
    - offer(): does not throw exception
    - poll(): does not throw exception
    - remove(): can throw exception
    - peek(): does not throw exception
    - element(): can throw exception

## Import Statement
```java
import java.util.Queue;
import java.util.LinkedList;
```

## Declaring a queue
```java
// Declaring a queue
// Most of the time, use LinkedList for implementation
Queue<Integer> x = new LinkedList<>();
```

## Adding element to the queue
### add() method
```java
// add() method returns exception when element cannot be inserted to the queue
// However, LinkedList implementation of a Queue cannot throw exception, because
// there is no size limit to linkedlist
x.add(1);
```

### offer() method
```java
// Another way to add element to the queue
// offer() method returns false, instead of exception, when element cannot be
// inserted to the queue
// It is designed for situation of using fixed size queue implementation
// such as ArrayBlockingQueue
x.offer(1);
```

## Removing element from the queue
### poll() method
```java
// poll() method returns null if the queue is empty
x.poll();
```

### remove() method
```java
// Unlike poll() mehtod, 
// remove() method throws exception if the queue is empty
x.remove();
```

## Peeking an element at the head (frontmost position) of the queue
### peek() method
```java
// peek() method returns null if the queue is empty
x.peek();
```

### element() method
```java
// element() method throws exception if the queue is empty
x.element();
```
