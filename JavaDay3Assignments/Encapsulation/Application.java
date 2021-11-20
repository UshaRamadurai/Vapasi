package JavaDay3Assignments.Encapsulation;

public class Application extends College {

        public void printDetails(String college, String[] dept) {
            College college1 = new College();
            college1.setCollegeName(college);
            college1.setDeptName(dept);
            college1.getCollegeName();
            String[] deptList = college1.getDeptName();
            for (String i : deptList) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("------------------------");
        }
            public static void main(String[] args) {
            Application app = new Application();
                String[] deptNames1 = {"IT", "CS", "MECH", "ECE", "EEE", "AERO", "AUTO", "EI"};
                app.printDetails("Anna University",deptNames1);
                String[] deptNames2 = {"IT", "CS", "MECH", "ECE", "EEE"};
                app.printDetails("IIT MADRAS",deptNames2);
                String[] deptNames3 = {"IT", "CS", "MECH", "AUTO", "EI"};
                app.printDetails("IIT DELHI",deptNames3);
                String[] deptNames4 = {"IT", "CS", "MECH", "ECE", "EEE", "AERO", "AUTO", "EI"};
               app.printDetails("IIT BLR",deptNames4);
                String[] deptNames5 = {"IT", "CS", "MECH", "ECE", "EEE", "AERO"};
                app.printDetails("IIT BOMBAY",deptNames5);
            }
    }
