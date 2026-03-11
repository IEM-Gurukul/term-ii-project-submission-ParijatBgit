[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title
Dynamic Rental Managament System
---

## Problem Statement (max 150 words)
Rental businesses manage different types of assets such as vehicles, rooms, or equipment. Each asset category follows different pricing rules, late fee policies, and availability constraints. Managing these variations manually or with a rigid system leads to certain errors, inefficiency, and difficulty in scaling. This system will dynamically calculate rental costs, manage availability, enforce return policies, and handle exceptional scenarios such as late returns or invalid bookings. By applying core Object Oriented principles, this system ensures scalability, and maintainability while maintaining clean separation between business logic and data management.
---

## Target User
Small rental businesses, Vehicle rental services, Equipment rental providers, Property rental managers
---

## Core Features

- Customer registration and management
- Add and manage multiple rentable items
- Dynamic rental cost calculation
- Booking and return processing
- Late fee computation
- Rental availability tracking
- Rental history maintenance
and File-based data persistence
--- 

## OOP Concepts Used

- Abstraction: An abstract class will define common properties such as ID, rental
rate, and availability, along with abstract methods, for ex- calculateRentalCost().
- Inheritance: Specific rental types such as Car, Bike, and Room will extend abstract
class, inheriting common behavior while defining specialized rules.
- Polymorphism: Each subclass will override the method to apply different pricing
logic dynamically at runtime.
- Exception Handling: Custom exceptions for item not available, invalid rentsal date,
exceptions for wrong entry or late return etc. will ensure robust error handling.
- Collections: ArrayList to manage customers and rental items, HashMap for quick
lookup by ID.
---

## Proposed Architecture Description
The system will follow a layered architecture separating model classes, business logic, and user interaction. The Modellayer will contain core entities for example, Customer, "RentableItem", and "RentalTransaction". The Service layer will handle booking logic, cost calculations, and validations. The Data layer will manage file storage for persistence. The design will prioritize encapsulation by keeping fields private and exposing controlled access through methods. Polymorphism will allow dynamic behavior selection at runtime, ensuring scalability and maintainability without modifying existing class structures.
---

## How to Run

---

## Git Discipline Notes
Minimum 10 meaningful commits required.
