-- Exercise 3: Stored Procedures
-- Procedure to calculate and update monthly interest for savings accounts

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
    v_interest_rate NUMBER := 0.01; -- 1% interest rate
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * v_interest_rate)
    WHERE AccountType = 'Savings';
    
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Monthly interest processed successfully for Savings accounts.');
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error processing monthly interest: ' || SQLERRM);
END ProcessMonthlyInterest;
/
