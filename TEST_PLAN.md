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