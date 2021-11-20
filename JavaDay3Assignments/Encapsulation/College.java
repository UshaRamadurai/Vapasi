package JavaDay3Assignments.Encapsulation;

public class College {

    private String collegeName;
    private String[] deptName;

    public void setDeptName(String[] deptName){
        this.deptName=deptName;
    }
    public String[] getDeptName(){
        return deptName;
    }
    public void setCollegeName(String collegeName){

        this.collegeName = collegeName;
    }
    public void getCollegeName(){

            System.out.println(collegeName);
    }


}
