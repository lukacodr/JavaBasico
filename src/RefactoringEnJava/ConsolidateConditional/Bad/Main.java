package RefactoringEnJava.ConsolidateConditional.Bad;

public class Main {

    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculateExtraSalary() {
        double result = 0;

        if (education < 1) {
            return 0;
        }
        if (incidents > 10) {
            return 0;
        }
        if (!certification) {
            return 0;
        }

        // Calculate extra salary:Hola gerardo desde clase Main
        // ...
        return result;

    }
}
