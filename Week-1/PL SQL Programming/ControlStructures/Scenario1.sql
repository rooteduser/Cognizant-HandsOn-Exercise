/*
Scenario 1: The bank wants to apply a discount to loan interest rates for customers above 60 years old.
Question: Write a PL/SQL block that loops through all customers, checks their age, and if they are above 60, apply a 1% discount to their current loan interest rates.
*/

DECLARE
    v_age NUMBER;
BEGIN
    FOR customer_rec IN (SELECT CustomerID, DOB FROM Customers) LOOP
        -- Calculate the age based on DOB
        v_age := TRUNC(MONTHS_BETWEEN(SYSDATE, customer_rec.DOB) / 12);
        
        -- Check if age is above 60
        IF v_age > 60 THEN
            -- Apply a 1% discount to their loan interest rates
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = customer_rec.CustomerID;
        END IF;
    END LOOP;
    
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Interest rates updated for customers above 60.');
END;
/
