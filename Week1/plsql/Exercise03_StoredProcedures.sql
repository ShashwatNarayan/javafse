CREATE OR REPLACE PROCEDURE get_employee_details (
    p_emp_id IN  employees.employee_id%TYPE,
    p_name   OUT employees.name%TYPE,
    p_salary OUT employees.salary%TYPE,
    p_dept   OUT employees.department%TYPE
) AS
BEGIN
    SELECT name, salary, department
    INTO   p_name, p_salary, p_dept
    FROM   employees
    WHERE  employee_id = p_emp_id;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('No employee found with ID: ' || p_emp_id);
END get_employee_details;
/

DECLARE
    v_name   VARCHAR2(100);
    v_salary NUMBER;
    v_dept   VARCHAR2(50);
BEGIN
    get_employee_details(1, v_name, v_salary, v_dept);
    DBMS_OUTPUT.PUT_LINE('Name: ' || v_name || ' | Salary: ' || v_salary || ' | Department: ' || v_dept);
END;
/

CREATE OR REPLACE PROCEDURE apply_department_raise (
    p_department IN employees.department%TYPE,
    p_percentage IN NUMBER
) AS
    v_rows_updated NUMBER;
BEGIN
    UPDATE employees
    SET    salary = ROUND(salary * (1 + p_percentage / 100), 2)
    WHERE  department = p_department;

    v_rows_updated := SQL%ROWCOUNT;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Raise applied to ' || v_rows_updated || ' employee(s) in ' || p_department);
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error applying raise: ' || SQLERRM);
END apply_department_raise;
/

BEGIN
    apply_department_raise('Engineering', 15);
END;
/

SELECT name, salary, department FROM employees WHERE department = 'Engineering';

CREATE OR REPLACE FUNCTION calculate_annual_bonus (
    p_salary     IN NUMBER,
    p_percentage IN NUMBER
) RETURN NUMBER AS
BEGIN
    RETURN ROUND(p_salary * (p_percentage / 100), 2);
END calculate_annual_bonus;
/

DECLARE
    v_bonus NUMBER;
BEGIN
    v_bonus := calculate_annual_bonus(75000, 10);
    DBMS_OUTPUT.PUT_LINE('Annual bonus: ' || v_bonus);
END;
/
