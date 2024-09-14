# Conditional statement

## if statement

```java
if (x > 0 && y == true) {
    System.out.println("Positive");
} else if (x == 0 || y != false) {
    System.out.println("Zero");
} else {
    System.out.println("Negative");
}
```

### 삼항 연산자
```java
int number = 3;
boolean isPositive = false;
isPositive = (number > 0) ? true : false;
```

### 비교 연산자
```java
==, !=, >, <, >=, <=
```
### 논리 연산자
| Logic  | Java |
| ------ | ---- |
| 그리고 | &&   |
| 또는   | \|\| |
| 아닌   | !    |
## switch문
```java
switch (<변수>) {
    case <변수와 비교하는 값>:
        <코드>
        break;
    default:
        <코드>
        break;
}
```

# Iteration

## for문
```Java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
// Print: 0, 1, 2, 3, 4
```
## for each문
```Java
int[] numbers = { 0, 0, 1, 2, 3 };
for (int i : numbers) { // i's data type should be the same as elements in the list
    System.out.println(numbers[i]);
}
// Print: 0, 0, 0, 1, 2
```

## while문
```java
int cnt = 0;
while (cnt < 5) {
    System.out.println(cnt);
    cnt++;
}
// 0, 1, 2, 3, 4
```
## do while문
```Java
int cnt = 0;
do {
    System.out.println(cnt);
    cnt++;
} while (cnt < 5);
// 0, 1, 2, 3, 4
```

