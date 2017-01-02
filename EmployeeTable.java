package com.samples;

import java.util.ArrayList;
import java.util.List;

import com.webfirmframework.wffweb.tag.html.Body;
import com.webfirmframework.wffweb.tag.html.H1;
import com.webfirmframework.wffweb.tag.html.Hr;
import com.webfirmframework.wffweb.tag.html.Html;
import com.webfirmframework.wffweb.tag.html.attribute.global.Style;
import com.webfirmframework.wffweb.tag.html.tables.Table;
import com.webfirmframework.wffweb.tag.html.tables.Td;
import com.webfirmframework.wffweb.tag.html.tables.Tr;
import com.webfirmframework.wffweb.tag.htmlwff.Blank;

public class EmployeeTable{
public static void main(String[] args) {

    class Employee {

        private long id;

        private String name;

        private String address;

        public Employee(long id, String name, String address) {
            this.id = id;
            this.name = name;
            this.address = address;
        }
        //getters and setters

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String Address) {
			this.address = address;
		}
        
    }

    Employee e1 = new Employee(101, "Ravi", "Hyderabad");
    Employee e2 = new Employee(102, "Shankar", "Bangalore");
    Employee e3 = new Employee(103, "Manasa", "Chennai");
    Employee e4 = new Employee(104, "Radhika", "Mysore");
    Employee e5 = new Employee(105, "Madhuri", "Hyderabad");

    final List<Employee> employees = new ArrayList<Employee>();
    employees.add(e1);
    employees.add(e2);
    employees.add(e3);
    employees.add(e4);
    employees.add(e5);

    Html html = new Html(null,new Style("align:center;background:grey;color:lightcyan")) {
        Body body = new Body(this) {
        	H1 h1=new H1(this){
        		Blank h1=new Blank(this,"Employee Data");
        	};
        	Hr hr=new Hr(this);
            Table table = new Table(this,new Style("border:1px solid black")) {

                {
                	Tr tr1 = new Tr(this) {
                        Td td1 = new Td(this) {
                            Blank id1 = new Blank(this,"ID");
                        };
                        Td td2 = new Td(this) {
                            Blank name1= new Blank(this,"NAME");
                                 
                        };
                        Td td3 = new Td(this) {
                            Blank address1 = new Blank(this,"ADDRESS");
                                    
                        };
                    };
                    for (final Employee employee : employees) {
                        Tr tr2 = new Tr(this) {
                            Td td1 = new Td(this) {
                                Blank col1 = new Blank(this,
                                        String.valueOf(employee.getId()));
                            };
                            Td td2 = new Td(this) {
                                Blank col2 = new Blank(this,
                                        employee.getName());
                            };
                            Td td3 = new Td(this) {
                                Blank col3 = new Blank(this,
                                        employee.getAddress());
                            };
                        };
                    }
                }

            };
        };
    };

    html.setPrependDocType(true);
    System.out.println(html.toHtmlString());

}
}