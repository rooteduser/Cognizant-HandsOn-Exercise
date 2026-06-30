-- Make sure server output is on so you can see the DBMS_OUTPUT text messages
SET SERVEROUTPUT ON;


-- SCENARIO 1: Senior Citizen Loan Discount

DECLARE
    CURSOR c_senior_customers IS
        SELECT c.customer_id, c.age, l.loan_id, l.interest_rate
        FROM Customers c
        JOIN Loans l ON c.customer_id = l.customer_id;
    v_cust_rec c_senior_customers%ROWTYPE;
BEGIN
    OPEN c_senior_customers;
    LOOP
        FETCH c_senior_customers INTO v_cust_rec;
        EXIT WHEN c_senior_customers%NOTFOUND;
        
        IF v_cust_rec.age > 60 THEN
            UPDATE Loans
            SET interest_rate = interest_rate - 1
            WHERE loan_id = v_cust_rec.loan_id;
            
            DBMS_OUTPUT.PUT_LINE('Applied 1% discount to Loan ID: ' || v_cust_rec.loan_id);
        END IF;
    END LOOP;
    CLOSE c_senior_customers;
    COMMIT;
END;
/


-- SCENARIO 2: VIP Status Promotion

DECLARE
    CURSOR c_vip_check IS
        SELECT customer_id, balance
        FROM Customers;
    v_cust_rec c_vip_check%ROWTYPE;
BEGIN
    OPEN c_vip_check;
    LOOP
        FETCH c_vip_check INTO v_cust_rec;
        EXIT WHEN c_vip_check%NOTFOUND;
        
        IF v_cust_rec.balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'Y'
            WHERE customer_id = v_cust_rec.customer_id;
            
            DBMS_OUTPUT.PUT_LINE('Customer ID: ' || v_cust_rec.customer_id || ' promoted to VIP.');
        END IF;
    END LOOP;
    CLOSE c_vip_check;
    COMMIT;
END;
/


-- SCENARIO 3: Loan Reminders

DECLARE
    CURSOR c_due_loans IS
        SELECT l.loan_id, l.due_date, c.customer_id, c.customer_name
        FROM Loans l
        JOIN Customers c ON l.customer_id = c.customer_id
        WHERE l.due_date BETWEEN SYSDATE AND (SYSDATE + 30);
    v_loan_rec c_due_loans%ROWTYPE;
BEGIN
    DBMS_OUTPUT.PUT_LINE('=== UPCOMING LOAN DUE REMINDERS ===');
    OPEN c_due_loans;
    LOOP
        FETCH c_due_loans INTO v_loan_rec;
        EXIT WHEN c_due_loans%NOTFOUND;
        
        DBMS_OUTPUT.PUT_LINE('Reminder: Dear ' || v_loan_rec.customer_name || 
                             ', your loan ' || v_loan_rec.loan_id || 
                             ' is due on ' || TO_CHAR(v_loan_rec.due_date, 'YYYY-MM-DD'));
    END LOOP;
    CLOSE c_due_loans;
END;
/