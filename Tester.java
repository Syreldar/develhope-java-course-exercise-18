
public class Tester
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("Enrico", "Drago", "Viale dei Tigli, 16");
        Badge badge1 = new Badge(emp1);

        System.out.println("Badge 1 Details:");
        badge1.showBadgeDetails();

        Employee emp2 = new Employee("Rossella", "Ferrau", "Via Noviziato Casazza, 3");
        Badge badge2 = new Badge(emp2);

        System.out.println("\nBadge 2 Details:");
        badge2.showBadgeDetails();
    }
}
