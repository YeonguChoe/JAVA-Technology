# Set
- Hold collection of the same object data type.
- HashSet does not always maintain alphabetical order. However, TreeSet maintains alphabetial ordering.
- Set does not allow to have two elements with the same value. More precisely, if the value already exist in the set, it doesn't add to the set.
- 90% of time use HashSet for the implementation.

## Import statement
```java
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Arrays;
```

## Declaring a set
```java
// Declare a HashSet
// use HashSet 99% of the time
// HashSet is implemented with hash table
// Unlike TreeSet, HashSet does not preserve any ordering
Set<String> x = new HashSet<>();

// Declare a TreeSet
// TreeSet guarantee the alphabetical ascending order
Set<String> y = new TreeSet<>();
```

## Declaring a Set from an array

```java
// Declare a set from an array
// Unlike the case of list, the created set has flexible size
Integer[] I = {1, 2, 3, 4, 5};
Set<Integer> i = new HashSet<>(Arrays.asList(I));
```

## Adding an element to the set
```java
// add element to the set
x.add("A");
```

## Removing an element from the set
```java
x.remove("E");
```

## Additional operations
### Check if the set contains an value
```java
// check if the set contains specific value
x.contains("A");
```

### Check if the set is empty
```java
// check if the set is empty
x.isEmpty();
```

### Clear out the set 
```java
// erase all the elements from the set
x.clear();
```

### Making an array out of the set
```java
// converting the set into an array
// 1. make an array whose size is the same as the set
// 2. copy elements from the set to the array
String[] A = x.toArray(new String[x.size()]);

// giving 0 sized array as argument will make toArray to autopopulate the size of array
String[] B = x.toArray(new String[]{});
```