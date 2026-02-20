
# 🛒 Simple E-Commerce System (Java)

![Java](https://img.shields.io/badge/Java-11%2B-orange)
![OOP](https://img.shields.io/badge/Concept-Object--Oriented%20Programming-blue)
![Architecture](https://img.shields.io/badge/Design-Package%20Architecture-success)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![License](https://img.shields.io/badge/License-Educational-lightgrey)

A **console-based e-commerce simulation** built in Java to demonstrate professional software design practices including package structuring, encapsulation, domain modeling, and clean object-oriented architecture.

This project models the essential workflow of an online store — from product browsing to checkout — using structured Java packages and well-defined entities.

---

## 🚀 Project Overview

The Simple E-Commerce System was developed to practice **real-world Java application organization** rather than focusing only on syntax.

The system demonstrates how independent classes collaborate within a layered package structure while maintaining strong encapsulation and separation of concerns.

### Core Workflow

```
Customer → Shopping Cart → Order Creation → Order Summary
```

Users interact through a command-line interface to simulate a simplified online purchasing experience.

---

## ✨ Key Features

✅ Browse predefined product catalog  
✅ Add or remove products from cart  
✅ Checkout process with order creation  
✅ Order summary generation  
✅ Order status tracking  
✅ Clean package-based architecture  

---

## 🧱 System Architecture

```
project-root/
│
├─ com/ecommerce/
│  ├─ Product.java        → Immutable product value object
│  └─ Customer.java       → Cart ownership & user interaction
│
├─ com/ecommerce/orders/
│  └─ Order.java          → Order entity & lifecycle management
│
└─ Main.java              → Application entry point (demo driver)
```

### Design Principles Applied

- **Encapsulation** — internal state protected via access modifiers
- **Separation of Concerns** — domain logic isolated by package
- **Immutability** — product objects cannot be modified after creation
- **Single Responsibility Principle** — each class has a clear role

---

## 🧠 Technical Concepts Demonstrated

| Concept | Implementation |
|--------|---------------|
| Object-Oriented Programming | Domain entities (`Product`, `Customer`, `Order`) |
| Package Organization | `com.ecommerce` modular structure |
| Encapsulation | Controlled access through public APIs |
| Imports & Dependencies | Main imports only required classes |
| Data Integrity | Orders created only when cart is valid |

---

## ⚙️ Installation & Setup

### Requirements
- **Java 11 or higher**

Verify installation:

```bash
java -version
javac -version
```

---

### Compile the Project

```bash
javac -d . Main.java com/ecommerce/*.java com/ecommerce/orders/*.java
```

---

### Run the Application

```bash
java Main
```

---

## 🖥️ Application Usage

1. Start the program in your terminal.
2. Enter your name.
3. Select products using their assigned number.
4. Manage your cart interactively.
5. Choose:
   - `0` → Checkout and place order  
   - `-1` → Exit program

---

## 🧾 Example Interaction

```
Welcome to Simple E-Commerce Store
Enter your name: John

Available Products:
1. Laptop
2. Headphones
3. Mouse

Select product number:
```

---

## 🎯 Learning Outcomes

This project strengthens understanding of:

- Realistic Java project organization
- Object collaboration and domain modeling
- Clean coding practices
- Console application architecture
- Maintainable software structure

---

## 🔮 Future Improvements

- GUI interface (JavaFX or Swing)
- Persistent storage (File or Database)
- User authentication system
- Product inventory management
- REST API backend version

---

## 💼 Portfolio Value

This project demonstrates competencies relevant to junior software engineering roles:

- Java OOP design
- Modular code organization
- Software architecture fundamentals
- Maintainable coding practices

Suitable for:
- Academic submissions
- GitHub portfolios
- Internship applications
- Java developer learning paths

---

## 👤 Author

**Alli Oluwaseun**  
Software Developer | Java Enthusiast  

🔗 LinkedIn: https://www.linkedin.com/in/oluwaseun-alli-aa4a812ba/  
💻 GitHub: https://github.com/sean15535

---

## 📄 License

This project is provided for educational and personal learning purposes.  
You are free to modify and extend it.
