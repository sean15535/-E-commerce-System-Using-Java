# Simple E-Commerce System (Java)

A minimal, console-based online store that illustrates proper Java package structure, encapsulation, and import usage.

---

## ✨ Features
- Browse a fixed catalog of products  
- Add / remove items to a personal shopping cart  
- Checkout and place an order  
- View order summary with status tracking  

---

## 📂 Project Layout
project-root/
│
├─ com/ecommerce/
│ ├─ Product.java // immutable product value object
│ └─ Customer.java // owns the shopping cart
│
├─ com/ecommerce/orders/
│ └─ Order.java // order entity & summary generation
│
└─ Main.java // demo driver (default package)


---

## ⚙️ Build & Run

- Compile everything
javac -d . Main.java com/ecommerce/*.java com/ecommerce/orders/*.java

- Start the demo
java Main

## 🖥️ Usage

- Launch the program

- Enter your name
-# Type the product number to add it to your cart

- Press 0 to checkout (creates an Order) or -1 to exit

## 📝 Design Notes

- All domain classes reside in com.ecommerce or the sub-package com.ecommerce.orders

- Main imports only the public types it needs

- Access modifiers enforce encapsulation (no package-private setters)

- Order is created only when the cart is non-empty; status can be updated later

## 📌 Requirements

- Java 11 or higher (uses var and List.of)

## 👤 Author
**Alli Oluwaseun**  
[LinkedIn](https://www.linkedin.com/in/oluwaseun-alli-aa4a812ba/) | [GitHub](https://github.com/sean15535)
