package partTwo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.WorkerLevel;


public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		System.out.print("Entre com o nome do Departamento: ");
		String departmentName = sc.nextLine();

		System.out.println("Enter worker data: ");
		System.out.println("Name: ");
		String workerName = sc.nextLine();

		System.out.println("Type the level: ");
		String workerLevel = sc.nextLine();

		System.out.println("Type the salary: ");
		Double workerSalary = sc.nextDouble();

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerSalary, new Department(departmentName));

		System.out.println("Contracts quantity? ");
		int n = sc.nextInt();
		
		for (int i=1; i <=n; i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("Value per Hour: ");
			double valuePerHour = sc.nextDouble();
			
			System.out.println("Durations (hour): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
		}
		
		System.out.println("Enter Month and Year to calculate income: ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + worker.income(year, month));
		
		
		
		sc.close();
	}

}
