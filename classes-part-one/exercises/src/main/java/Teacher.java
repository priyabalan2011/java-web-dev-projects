public class Teacher {
   private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;
    public Teacher(String firstName,String lastName,String subject,int yearsTeaching)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.subject=subject;
        this.yearsTeaching=yearsTeaching;
    }
    public void setfirstName(String firstName)
    {
        this.firstName=firstName;
    }
    public String getFirstName()
    {
        return this.firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public void setSubject(String subject)
    {
        this.subject=subject;
    }
    public String getSubject()
    {
        return this.subject;
    }
    public void setYearsTeaching(int yearsTeaching)
    {
        this.yearsTeaching=yearsTeaching;
    }
    public int getYearsTeaching()
    {
        return this.yearsTeaching;
    }

}
