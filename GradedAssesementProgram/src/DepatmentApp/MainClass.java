package DepatmentApp;

public class MainClass extends SuperDepartment {

	public static void main(String[] args) {
		

		AdminDepartment admin = new AdminDepartment();   //Admin Department object
		
		
		System.out.println("Welcome to " + admin.departmentName());        
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println("");
		System.out.println("");
		
		
		HrDepartment hr = new HrDepartment();           //HR Department object
		
		
		
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println("");
		System.out.println("");
		
		
		TechDepartment tech = new TechDepartment();       // Tech Department object
		
		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());    
		System.out.println(tech.doActivity());
		System.out.println(tech.isTodayAHoliday());
		
	}

}
