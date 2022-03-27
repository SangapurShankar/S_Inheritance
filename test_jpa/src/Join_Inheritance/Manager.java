package Join_Inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mgr_store2")
@DiscriminatorValue("MSR")

public class Manager extends Employee{

	private static final long serialVersionUID=1L;
	private String dept_name;
	
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
}
