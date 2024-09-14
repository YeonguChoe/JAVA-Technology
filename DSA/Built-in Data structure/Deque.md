# Double Ended Queue
- Deque is a queue that supports insertion and deletion from the front (head) or back (tail)
- Mostly `ArrayDeque` is used instead of LinkedList for the implementation
- 12 methods are available in Deque
    - addFirst(): can throw exception
    - addLast(): can throw exception
    - offerFirst(): does not throw exception
    - offerLast(): does not throw exception
    - removeFirst(): can throw exception
    - removeLast(): can throw exception
    - pollFirst(): does not throw exception
    - pollLast(): does not throw exception
    - getFirst(): can throw exception
    - getLast(): can throw exception
    - peekFirst(): does not throw exception
    - peekLast(): does not throw exception

## Import Statement
```java
import java.util.Deque;
import java.util.ArrayDeque;
```

## Declaring a deque
```java
// Declaring a Double ended queue
// ArrayDeque dynamically resizes itself if it needs more space
Deque<Integer> x = new ArrayDeque<>();
```

## Adding element to the Deque
```java
// adding element at the beginning or the end of the deque
// addFirst() and addLast() method throws exception when element cannot be added
// to the queue
x.addFirst(1);
x.addLast(16);

// offerFirst() and offerLast() method returns false when element cannot be added to the deque
x.offerFirst(1);
x.offerLast(16);
```

## Removing element from the Deque
- There is no argument to removing methods
```java
// removeFirst() and removeLast() method throws exception if the deque is empty
x.removeFirst();
x.removeLast();

// pollFirst() and pollLast() method returns null if the deque is empty
x.pollFirst();
x.pollLast();
```

## Looking at the front and the back of the deque
- These methods doesn't remove element
```java
// getFirst() and getLast() method throws exception if the deque is empty
x.getFirst();
x.getLast();

// peekFirst() and peekLast() method returns null if the deque is empty
x.peekFirst();
x.peekLast();
```

