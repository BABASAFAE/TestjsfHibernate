package conf.entities;

import java.util.HashSet;
import java.util.Set;

import javax.faces.bean.ManagedBean;
@ManagedBean(name="menubean")
public class MenuItem {
	
	
	private Set<String> menuItems= new HashSet<>();
	
//	


		public Set<String> getMenuItems() {
				
			//menuItems=new HashSet<>();
				
					//menuItems = Collections.unmodifiableSet(menuItems);
			for(String a:menuItems) {
				System.out.println("menuItems:"+ a);
			}
			
				return menuItems;
			}

			public void setMenuItems(Set<String> menuItems) {
				this.menuItems = menuItems;
			}
			
			
			private String	menuItemstring ;
			


	
		public String getMenuItemstring() {
			System.out.println("getMenuItemstring() vide");
			menuItemstring= menuItems.toString();
			//.replaceAll("[-+.^:,]","")
		System.out.println("getMenuItemstring() "+ menuItemstring);
				return menuItemstring;
			}

			public void setMenuItemstring(String menuItemstring) {
				this.menuItemstring = menuItemstring;
			}
		
	
		

}
