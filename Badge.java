import java.util.Random;

public class Badge
{
    private static final int CODE_LENGTH = 3;

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
        String randomCode1 = generateRandomCode();
        String randomCode2 = generateRandomCode();

        return String.format("%s%s%s%s",
                randomCode1,
                employee.getName(),
                employee.getSurname(),
                randomCode2
        );
    }

    private String generateRandomCode()
    {
        int MIN_NUMBER = 100;
        int MAX_NUMBER = 999;
        Random rand = new Random();

        int randomNumber = rand.nextInt(MIN_NUMBER, MAX_NUMBER+1);
        return String.valueOf(randomNumber);
    }

    public void showBadgeDetails()
    {
        System.out.printf("Total Number of Employees: %d.%n", totalNumberOfEmployees);
        System.out.printf("Employee Details: %s.%n", employee.getEmployeeDetails());
        System.out.printf("Badge ID Code: %s.%n", badgeIdCode);
    }
}
