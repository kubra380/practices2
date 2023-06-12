package salarycalculation;

public class Main {
//"Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan program
	public static void main(String[] args) {
		
    Employee employee=new Employee("kemal",2000.0,45,1985);
    System.out.println(employee.toString());
	}

}
