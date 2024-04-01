package Odev5;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class EmployeeTest {
    @Test(dataProvider = "employeeData")
    public void testCalculateSalary(String firstName, String lastName, int workedDays, double expectedSalary) {
        Employee employee = new Employee(firstName, lastName, workedDays);
        double calculatedSalary = employee.calculateSalary();
        Assert.assertEquals(calculatedSalary, expectedSalary);
    }

    @DataProvider(name = "employeeData")
    public Object[][] employeeData() {
        return new Object[][] {
                {"John", "Doe", 20, 2000.0},  // 20 * 100 = 2000
                {"Alice", "Smith", 30, 3500.0},  // (25 * 100) + (5 * 1000) = 3500
                {"Bob", "Johnson", 15, 1500.0}  // 15 * 100 = 1500
        };
    }
}
