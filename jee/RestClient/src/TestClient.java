import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

public class TestClient {
	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		/*
		WebTarget target = client.target("http://localhost:8080/EmployeeManagement/webservice/employees/7");
		Invocation invocation = target.request().buildGet();
		Response response = invocation.invoke();
		*/
		Response response = client.target("http://localhost:8080/EmployeeManagement/webservice/employees/7")
				.request().buildGet().invoke();
		
		Employee employee = response.readEntity(Employee.class);
		System.out.println(employee.toString());
		response.close();
		
		Employee james = new Employee();
		james.setFirstName("James");
		james.setSurname("Green1");
		james.setJobRolel("Author");
		james.setSalary(10000);
		Entity jamesEntity = Entity.entity(james, "application/XML");
		response = client.target("http://localhost:8080/EmployeeManagement/webservice/employees")
				.request().buildPost(jamesEntity).invoke();
		System.out.println(response.readEntity(Employee.class).getId());
		response.close();
		
		
		response = client.target("http://localhost:8080/EmployeeManagement/webservice/employees")
				.request().buildGet().invoke();
		List<Employee> employees = response.readEntity(new GenericType<List<Employee>>(){});
		for (Employee e : employees) {
			System.out.println(e);
		}
	}
}
