import java.io.*;

public class EmployeeTest {
  public static void main(String []args) {
    // 使用构造器创建两个对象
    Employee empOne = new Employee("RUN00B1");
    Employee empTwo = new Employee("RUN00B2");

    // 调用这两个对象的成员方法
    empOne.empAge(26);
    empOne.empDesignation("高级程序猿");
    empOne.empSalary(1000);
    empOne.printEmployee();

    empTwo.empAge(21);
    empTwo.empDesignation("菜鸟程序猿");
    empTwo.empSalary(500);
    empTwo.printEmployee();
  }
}
