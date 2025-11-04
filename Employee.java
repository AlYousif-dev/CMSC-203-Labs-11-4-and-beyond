public class Employee {
    private String name; 
    private String employeeNumber;
    private String hireDate;

    /**
     * 
     * Constructs a new employee with default values.
     */
    public Employee() { // default constructor to set strings to be empty
        this.name = "";
        this.employeeNumber = "";
        this.hireDate = "";
    }

    /**
     * 
     * @param n the employee's name
     * @param num the employee's number
     * @param date the hire date of the employee
     */
    public Employee(String n, String num, String date){
        this.name = n;
        this.employeeNumber = num;
        this.hireDate = date;
    }

    /**
     * 
     * @param n sets the employees name
     */
    public void setName(String n){
        this.name = n;
    }

    /** 
     * 
     * @param hireDate sets the employees hiredate
    */
    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * 
     * @param employeeNumber sets the employeesNumber
     */
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    /**
     * 
     * @return the employee's name
     */
    public String getName(){
        return this.name;
    }

    /**
     * 
     * @return the employee's 
     */
    public String getEmployeeNumber(){
        return this.employeeNumber;
    }

    /**
     * 
     * @return the employee's hire date
     */
    public String getHireDate(){
        return this.hireDate;
    }

    //Helper method to validate employee number.
    private boolean isValidEmpNum(String e) {
        return e != null && !e.isEmpty();
    }

    @Override
    /**
     * @return the name, employee number, and hire date of the employee in a formatted string.
     */
    public String toString(){
        return String.format("\n Name: %s.\n Employee number: %s.\n Employee hire date %s.",this.name, this.employeeNumber, this.hireDate);
    }
}
