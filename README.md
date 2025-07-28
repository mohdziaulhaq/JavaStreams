# JavaStreams 🚀

A collection of examples and notes showcasing the power of the **Java Stream API** — from basic transformations to performance-efficient operations using primitive streams.

---

## 📘 What This Repo Covers

- Understanding the difference between `map()` and `mapToInt()`
- Using `sum()`, `average()`, `min()`, etc. with streams
- Best practices for efficient data processing with Java Streams

---

## 🔄 `map()` vs `mapToInt()`

| Feature          | `map()`                        | `mapToInt()`                   |
|------------------|--------------------------------|--------------------------------|
| Return Type      | `Stream<R>`                    | `IntStream`                    |
| Handles Primitives | ❌ No (uses boxed `Integer`)   | ✅ Yes (`int`)                 |
| Supports `.sum()` | ❌ No (need Collectors or reduce) | ✅ Yes (direct `.sum()`)     |
| Performance      | Slower (autoboxing)            | Faster (primitive ops)         |

### 🔹 `map()` Example

```java
List<String> names = List.of("Alice", "Bob");

List<Integer> lengths = names.stream()
    .map(name -> name.length())  // Stream<Integer>
    .collect(Collectors.toList());
