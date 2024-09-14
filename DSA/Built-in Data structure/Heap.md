# Heap
- PriorityQueue class in the Java collection framework is implemented as min heap
- Smaller value is more prioritized
- The size of priority queue grows automatically when elements are added
- Rule
  - Only the last level can be fully filled
  - All other levels should be completely filled
  - If the last level is uncomplete, then it is filled from left to right
- Multiple elements with the same value are allowed
- Unlike binary search tree, there is no structure like left child is not small and right child is not bigger that parent node
- However, in the min Heap, everything below specific node is greater than the node
- Reading from array
  - index of left child node = $2\times index$
  - index of right child node = $2\times index + 1$
  - index of parent node = $\lfloor {\frac{index}{2}}\rfloor$


## Import Statement
```java
import java.util.PriorityQueue;
```

## Declaring a Min Heap
```java
// Declaring a Min Heap
PriorityQueue<Integer> x = new PriorityQueue<>();
```

## Adding element to the Heap
```java
// In PriorityQueue, add() method and offer() method does exactly same operation
x.add(1);
x.offer(1);
```

## Extracting minimum element from the heap
```java
// poll() method returns null if the queue is empty
x.poll();
// remove() method throws exception if the queue is empty
x.remove();
```

## Removing specific element from the heap
- `remove()` method with parameter can find and remove element with specific value
```java
// Unlike poll() method,
// remove(value) method can remove element with specific value
x.remove(100);
```

## Showing the topmost element in the heap
```java
// peek() method returns null if the priority queue is empty
x.peek();
// element() method is not declared in PriorityQueue class
```

## Setting up priority rule with comparator function
```java
Queue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(Lambda Function);
```
- If return value of the lambda function is negative, then `a` and `b` changes the location.
- $\underset{\text{higher priority}}{\underset{\rightarrow}{f(a,b)}} \begin{cases}
\text{change position}&\text{if}\quad\text{return value}\leq 0\\
\text{no change}&\text{otherwise}
\end{cases}$
  - Variable on the **right** has higher priority than variable on the **left**.
- Descending order <br/>
$\underset{\text{higher priority}}{\underset{\rightarrow}{f(a,b)}}\longrightarrow b-a$

- Ascending order <br/>
$\underset{\text{higher priority}}{\underset{\rightarrow}{f(a,b)}}\longrightarrow a-b$

### Descending order priority queue (MaxHeap)
```java
Queue<Integer> pq = new PriorityQueue<>((a, b) -> {
    return b - a;
});
```

### Ascending order priority queue (MinHeap)
```java
Queue<Integer> pq = new PriorityQueue<>((a, b) -> {
    return a - b;
});
```