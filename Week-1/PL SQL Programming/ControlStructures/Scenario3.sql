/*
Scenario 3: The bank wants to send reminders to customers whose loans are due within the next 30 days.
Question: Write a PL/SQL block that fetches all loans due in the next 30 days and prints a reminder message for each customer.
*/

DECLARE
    -- Cursor to fetch loans due within the next 30 days and join with Customers to get the name
    CURSOR due_loans_cur IS
        SELECT c.CustomerID, c.Name, l.LoanID, l.EndDate
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
    -- Enable DBMS_OUTPUT to print messages
    -- DBMS_OUTPUT.ENABLE;
    
    FOR loan_rec IN due_loans_cur LOOP
        -- Print a reminder message for the customer
        DBMS_OUTPUT.PUT_LINE('Reminder: Customer ' || loan_rec.Name || 
                             ' (ID: ' || loan_rec.CustomerID || 
                             '), your loan (ID: ' || loan_rec.LoanID || 
                             ') is due on ' || TO_CHAR(loan_rec.EndDate, 'YYYY-MM-DD') || '.');
    END LOOP;
END;
/
