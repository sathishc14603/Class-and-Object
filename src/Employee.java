
public class Employee {
    private static int id_counter=0;
    private  final int id;
    private String Emp_name;
    private String  Emp_email;
    private String Emp_phonenumber;
    private String Emp_Role;
    private String Emp_Address;

    public Employee(String emp_name, String emp_email, String emp_phonenumber, String emp_Role, String emp_Address) {
        this.id=++id_counter;
        this.Emp_name = emp_name;
        this.Emp_email = emp_email;
        this.Emp_phonenumber = emp_phonenumber;
        this.Emp_Role = emp_Role;
        this.Emp_Address = emp_Address;
    }

    public  int getId() {
        return id;
    }
    

    public String getEmp_name() {
        return Emp_name;
    }

    public void setEmp_name(String emp_name) {
        Emp_name = emp_name;
    }

    public String getEmp_email() {
        return Emp_email;
    }

    public void setEmp_email(String emp_email) {
        Emp_email = emp_email;
    }

    public String getEmp_phonenumber() {
        return Emp_phonenumber;
    }

    public void setEmp_phonenumber(String emp_phonenumber) {
        Emp_phonenumber = emp_phonenumber;
    }

    public String getEmp_Role() {
        return Emp_Role;
    }

    public void setEmp_Role(String emp_Role) {
        Emp_Role = emp_Role;
    }

    public String getEmp_Address() {
        return Emp_Address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Emp_name='" + Emp_name + '\'' +
                ", Emp_email='" + Emp_email + '\'' +
                ", Emp_phonenumber='" + Emp_phonenumber + '\'' +
                ", Emp_Role='" + Emp_Role + '\'' +
                ", Emp_Address='" + Emp_Address + '\'' +
                '}';
    }

    public void setEmp_Address(String emp_Address) {
        Emp_Address = emp_Address;
    }
}
