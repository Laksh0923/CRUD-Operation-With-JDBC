# 🚀 CRUD Operation with JDBC

A Java-based mini project that demonstrates the implementation of **CRUD (Create, Read, Update, Delete)** operations using **JDBC (Java Database Connectivity)**. This project showcases how Java applications interact with a relational database by establishing a connection, executing SQL queries, and managing data efficiently.

The primary objective of this project is to strengthen the fundamentals of JDBC, database connectivity, and SQL operations in Java.

---

## 📖 About the Project

This project implements the complete CRUD cycle using JDBC. It establishes a connection with a MySQL database using **DriverManager**, executes SQL queries through **PreparedStatement**, and performs database operations such as inserting, retrieving, updating, and deleting records.

Working on this project helped me gain hands-on experience with JDBC concepts, database connectivity, SQL query execution, and resource management in Java.

---

## ✨ Features

- ✅ Establish database connection using `DriverManager`
- ✅ Perform **Create (INSERT)** operation
- ✅ Perform **Read (SELECT)** operation
- ✅ Perform **Update (UPDATE)** operation
- ✅ Perform **Delete (DELETE)** operation
- ✅ Execute SQL queries using `PreparedStatement`
- ✅ Proper exception handling
- ✅ Close database resources after execution

---

## 🛠️ Tech Stack

- **Language:** Java
- **Database:** MySQL
- **Technology:** JDBC (Java Database Connectivity)
- **IDE:** Eclipse IDE / IntelliJ IDEA
- **JDK:** Java 8 or above

---

## ⚙️ JDBC Workflow

The project follows the standard JDBC workflow:

1. Load the JDBC Driver.
2. Establish a database connection using `DriverManager`.
3. Create SQL queries.
4. Execute queries using `PreparedStatement`.
5. Process the returned results.
6. Close the database resources (`Connection`, `PreparedStatement`, and `ResultSet`).

---

## 📌 CRUD Operations Implemented

| Operation | SQL Command | Description |
|-----------|-------------|-------------|
| Create | `INSERT` | Adds new records to the database |
| Read | `SELECT` | Retrieves records from the database |
| Update | `UPDATE` | Updates existing records |
| Delete | `DELETE` | Removes records from the database |

---

## 🎯 Learning Outcomes

Through this project, I strengthened my understanding of:

- Java JDBC Architecture
- Database Connectivity
- DriverManager
- Connection Management
- PreparedStatement
- SQL CRUD Operations
- Exception Handling
- Resource Management
- Writing clean and maintainable Java code

---

## 📚 Future Improvements

- Add a menu-driven console application.
- Implement transaction management.
- Add logging support.
- Use connection pooling.
- Build a GUI using Java Swing or JavaFX.
- Migrate to a Maven project with dependency management.

---

## 👨‍💻 Author

**Laksh Mehra**

If you found this project helpful, feel free to ⭐ the repository and contribute by opening issues or pull requests.

---

## 📄 License

This project is created for learning and educational purposes.
