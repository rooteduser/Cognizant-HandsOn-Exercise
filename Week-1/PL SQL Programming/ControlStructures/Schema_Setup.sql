-- Create Customers Table
CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    DOB DATE,
    Balance NUMBER,
    IsVIP VARCHAR2(5) DEFAULT 'FALSE'
);

-- Create Loans Table
CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    InterestRate NUMBER,
    EndDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

-- Insert Sample Data into Customers
INSERT INTO Customers (CustomerID, Name, DOB, Balance, IsVIP) VALUES (1, 'John Doe', TO_DATE('1950-05-15', 'YYYY-MM-DD'), 12000, 'FALSE');
INSERT INTO Customers (CustomerID, Name, DOB, Balance, IsVIP) VALUES (2, 'Jane Smith', TO_DATE('1985-08-20', 'YYYY-MM-DD'), 8500, 'FALSE');
INSERT INTO Customers (CustomerID, Name, DOB, Balance, IsVIP) VALUES (3, 'Alice Johnson', TO_DATE('1962-02-10', 'YYYY-MM-DD'), 15000, 'FALSE');
INSERT INTO Customers (CustomerID, Name, DOB, Balance, IsVIP) VALUES (4, 'Bob Brown', TO_DATE('1990-11-25', 'YYYY-MM-DD'), 2000, 'FALSE');

-- Insert Sample Data into Loans
INSERT INTO Loans (LoanID, CustomerID, InterestRate, EndDate) VALUES (101, 1, 5.5, TO_DATE('2026-12-31', 'YYYY-MM-DD'));
INSERT INTO Loans (LoanID, CustomerID, InterestRate, EndDate) VALUES (102, 2, 6.0, TO_DATE('2026-07-15', 'YYYY-MM-DD'));
INSERT INTO Loans (LoanID, CustomerID, InterestRate, EndDate) VALUES (103, 3, 4.5, TO_DATE('2027-01-10', 'YYYY-MM-DD'));
INSERT INTO Loans (LoanID, CustomerID, InterestRate, EndDate) VALUES (104, 4, 7.0, TO_DATE('2026-07-05', 'YYYY-MM-DD'));

COMMIT;
