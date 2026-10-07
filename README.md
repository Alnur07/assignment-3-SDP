# Gaming PC Configuration System

## Assignment #3 — Bridge Pattern

This project demonstrates the **Bridge structural design pattern** using a Gaming PC Configuration System.

The main idea is to separate **PC configurations** from **cooling systems**, allowing both parts to change independently.

---

## Project Description

The system supports different types of gaming PCs and different cooling systems.

There are two types of PC configurations:

- Budget Gaming PC
- High-End Gaming PC

There are three cooling systems:

- Air Cooling
- Liquid Cooling
- Hybrid Cooling

The Bridge pattern allows any PC configuration to work with any cooling system without changing the PC classes.

For example, a Budget PC can initially use Air Cooling and then switch to Liquid Cooling at runtime.

---

## Bridge Pattern Structure

The project is divided into two independent sides.

### Abstraction

`PCConfiguration` is the main abstract class. It contains a reference to the `CoolingSystem` interface.

### Refined Abstractions

- `BudgetPC`
- `HighEndPC`

These classes extend `PCConfiguration` and represent specific PC configurations.

### Implementor

`CoolingSystem` is the interface that defines the cooling operation.

### Concrete Implementors

- `AirCooling`
- `LiquidCooling`
- `HybridCooling`

Each class provides its own implementation of the `cool()` method.

---

## Project Structure

```text
GamingPCConfiguration/
│
├── src/
│   └── gamingpc/
│       ├── CoolingSystem.java
│       ├── AirCooling.java
│       ├── LiquidCooling.java
│       ├── HybridCooling.java
│       ├── PCConfiguration.java
│       ├── BudgetPC.java
│       ├── HighEndPC.java
│       └── Main.java
│
└── README.md

```

## Class Relationships 

                 PCConfiguration
                  <<Abstraction>>
                         |
              -----------------------
              |                     |
          BudgetPC              HighEndPC
      <<Refined Abstraction>>  <<Refined Abstraction>>
              |                     |
              -----------|-----------
                         |
                  CoolingSystem
                   <<Implementor>>
                         |
             ---------------------------
             |            |            |
        AirCooling   LiquidCooling  HybridCooling
        <<Concrete>>  <<Concrete>>  <<Concrete>>