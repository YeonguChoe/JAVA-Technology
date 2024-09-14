# How to declare variable
## Syntax
`<type> <variable name> = <value>;`
## Example
```java
int id = 1;
String name = "Yeongu";
List<Integer> numbers = new ArrayList<>();
```

# Kinds of Variables
- There are **two types** of variables in Java:
  - Member variable
  - Local variable
## Type 1: Member variable
- Member variable includes both instance variable and class variable.

### Field
- It is also called `instance variable`.
- Instantiated object of a class has a seperate copy.
- If the object is unreachable or removed, the field is also removed from memory.

#### Field Example
```java
public class myNumber {
    int number = 0;
}
```

### Class variable
- It is a field that is `static`.
- When the program executes, static variable exists during the entire run of program.
- There can be exactly one of the variable in existence.
- `static <type> <variable name> = <value>;`

## Type2: Local variable
- It is a variable that is declared within a **method** or **block**.

### Local Variable Example
```java
// Local variable in method
int function() {
    int localVariable = 0;
    return localVariable;
}
```
```java
// Local variable in an if block
if (true) {
    int localVariable = 0;
}
```

---

# Primitive data type
- I cannot make **generic type object** with **primitive type**.

## Integer
| Data Type | Size    | Range                | Default value |
| --------- | ------- | -------------------- | ------------- |
| `byte`    | 8 bit   | $[-127,127]$         | 0             |
| `short`   | 16 bit  | $[-32768,32767]$     | 0             |
| `int`     | 32 bit  | $[-2^{31},2^{31}-1]$ | 0             |
| `long`    | 64 bit  | $[-2^{63},2^{63}-1]$ | 0L            |

## Floating-point number
| Data Type | Size    | Range                | Default value |
| --------- | ------- | -------------------- | ------------- |
| `float`   | 32 bit  |                      | 0.0f          |
| `double`  | 64 bit  |                      | 0.0           |

## etc.
| Data Type | Size    | Range                | Default value |
| --------- | ------- | -------------------- | ------------- |
| `boolean` | unfixed | true, false          | false         |
| `char`    | 16 bit  |                      | '0'           |

---