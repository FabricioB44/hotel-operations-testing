package com.pluralsight;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @Test
    public void punchIn_setsStartTime() {
        Employee employee = new Employee(1234, "John Doe", "Plumbing", 22.50, 0);

        employee.punchIn(14.5);

        assertEquals(14.5, employee.startTime);
    }

    @Test
    public void punchOut_setsEndTime() {
        Employee employee = new Employee(1234, "John Doe", "Plumbing", 22.50, 0);

        employee.punchOut(18.75);

        assertEquals(18.75, employee.endTime);
    }

    @Test
    public void punchTimeCard_calculatesHoursWorked() {
        Employee employee = new Employee(1234, "John Doe", "Plumbing", 22.50, 0);

        employee.punchIn(8.0);
        employee.punchOut(17.0);

        employee.punchTimeCard();

        assertEquals(9.0, employee.getHoursWorked());
    }

}
