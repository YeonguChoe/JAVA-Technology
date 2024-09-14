# Map
- Map is a collection of key value pair.
- 90% of the time, use HashMap
- Keys and value should be classes because they cannot be primitive data types.
- Both key and value have different data type
- HashMap doesn't guaranteed ordering in the map
- LinkedHashMap maintains ordering which is based on added order
- TreeMap maintains ascending alphabetical ordering of keys in the map
- Map is like a lookup table
- Using map speeds up the code because it just look up the element without iterating to find element
- All the keys of the map is unique.
- However, different elements in a map can have the same value.
- Only one element in the map can have `null` as a key.
```java
x.put(null, "Null key element");
```
- However, many elements can have `null` as value.

# Import statement
```java
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
```

## Declaring a Map
```java
// Declaring a HashMap
// Use HashMap 90% of time to implement a map
// HashMap doesn't have ordering
Map<Integer, String> x = new HashMap<>();

// Declaring a LinkedHashMap
// LinkedHashMap keeps the ordering which element is added
Map<Integer, String> y = new LinkedHashMap<>();

// Declaring a TreeMap
// TreeMap keeps the ascending alphabetical ordering of the keys in the map
Map<Integer, String> z = new TreeMap<>();
```

## Adding an element to the map
```java
// Adding element to the map
// It doesn't allow element with duplicate key
// Adding the element with existing key will change the value
x.put(1, "one");
```

## Add an element if the key doesn't exist in the map
```java
// Put a new pair to the map if the key doesn't exist
// If the key exists in the map, do nothing
x.putIfAbsent(10, "Ten");
```

## Retrieve value with key from the map
```java
// Get value from the map with a key
// If the key doesn't exist, it will return null
x.get(1);
```

## Remove element from the map
```java
// Remove element from the map
x.remove(1);
```


## Additional operations

### Check if the map contains a specific key
```java
// Checking if the map contains specific key
// argument is a key
x.containsKey(1);
```

### Check if the map contains a specifig value
```java
// Checking if the map contains specific value
// argument is a value
x.containsValue("one");
```


### Replacing value if the key exists in the map
```java
// Replacing value if the key exist in the map
// Difference between put() method is that, replace() method doesn't add or update value, if the key does not exist.
x.replace(3, "Three");
```

### Getting keys existing in the map
```java
// Get all the  keys that exists in the map
x.keySet();

// Application
for (Integer i : x.keySet()) {
System.out.println(x.get(i));
}
```

### Gettin values existing in the map
```java
// Get all the values that exists in the map
x.values();
for (String i : x.values()) {
System.out.println(i);
}
```

### Finding keys which have specific value
```java
// Finding keys that has specific value
for (Integer i : x.keySet()) {
if ("Three".equals(x.get(i))) {
    System.out.println(i);
}
}
```

# Entry
- Entry is an interface how Java defines key value pair
- One entry contains a key value pair
- Map.entryset() can be used for iterating over elements in the map, instead of calling Map.keySet() method

```java
// Create a set of Map.Entry from the map
Set<Map.Entry<Integer, String>> s = x.entrySet();

// Iterate over elements in the set
for (Map.Entry<Integer, String> E : x.entrySet()) {
System.out.println(E);
}
```