package conf.entities;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import conf.models.EmployeModel;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
@Path("/user/{id}")
@ManagedBean(name="formu")
public class Employe implements Serializable  {
	
private static final long serialVersionUID = 1L;

public static EmployeModel dbObj;
public static EmployeModel getDbObj() {
	return dbObj;
}

public static void setDbObj(EmployeModel dbObj) {
	Employe.dbObj = dbObj;
}

		//static EmployeModel employeModel = new EmployeModel();
	//form'sfields
		//id
		private int id;
		public int getId() {
		return id;
		}

	public void setId(int id) {
		this.id = id;
		}
	
		//firstName
		private  String firstName;
		public String getFirstName() {
			return firstName;
			}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
			}
		//lastName
		private String lastName;
		public String getLastName() {
			return lastName;
			}

		public void setLastName(String lastName) {
			this.lastName = lastName;
			}
		//agee
		private double agee;
		public double getAgee() {
			return agee;
			}

		public void setAgee(double agee) {
			this.agee = agee;
			}
		//numtel
		private String numtel;
		public String getNumtel() {
			return numtel;
			}

		public void setNumtel(String numtel) {
			this.numtel = numtel;
			}
		//date
		private Date date;
		
		public Date getDate() {
		
			return date;
			}

		public void setDate(Date date) {
			this.date = date;
			}
	
		//arraylist product
		
	
			private Set<String> menuItems= new HashSet<>();;
			
			
//	


		public Set<String> getMenuItems() {
			
//			 menuItems.add("Sante");  
//			 menuItems.add("Calinia");  
//			 menuItems.add("Auto");  
//			 menuItems.add("MRH");  
//				
//			//menuItems=new HashSet<>();
//				
//					//menuItems = Collections.unmodifiableSet(menuItems);
//			for(String a:menuItems) {
//				System.out.println("menuItems:"+ a);
//			}
//			
				return menuItems;
			}

			public void setMenuItems(Set<String> menuItems) {
				this.menuItems = menuItems;
			}
			
			
//			private String	menuItemstring ;
//			
//
//
//	
//		public String getMenuItemstring() {
//			System.out.println("getMenuItemstring() vide");
//			menuItemstring= menuItems.toString();
//			//.replaceAll("[-+.^:,]","")
//		System.out.println("getMenuItemstring() "+ menuItemstring);
//				return menuItemstring;
//			}
//
//			public void setMenuItemstring(String menuItemstring) {
//				this.menuItemstring = menuItemstring;
//			}
//		
	
		//constructeur 
		public Employe() {
//			menuItems= new HashSet<>();
//			 menuItems.add("Sante");  
//			 menuItems.add("Calinia");  
//			 menuItems.add("Auto");  
//			 menuItems.add("MRH"); 
				
			}
//		public Employe(Set<String> menuItems, String menuItemstring) {
//			super();
//			this.menuItems = new HashSet<>();
//			 menuItems.add("Sante");  
//			this.menuItemstring = menuItemstring;
//		}

		//save method 
		 public void saveStudentRecord() {
	    	 System.out.println("Calling saveStudentRecord() Method To Save Student Record");
		        dbObj = new EmployeModel(); 
		        dbObj.addStudentInDb(this);       
		   }
		 
		 public void submit() {
		        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Correct", "Correct");
		        FacesContext.getCurrentInstance().addMessage(null, msg);
		    }
		
	 	
		 
		 //Formule.java

		 public Auto autoo;	
			private Calinia Calinia;
			private Auto Auto;
			private MRH MRH;
			private Sante Sante;
			private List<SelectItem> countries;
			 public MRH getMRH() {
				return MRH;
			}

			public void setMRH(MRH mRH) {
				MRH = mRH;
			}

			public Sante getSante() {
				return Sante;
			}

			public void setSante(Sante sante) {
				Sante = sante;
			}

			public Calinia getCalinia() {
				return Calinia;
			}

			public void setCalinia(Calinia calinia) {
				Calinia = calinia;
			}
			private ArrayList <MRH> arrayMRH;
			private ArrayList <Sante> arraySante;
			private ArrayList <Auto> arrayAuto;
			
			public ArrayList<MRH> getArrayMRH() {
				arrayMRH= new ArrayList <MRH>();
				for (MRH day : MRH.values()) { 
					// ArrayList<Calinia> arrayList = Collections.list(Calinia);
					 //for( e:Calinia) {
					arrayMRH.add(day);
					   // System.out.println("enum list MRH "+day);
					}
				
				
				
				return arrayMRH;
			}

			public void setArrayMRH(ArrayList<MRH> arrayMRH) {
				this.arrayMRH = arrayMRH;
			}

			public ArrayList<Sante> getArraySante() {
				arraySante= new ArrayList <Sante>();
				for (Sante day : Sante.values()) { 
					// ArrayList<Calinia> arrayList = Collections.list(Calinia);
					 //for( e:Calinia) {
					arraySante.add(day);
					  //  System.out.println("enum list Sante "+day);
					}
				
				
				
				return arraySante;
			}
			

			public void setArraySante(ArrayList<Sante> arraySante) {
				this.arraySante = arraySante;
			}

			public ArrayList<Auto> getArrayAuto() {
				arrayAuto= new ArrayList <Auto>();
				for (Auto day : Auto.values()) { 
					// ArrayList<Calinia> arrayList = Collections.list(Calinia);
					 //for( e:Calinia) {
					arrayAuto.add(day);
					   // System.out.println("enum list"+day); 
					}
				
				
				
				return arrayAuto;
			}

			public void setArrayAuto(ArrayList<Auto> arrayAuto) {
				this.arrayAuto = arrayAuto;
			}
			private ArrayList <Calinia> arrayCalinia;
			
			
			  
			public ArrayList<Calinia> getArrayCalinia() {
				arrayCalinia= new ArrayList <Calinia>();
				for (Calinia day : Calinia.values()) { 
					// ArrayList<Calinia> arrayList = Collections.list(Calinia);
					 //for( e:Calinia) {
						arrayCalinia.add(day);
					    //System.out.println("enum list"+day);
						}
				

				return arrayCalinia;
			}

			public void setArrayCalinia(ArrayList<Calinia> array) {
				this.arrayCalinia = array;
			}


			public Auto getAuto() {
				return Auto;
			}  

			public void setAuto(Auto auto) {
				this.Auto = auto;
			}


			public String getFavFoodCaliniaInString() {
				String[] array = new String[arrayCalinia.size()];
				int index = 0;
				for (Object value : arrayCalinia) {
				  array[index] = (String) value;
				  index++;
				}
			
				return Arrays.toString(array);
			}
			
			public String getFavFoodSanteInString() {
				String[] array = new String[arraySante.size()];
				int index = 0;
				for (Object value : arraySante) {
				  array[index] = (String) value;
				  index++;
				}
			
				return Arrays.toString(array);
			
			}
			
			public String getFavFoodMRHInString() {
				String[] array = new String[arrayMRH.size()];
				int index = 0;
				for (Object value : arrayMRH) {
				  array[index] = (String) value;
				  index++;
				}
			
				return Arrays.toString(array);
			}
			public String getFavFoodAutoInString() {
				String[] array = new String[arrayAuto.size()];
				int index = 0;
				for (Object value : arrayAuto) {
				  array[index] = (String) value;
				  index++;
				}
			
				return Arrays.toString(array);
			}
			

			public Auto getFavFood2Values() {
				
			
				return Auto;
			}
			


//			private ArrayList<String> array =new ArrayList<String>();
//			public ArrayList<String> getArray() {
//				return array;
//			}
//
//			public void setArray(ArrayList<String> array) {
//				this.array = array;
//			}
			
			private Set<String> array= new HashSet<String>();
			public Set<String> getArray() {
				return array;
			}

			public void setArray(Set<String> array) {
				this.array = array;
			}
			
//		private String firstNameFilter	;
//		public String getFirstNameFilter() {
//			return firstNameFilter;
//		}
//
//		public void setFirstNameFilter(String firstNameFilter) {
//			this.firstNameFilter = firstNameFilter;
//		}
		
}
