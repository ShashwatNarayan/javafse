CREATE TABLE employees (
    employee_id NUMBER PRIMARY KEY,
    name        VARCHAR2(100),
    salary      NUMBER(10, 2),
    department  VARCHAR2(50)
);

INSERT INTO employees VALUES (1, 'Alice Johnson', 75000, 'Engineering');
INSERT INTO employees VALUES (2, 'Bob Smith',     45000, 'Marketing');
INSERT INTO employees VALUES (3, 'Carol Davis',   90000, 'Engineering');
INSERT INTO employees VALUES (4, 'David Lee',     30000, 'Support');
INSERT INTO employees VALUES (5, 'Eve Turner',    60000, 'Sales');
COMMIT;

DECLARE
    v_salary   employees.salary%TYPE;
    v_name     employees.name%TYPE;
    v_bracket  VARCHAR2(20);
BEGIN
    SELECT salary, name
    INTO   v_salary, v_name
    FROM   employees
    WHERE  employee_id = 3;

    IF v_salary >= 80000 THEN
        v_bracket := 'Senior';
    ELSIF v_salary >= 50000 THEN
        v_bracket := 'Mid-Level';
    ELSE
        v_bracket := 'Junior';
    END IF;

    DBMS_OUTPUT.PUT_LINE(v_name || ' is classified as: ' || v_bracket || ' (Salary: ' || v_salary || ')');
END;
/

DECLARE
    v_counter NUMBER := 1;
BEGIN
    LOOP
        DBMS_OUTPUT.PUT_LINE('3 x ' || v_counter || ' = ' || (3 * v_counter));
        v_counter := v_counter + 1;
        EXIT WHEN v_counter > 5;
    END LOOP;
END;
/

DECLARE
    v_amount NUMBER := 10000;
    v_rate   NUMBER := 0.08;
    v_years  NUMBER := 0;
BEGIN
    WHILE v_amount < 20000 LOOP
        v_amount := v_amount * (1 + v_rate);
        v_years  := v_years + 1;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('Investment doubles in ' || v_years || ' years. Final value: ' || ROUND(v_amount, 2));
END;
/

BEGIN
    FOR emp IN (SELECT name, salary FROM employees ORDER BY employee_id) LOOP
        DBMS_OUTPUT.PUT_LINE(emp.name || ' | Salary: ' || emp.salary || ' | Bonus (10%): ' || ROUND(emp.salary * 0.10, 2));
    END LOOP;
END;
/
