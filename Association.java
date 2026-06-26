class Student
{
    private Integer sId;
    private String sName;
    private Branch branch;

    public Student(Integer sId,String sName,Branch branch)
    {
        this.sId = sId;
        this.sName = sName;
        this.branch = branch;
    }

    public Integer getSId()
    {
        return sId;
    }
    
    public String getSName()
    {
        return sName;
    }
    public Branch getBranch()
    {
        return branch;
    }
}
class Branch
{
    private String bId;
    private String bName;

    public Branch(String bId,String bName)
    {
        this.bId = bId;
        this.bName = bName;
    }
}

public class Association 
{
    
}