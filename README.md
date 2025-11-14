# 🏨 Hotel Room Booking Management System (HRBMS)

A comprehensive Java-based Hotel Room Booking Management System that provides efficient management of hotel bookings, guest information, and room reservations.

![Java](https://img.shields.io/badge/Java-17+-blue.svg)
![OOP](https://img.shields.io/badge/OOP-Design-orange.svg)
![License](https://img.shields.io/badge/License-MIT-green.svg)

## 🌟 Features

### 🎯 Core Functionality
- **📋 Booking Management** - Complete CRUD operations for hotel bookings
- **👤 Guest Management** - Efficient guest information handling
- **🏨 Room Allocation** - Smart room number assignment
- **📅 Stay Duration** - Flexible booking period management
- **🔍 Search System** - Quick booking lookup by ID
- **🏃 Checkout System** - Smooth guest checkout process

### 💡 Advanced Features
- **Booking Status Tracking** - Active vs Checked-out status
- **Input Validation** - Robust error handling
- **Menu-Driven Interface** - User-friendly console navigation
- **Real-time Updates** - Instant booking status reflection

## 🏗️ System Architecture

### Class Structure
```
📁 Hotel Room Booking Management System
├── 🎮 Main.java (Controller)
├── 📦 Booking.java (Model)
└── 🛠️ BookingManager.java (Service)
```

### Design Patterns
- **MVC Architecture** - Separation of concerns
- **OOP Principles** - Encapsulation, Abstraction
- **Repository Pattern** - Data access abstraction

## 🚀 Quick Start

### Prerequisites
- Java JDK 8 or higher
- Git (for version control)

### Installation & Run

#### Method 1: Traditional Compilation
```bash
# Clone the repository
git clone https://github.com/reezmahanan/HRBMS.git
cd HRBMS

# Compile all Java files
javac *.java

# Run the application
java Main
```

#### Method 2: Using Build Script (Windows)
Create `build_run.bat`:
```batch
@echo off
echo Compiling Java files...
javac *.java
if %errorlevel% equ 0 (
    echo Compilation successful! Starting application...
    java Main
) else (
    echo Compilation failed! Please check your Java installation.
    pause
)
```

#### Method 3: IDE Execution
1. Open in **IntelliJ IDEA** / **Eclipse** / **VS Code**
2. Import as Java project
3. Run `Main.java` as Java Application

## 📋 Usage Guide

### Main Menu Options
```
===== Hotel Booking Management System =====
1. Add Booking
2. View All Bookings
3. Remove Booking
4. Search Booking
5. Checkout Booking
6. Exit
```

### Sample Workflow
1. **Add Booking** → Create new guest reservation
2. **View Bookings** → See all current bookings
3. **Search Booking** → Find specific booking by ID
4. **Checkout** → Mark booking as completed
5. **Remove Booking** → Delete booking records

## 💻 Code Implementation

### Booking.java (Model)
```java
public class Booking {
    private int bookingID;
    private String guestName;
    private int roomNumber;
    private int days;
    private boolean isActive;
    
    // Constructors, Getters, Setters
    // checkout() method
    // displayBooking() method
}
```

### BookingManager.java (Service)
```java
public class BookingManager {
    private List<Booking> bookings;
    
    // Methods: addBooking, removeBooking, checkoutBooking
    // displayAllBookings, findBooking
}
```

### Main.java (Controller)
```java
public class Main {
    // Switch-case menu system
    // User input handling
    // Business logic coordination
}
```

## 🎯 Sample Output
```
===== Hotel Booking Management System =====
1. Add Booking
2. View All Bookings
3. Remove Booking
4. Search Booking
5. Checkout Booking
6. Exit
Choose an option: 2

Booking ID: 101
Guest Name: John Doe
Room Number: 201
Days: 3
Status: ACTIVE
-----
Booking ID: 102
Guest Name: Jane Smith
Room Number: 305
Days: 2
Status: ACTIVE
-----
```

## 🛠️ Development

### Building from Source
```bash
# Compile all files
javac *.java

# Run application
java Main
```

### Project Structure
```
HRBMS/
├── Main.java
├── Booking.java
├── BookingManager.java
├── README.md
└── build_run.bat
```

## 🤝 Contributing

We welcome contributions! Please follow these steps:

1. **Fork the repository**
2. **Create a feature branch**
   ```bash
   git checkout -b feature/AmazingFeature
   ```
3. **Commit your changes**
   ```bash
   git commit -m 'Add some AmazingFeature'
   ```
4. **Push to the branch**
   ```bash
   git push origin feature/AmazingFeature
   ```
5. **Open a Pull Request**

## 🐛 Troubleshooting

### Common Issues & Solutions

#### 🔴 Compilation Errors
```bash
# If 'javac' not found
sudo apt install default-jdk  # Ubuntu
brew install openjdk          # macOS
```

#### 🔴 Class Not Found
```bash
# Make sure all files are in same directory
ls -la *.java
javac *.java
java Main
```

#### 🔴 Input Issues
- Use Command Prompt on Windows for better input compatibility
- Ensure proper scanner input handling

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Reez Mahanan**
- GitHub: [@reezmahanan](https://github.com/reezmahanan)
- Project: [HRBMS Repository](https://github.com/reezmahanan/HRBMS)

## 🔮 Future Enhancements

- [ ] Database integration for data persistence
- [ ] GUI interface using JavaFX
- [ ] Payment system integration
- [ ] Room availability checking
- [ ] Booking confirmation emails
- [ ] Admin dashboard
- [ ] Reporting and analytics

---

**⭐ If you find this project helpful, please give it a star!**

## 📞 Support

For support, email or create an issue in the repository.
