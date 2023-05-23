package TecnicasRefactorizacion.ConsolidateConditional.Good;

public class Main {

    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculateExtraSalary() {
        double result = 0;

        if (!isElegibleExtraSalary()) {
            return result;
        }


        // Calculate extra salary:
        // ...
        return result;

    }

    public boolean isElegibleExtraSalary() {
        //agrupar consiciones utilizando AND (&&) y OR (||)
        boolean estudios = seniority<1 || education<1;
        boolean antiguedad = incidents > 10 && certification;
        return estudios || antiguedad;


    }
}
