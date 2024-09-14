# List
- Objects in set does not have guaranteed order.
- List has order.
- Objects are in the list are guaranteed to stay in order you put them in.
- List can contain duplicate.
- Set does not allow duplicate.
- You can't pass in primitive type as object in collection.
- Almost 100% of time you use `ArrayList` class to implement `List` interface type.
- `ArrayList` class uses an array for underlying data structure.
- When you create `ArrayList`, it actually go and create an array to pull all of objects in.
- Another implementation is `LinkedList`.
- Difference between `ArrayList` and `LinkedList` is how it is built and implemented behind the scene.
- There are certain operations that could be slower or faster between `ArrayList` and `LinkedList`, functionality is exactly the same.

## Import statement

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
```

## Declaring a List
```java
// Declare a List x with an array list
// Use ArrayList 90% of the time
List<Integer> x = new ArrayList<>();

// Declare a list y with a linked list
// Another implementation of List interface
List<Integer> y = new LinkedList<>();
```
## Declaring a List from an array

```java
// Declare a list from an array
// Array.asList() method returns a fixed size list whose size cannot be changed
Integer[] I = {1, 2, 3, 4, 5};
List<Integer> z = Arrays.asList(I);

// Declare a list which has flexible size
List<Integer> Z = new ArrayList<>(Arrays.asList(I));
```

## Add element

```java
// adding element to the end of the list
x.add("A");
x.add("B");
x.add("C");
x.add("E");

// adding element to specific index
// I cannot add at the index that does not exist
// adding "D" at index 3
x.add(3, "D");
```

## Retrieve element

```java
// retrieve element at specific index
x.get(2);
```

## Remove element

```java
// remove element at specific index
x.remove(2);

// remove the leftmost element that has specific value
x.remove("D");
```

## Update element at specific index
```java
// update element at specific index
x.set(1, "G");
```

## Additional operations

### Size of a list
```java
// get the size of array
x.size();
```

### Check if the list contains element
```java
// check if the list contains any element with specific value
x.contains("B");
```

### Check if the list is empty
```java
// check if the list doesn't contain any element
x.isEmpty();
```
### Clear out all the elements
```java
// erase all the elements from the list
x.clear();
```

### Simply reverse existing elements
```java
// simply reverse the order of elements in the list
// it doesn't sort into descending order
Collections.reverse(x);
```

### Sorting the list
```java
// sort the list on alphabetical order
Collections.sort(x);
```

### Shuffle the elements
```java
// shuffle elements in a random order
Collections.shuffle(x);
```

### Making an array out of the list
```java
// converting the list into an array
// 1. make an array whose size is the same as the list
// 2. copy elements from the list to the array
String[] A = x.toArray(new String[x.size()]);

// giving 0 sized array as argument will make toArray to autopopulate the size of array
String[] B = x.toArray(new String[]{});
```

