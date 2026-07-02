/*
Scenario 2: A customer can be promoted to VIP status based on their balance.
Question: Write a PL/SQL block that iterates through all customers and sets a flag IsVIP to TRUE for those with a balance over $10,000.
*/

DECLARE
    -- No additional variables needed for this simple cursor loop
BEGIN
    FOR customer_rec IN (SELECT CustomerID, Balance FROM Customers) LOOP
        -- Check if balance is over 10,000
        IF customer_rec.Balance > 10000 THEN
            -- Update the IsVIP flag to TRUE
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = customer_rec.CustomerID;
        END IF;
    END LOOP;
    
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('VIP status updated for customers with balance > $10,000.');
END;
/
