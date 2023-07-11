import java.util.Random;

public class Badge
{
    private static int totalNumberOfEmployees = 0;
    private final String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber()
    {
        totalNumberOfEmployees++;
    }

    public Badge(Employee employeeThatNeedsBadge)
    {
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }

    private String generateBadgeIdCode()
    {
        Random rand = new Random();
        // I assume you want me to use three-digit numbers, and not letters for a random code.
        String randomCode1 = String.valueOf(rand.nextInt(100, 1000));
        String randomCode2 = String.valueOf(rand.nextInt(100, 1000)); // Same as above.
        return String.format("%s%s%s%s",
                randomCode1,
                employee.getName(),
                employee.getSurname(),
                randomCode2
        );
    }

    public void showBadgeDetails()
    {
        System.out.printf("Total Number of Employees: %d.%n", totalNumberOfEmployees);
        System.out.printf("Employee Details: %s.%n", employee.getEmployeeDetails());
        System.out.printf("Badge ID Code: %s.%n", badgeIdCode);
    }
}
