import java.util.*;
import java.lang.Math;

public class CedarPointCalc

{

	public static void main(String[] args)

	{

		Scanner userinput = new Scanner(System.in);

		//declare all variables needed for calculations
		final double FOOD_ALLOWANCE = 25.00;
		final double CHARTER_BUS_COST = 1738.72;
		final double SCHOOL_BUS_COST = 1300.42;
		final double FALL_COST = 42.00;
		final double SPRING_COST = 39.00;
		int TypeBus, NumStudents, NumChaperones, NumPeople, Season, Bus;
		double CostFood, CostTransportation, CostAdmission, TotalCost, BusCost, TransportationCost;
		TransportationCost = 0;
		NumPeople = 0;
		CostAdmission = 0;

		//prompt user for number of students attending
		System.out.println("How many students are going on the trip? ");
		NumStudents = userinput.nextInt();
		//calculate number of chaperones rounded down using integer division
		NumChaperones = (NumStudents/4);

		//prompt user for which type of bus they are taking
		System.out.println("Which type of bus are you taking (Type 1 for School Bus or 2 for Charter Bus)? ");
		Bus = userinput.nextInt();

		//use if statement to specify what type of bus and the subsequent cost
		NumPeople = NumStudents + NumChaperones;
		if (Bus == 1) {
			BusCost = SCHOOL_BUS_COST;
			TransportationCost = Math.ceil(NumPeople/44.0) * BusCost;
		}

		if (Bus == 2) {
			BusCost = CHARTER_BUS_COST;
			TransportationCost = Math.ceil(NumPeople/55.0) * BusCost;

		}

		//prompt user for what time of year they're going and the subsequent ticket cost
		System.out.println("What time of year are you going on the trip (Type 1 for Spring or 2 for Fall)? ");
		Season = userinput.nextInt();

		if (Season == 1) {
			CostAdmission = SPRING_COST * NumPeople;
		}

		if (Season == 2) {
			CostAdmission = FALL_COST * NumPeople;
		}

		//calculate the cost of food for everyone
		CostFood = (NumPeople * FOOD_ALLOWANCE);

		//calculate the total cost of the trip
		TotalCost = (CostFood + CostAdmission + TransportationCost);

		//display all of the totals
		System.out.printf("\nThere will be this many chaperones: %15d ", NumChaperones);
		System.out.printf("\nThis will be the cost of admission: %15.2f ", CostAdmission);
		System.out.printf("\nThis will be the cost of transportation: %10.2f ", TransportationCost);
		System.out.printf("\nThis will be the cost of food: %20.2f ", CostFood);
		System.out.printf("\nThis will be the total cost of the trip: %10.2f ", TotalCost);




	}
}
