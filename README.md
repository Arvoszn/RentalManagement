# Vehicle Rental Management System (Java)

Console system for a fictional rental shop ("Dina and Gat Rent A Ride Service"):
one abstract `Vehicle` base class, three vehicle types, and a polymorphic
`calculateRentalFee()` so each type is charged by its own rules.

## Structure

```
src/main/java/com/mycompany/rentalmanagement/
├── Vehicle.java        abstract base — ID, brand, model, year, rental days
├── Sedan.java          calculateRentalFee() override
├── Van.java            calculateRentalFee() override
├── Motorcycle.java     calculateRentalFee() override
├── RentalManagement.java  entry stub
└── Test.java           demo: one of each type, printed with fees and totals
```

## What it demonstrates

- An abstract superclass holding shared attributes, with a per-type override
  for the one thing that differs (the fee)
- A `Vehicle[]` array filled with mixed types, then printed through one method
- `instanceof` used only for the type-specific heading, not for the fee itself
- A static counter (`Vehicle.getVehicleCount()`) shared by all instances
- A summary block that totals the fees of the whole array

## Build and run

Maven project (no external dependencies):

```bash
mvn -q compile
java -cp target/classes com.mycompany.rentalmanagement.Test
```

`pom.xml` sets `maven.compiler.release` to 26 — lower it if your JDK is older.

---

Coursework by **Argelo Nuñez** · [argelo.spawntel.com](https://argelo.spawntel.com) · © 2026, shared for reference — all rights reserved.
