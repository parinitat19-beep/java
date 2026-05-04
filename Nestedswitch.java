public class Nestedswitch {
    public static void main(String[] args) {
        int empId = 1;
        String department = "IT";

        switch(empId) {
            case 1:
                System.out.println("Employee 1");
                switch(department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "HR":
                        System.out.println("HR Department");
                        break;
                    default:
                        System.out.println("Unknown Department");
                }
                break;
            case 2:
                System.out.println("Employee 2");
                break;
            default:
                System.out.println("Unknown Employee");
        }
    }
    
}
