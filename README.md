# 💬 Task 3 – Multithreaded Chat Application (Java)

Company : Codtech IT Solutions Pvt Limited

Name : Vishrudha.N

Intern ID : CTIS1057

Domain : Java Programming

Duration : 4 Weeks

Mentor : Neela Santhosh

## 📌 Task Overview

This project implements a **Client–Server Chat Application** using **Java Sockets** and **Multithreading**, where multiple clients can communicate with each other in real time through a central server.

---

## 🎯 Objective

- To build a real-time chat system using Java
- To understand **socket programming**
- To implement **multithreading** for handling multiple clients simultaneously
- To demonstrate client–server communication

---

## 🛠️ Technologies Used

- Java (JDK 8+)
- Java Sockets (`ServerSocket`, `Socket`)
- Multithreading (`Runnable`, `Thread`)
- VS Code

---

## 📂 Project Structure

Codtech IT Internship/
│
├── src/
│ ├── chat/
│ │ ├── ChatServer.java
│ │ ├── ChatClient.java
│ │ └── ClientHandler.java
│ │
│ ├── Task1_Filehandling.java
│ ├── Task2_Weather.java
│ └── Weather.java
│
├── bin/
├── lib/
├── README.md
└── sample.txt


---

## ⚙️ How the Application Works

1. **ChatServer**
   - Starts a server on a specific port
   - Listens for incoming client connections
   - Creates a new thread (`ClientHandler`) for each client

2. **ChatClient**
   - Connects to the server using sockets
   - Sends messages to the server
   - Receives broadcast messages from the server

3. **ClientHandler**
   - Runs as a separate thread for each client
   - Reads messages from one client
   - Broadcasts messages to all connected clients

---

## ▶️ How to Run the Application (Step-by-Step)

### 🔹 Step 1: Run the Server (Run Only Once)

1. Open `src/chat/ChatServer.java`
2. Right-click inside the file
3. Click **Run Java**

✅ Output:
Chat Server started...
⚠️ Keep this terminal open.

---

### 🔹 Step 2: Run the Client (Run Multiple Times)

1. Open `src/chat/ChatClient.java`
2. Right-click → **Run Java**
3. A new terminal opens → this is **Client 1**

👉 Repeat the same step again to create **Client 2, Client 3, etc.**

Each run represents a **new user**.

---

## 🧪 Testing the Chat

- Type a message in **Client 1**
- Press **Enter**
- The message appears in **all other clients**

✔ Real-time communication achieved

---

## ❌ Common Errors & Solutions

### Error: `Connection refused`
- Cause: Server not running
- Solution: Run `ChatServer.java` first

### Error: `Address already in use`
- Cause: Server already running on the same port
- Solution: Stop the previous server (Ctrl + C)

---

## 🧠 Key Concepts Demonstrated

- Client–Server Architecture
- Java Socket Programming
- Multithreading
- Real-time Message Broadcasting

---

## 📈 Complexity Analysis

- **Time Complexity:** O(n) per message broadcast (n = number of clients)
- **Space Complexity:** O(n) for maintaining client connections


---

## ✅ Conclusion

This project successfully demonstrates a **multithreaded chat system** using Java, fulfilling the internship task requirements and showcasing core networking and concurrency concepts.

---
