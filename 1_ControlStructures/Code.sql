--Exercise 1: Control Structures

--Scenario 1: The bank wants to apply a discount to loan interest rates for customers above 60 years old.

BEGIN
    FOR cust_rec IN (
        SELECT c.CustomerID, c.DOB, l.LoanID, l.InterestRate
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID
    )
    LOOP
        -- Calculating age and display
        DBMS_OUTPUT.PUT_LINE('Checking Customer ID: ' || cust_rec.CustomerID || 
                             ' | Age: ' || TRUNC(MONTHS_BETWEEN(SYSDATE, cust_rec.DOB) / 12));

        -- If age is 60 or more, applying discount
        IF TRUNC(MONTHS_BETWEEN(SYSDATE, cust_rec.DOB) / 12) >= 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = cust_rec.LoanID;

            DBMS_OUTPUT.PUT_LINE('✅ 1% interest discount applied to Loan ID: ' || cust_rec.LoanID);
        END IF;
    END LOOP;

    COMMIT;
END;
/

--Scenario 2: A customer can be promoted to VIP status based on their balance.

BEGIN
    FOR vip_rec IN (
        SELECT CustomerID, Balance FROM Customers
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE('Evaluating Customer ID: ' || vip_rec.CustomerID || 
                             ' | Balance: ' || vip_rec.Balance);

        IF vip_rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'Y'
            WHERE CustomerID = vip_rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE('⭐ Promoted to VIP: Customer ID ' || vip_rec.CustomerID);
        END IF;
    END LOOP;

    COMMIT;
END;
/

--Scenario 3: The bank wants to send reminders to customers whose loans are due within the next 30 days.

BEGIN
    FOR due_loan IN (
        SELECT c.Name, l.LoanID, l.EndDate
        FROM Loans l
        JOIN Customers c ON c.CustomerID = l.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            '📢 Reminder: Loan ID ' || due_loan.LoanID ||
            ' for customer ' || due_loan.Name ||
            ' is due on ' || TO_CHAR(due_loan.EndDate, 'YYYY-MM-DD')
        );
    END LOOP;
END;
/
