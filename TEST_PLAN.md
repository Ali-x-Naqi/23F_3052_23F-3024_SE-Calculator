# JUnit Test Plan for Calculator.java

This document outlines the test strategy for each method in the Calculator class.

---

### **Part 1: Wijdan Hyder - Testing `add()` and `subtract()`**

#### **Method: `add(int a, int b)`**

* **ECP:** Positive + Positive, Negative + Negative, Mixed Signs, Zero.
* **BVA:** Zero Boundary, Integer Max/Min Overflow.

#### **Method: `subtract(int a, int b)`**

* **ECP:** Positive - Positive, Negative - Negative, Mixed Signs, Zero.
* **BVA:** Subtracting Itself, Zero Boundary.
---

### **Part 2: Ali Naqi - Testing `multiply()` and `divide()`**

#### **Method: `multiply(int a, int b)`**

* **ECP:** Positive * Positive, Negative * Negative, Mixed Signs, Multiply by Zero.
* **BVA:** Multiply by One, Multiply by Negative One.

#### **Method: `divide(double a, double b)`**

* **ECP:** Standard Division, Numerator is Zero, Negative Division.
* **BVA:** Division by Zero (Exception), Divide by Itself, Divide by One.