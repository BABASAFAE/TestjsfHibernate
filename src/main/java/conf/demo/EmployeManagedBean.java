package conf.demo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.faces.bean.ManagedBean;



import conf.entities.Employe;
import conf.models.EmployeModel;

@ManagedBean(name="formbean")
public class EmployeManagedBean  {
	//implements Serializable
	//private static final long serialVersionUID = 1L;
	 static EmployeModel employeModel = new EmployeModel();

	private List<Employe> employees;
	public  List<Employe> getEmployees() {
		System.out.println("getEmploye called" +employees.toString().hashCode());
		for(Employe e: employees) {
			if(e.getId()==4) {
			System.out.println("employeees list  produit       employeeees NAME  " +e.getFirstName());
			}
		}
		return employees;
	}

	public void setEmployees(List<Employe> employees) {
		this.employees = employees;
	}
	
	
	
	public EmployeManagedBean() {
		System.out.println("semploye formmanagedbean");
		
		
		this.employees = employeModel.findAllEmp();
	
		//employeModel.saveEmploye(emps);
	}
	
	
	
	
	
}
