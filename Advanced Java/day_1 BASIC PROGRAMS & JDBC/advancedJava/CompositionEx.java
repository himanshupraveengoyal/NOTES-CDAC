package advancedJava;

class Job {
private String role;
private long salary;
private int id;

public String getRole() {
return role;
}
public void setRole(String role) {
this.role = role;
}
public long getSalary() {
return salary;
}
public void setSalary(long salary) {
this.salary = salary;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}


}






public class CompositionEx {

//composition has-a relationship
private Job job;

public CompositionEx(){
this.job=new Job();
job.setSalary(1000L);
}
public long getSalary() {
return job.getSalary();
}

}