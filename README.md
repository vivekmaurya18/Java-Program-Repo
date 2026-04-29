# 📘 Java Static Import (With & Without)

## 🔹 Introduction

In Java, **static import** allows you to use static members (methods/variables) of a class directly without using the class name.

This README demonstrates the difference between:

* ✅ With Static Import
* ✅ Without Static Import

---

## ✅ 1. Without Static Import

### 💻 Code

```java
class Testt {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(4));
        System.out.println(Math.max(10, 50));
        System.out.println(Math.random());
    }
}
```

### 📌 Explanation

* You must use `Math.` before every method
* Code is clear but slightly longer

### ✔️ Output

```
2.0
50
0.XXXX
```

---

## ✅ 2. With Static Import

### 💻 Code

```java
import static java.lang.Math.*;

class Testt {
    public static void main(String[] args) {
        System.out.println(sqrt(4));
        System.out.println(max(10, 20));
        System.out.println(random());
    }
}
```

### 📌 Explanation

* No need to use `Math.` again and again
* Code becomes shorter and cleaner

### ✔️ Output

```
2.0
20
0.XXXX
```

---

## ⚖️ Difference Between Both

| Feature     | Without Static Import | With Static Import |
| ----------- | --------------------- | ------------------ |
| Syntax      | Math.sqrt()           | sqrt()             |
| Code Length | Longer                | Shorter            |
| Readability | More explicit         | Cleaner            |
| Usage       | Default               | Optional           |


## 🎯 When to Use Static Import

✔ Use when:

* You frequently use static methods (like Math functions)

❌ Avoid when:

* It makes code confusing or less readable

---

## 🚀 Conclusion

Static import is a useful feature in Java that makes code shorter and cleaner. However, it should be used wisely to maintain readability.
