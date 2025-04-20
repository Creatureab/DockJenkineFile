class Employee1{
    int emp_id;
    String name;
    String dept;
    String Salary;
    public int getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getSalary() {
        return Salary;
    }
    public void setSalary(String salary) {
        Salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [emp_id=" + emp_id + ", name=" + name + ", dept=" + dept + ", Salary=" + Salary
                + ", toString()=" + super.toString() + "]";
    }
}
class Employee {
    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        emp.setEmp_id(1);
        emp.setName("Animesh");
        emp.setDept("Computer Science");
        emp.setSalary("50000");
        System.out.println("Employee detail"+emp);


    }

}