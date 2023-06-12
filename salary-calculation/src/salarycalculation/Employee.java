package salarycalculation;

public class Employee {
private String name;
private double salary;
private double workHours;
private int hireYear;
private int year=2021;



Employee(String name,double salary,double workHours,int hireYear){
	this.name=name;
	this.salary=salary;
	this.workHours=workHours;
	this.hireYear=hireYear;
	
}

public double tax(){
	if(this.salary>=1000) {
		
		return this.salary*0.03;
	}
		return 0;
}

public double  bonus() {
	if(workHours>40){
		
		return (workHours-40)*30;
	}
		return 0;
	
}
public double raiseSalary() {
	if(year-hireYear<10) {
		
		return salary*0.05;	
		
	}else if(9<year-hireYear && year-hireYear<20 ) {
		
		return salary*0.1;
	}else {

		return salary*0.15;
	}
}
public String toString() {
	return "Name:"+this.name+"\nSalary:"+this.salary+"\nWork Hours:"+this.workHours+
			"\nHire Year:"+this.hireYear+"\nTax:"+tax()+"\nBonus:"+bonus()+
			"\nSalary Increase:"+raiseSalary()+"\nSalary including tax and bonus: "+(this.salary+bonus()-tax())+
			"\nTotal Salary:"+ (this.salary + raiseSalary());
			
}


}