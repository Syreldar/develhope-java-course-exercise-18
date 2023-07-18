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
        int MIN_NUMBER = 100;
        int MAX_NUMBER = 999;
        Random rand = new Random();

        String randomCode1 = String.valueOf(rand.nextInt(MIN_NUMBER, MAX_NUMBER+1));
        String randomCode2 = String.valueOf(rand.nextInt(MIN_NUMBER, MAX_NUMBER+1)); // Same as above.
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
