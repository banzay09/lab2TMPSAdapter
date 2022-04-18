public class Main {

    public static void main(String[] args) {

        Ceo c = new Ceo();

        System.out.println(c.getFullTitleAndName());

        ExecutiveEmployee e = new EmployeeAdapter(new Engineer());

        System.out.println(e.getFullTitleAndName());

    }

}