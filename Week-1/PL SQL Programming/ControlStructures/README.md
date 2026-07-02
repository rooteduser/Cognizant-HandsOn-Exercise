# Exercise 1: Control Structures

## Objective
To implement PL/SQL Control Structures (IF-THEN, FOR loops, cursors) to solve business scenarios involving loan discounts, VIP status assignments, and reminder notifications.

## Concepts Used
- **PL/SQL Blocks:** Anonymous `DECLARE ... BEGIN ... END` blocks.
- **Control Structures:** 
  - `FOR ... IN (SELECT ...)` Cursor FOR loops for iterating over datasets.
  - `IF ... THEN ... END IF` Conditional statements for applying business rules.
- **SQL Functions:** `SYSDATE`, `MONTHS_BETWEEN`, `TRUNC`, `TO_CHAR`.
- **Data Manipulation Language (DML):** `UPDATE` statements within loops.

## Approach
1. **Schema Setup:** Designed a mock DDL to create `Customers` and `Loans` tables along with sample DML inserts to populate the data.
2. **Scenario 1 (Discount over 60):** Wrote a PL/SQL block that loops through all customers. It calculates their age using `DOB` and applies a 1% discount to their loan interest rates in the `Loans` table if their age is greater than 60.
3. **Scenario 2 (VIP Status):** Wrote a PL/SQL block that iterates through all customers and checks if their `Balance` is greater than 10,000. If so, it updates the `IsVIP` column in the `Customers` table to 'TRUE'.
4. **Scenario 3 (Loan Reminders):** Wrote a PL/SQL block with a cursor that fetches loans where the `EndDate` is within the next 30 days (`BETWEEN SYSDATE AND SYSDATE + 30`). It utilizes `DBMS_OUTPUT.PUT_LINE` to print a reminder message for the respective customers.

## Files Included
- `Schema_Setup.sql` - Script to create and populate `Customers` and `Loans` tables.
- `Scenario1.sql` - PL/SQL block for applying interest rate discounts.
- `Scenario2.sql` - PL/SQL block for assigning VIP status.
- `Scenario3.sql` - PL/SQL block for printing loan reminders.

## How to Run
These scripts are intended to be executed in an Oracle Database environment using SQL*Plus, Oracle SQL Developer, or any compatible IDE.
1. Run `Schema_Setup.sql` first to create the necessary tables and populate them with sample data.
2. Ensure `SERVEROUTPUT` is turned on (`SET SERVEROUTPUT ON;` in SQL*Plus) to view the printed messages.
3. Run `Scenario1.sql`, `Scenario2.sql`, and `Scenario3.sql` sequentially to test the PL/SQL blocks.
