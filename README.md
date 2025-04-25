
---

## 🚀 How it Works

Each arithmetic operation is implemented as a **Runnable class**, and its logic is defined inside the `run()` method. The `Main.java` file creates and starts threads for each of these tasks.

---

## 📂 File Descriptions

### `Main.java`
**Purpose**: Entry point of the program.

**Key Logic**:
- Creates instances of all arithmetic tasks.
- Starts each task on a separate thread.
- Uses `.join()` to ensure the main thread waits for all tasks to finish.

---

### `AdditionTask.java`
**Class**: `AdditionTask implements Runnable`

**Functionality**:
- Performs addition of two integers.
- Method: 
  - `run()`: Adds two predefined integers `a` and `b`, and prints the result.

---

### `SubtractionTask.java`
**Class**: `SubtractionTask implements Runnable`

**Functionality**:
- Performs subtraction of two integers.
- Method:
  - `run()`: Subtracts `b` from `a` and prints the result.

---

### `MultiplicationTask.java`
**Class**: `MultiplicationTask implements Runnable`

**Functionality**:
- Performs multiplication of two integers.
- Method:
  - `run()`: Multiplies `a` and `b`, and prints the result.

---

### `DivisionTask.java`
**Class**: `DivisionTask implements Runnable`

**Functionality**:
- Performs division of two integers.
- Method:
  - `run()`: Checks for division by zero and then divides `a` by `b`, printing the result.

---

## 📌 Key Concepts Demonstrated

- **Multithreading** using `Runnable` interface  
- **Encapsulation** and modular design  
- **Concurrent Execution** of independent tasks  
- **Thread synchronization** with `.join()`  

---

## ✅ Requirements

- Java 8 or later  
- Any IDE or terminal with Java support

---


