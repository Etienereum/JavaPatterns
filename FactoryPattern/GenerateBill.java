import java.io.*;

class GenerateBill{

    public static void main(String args[]) throws IOException{

        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.print("Enter the name of the plan for which the bilis be generatees: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String planName = br.readLine();
        System.out.print("Enter the number of unit for the bill calculation; ");
        int units = Integer.parseInt(br.readLine());

        Plan p = planFactory.getPlan(planName);

        System.out.print("Bill ammount for " + planName +
        " of " + units + " units is: ");
        p.getRate();
        p.calculateBill(units);

    }
}