package sun;

import java.util.*;
import java.util.function.Consumer;

public class Usestream {
    static double allmoney1;
    static double allmoney2;
    public static void main(String[] args) {
        List<Employee> s1 = new ArrayList<>();
        List<Employee> s2 = new ArrayList<>();
        s1.add(new Employee("孙悟空",10000.0,"男",2000.0));
        s1.add(new Employee("猪八戒",20000.0,"男",3000.0));
        s1.add(new Employee("沙僧",10000.0,"男",4000.0));
        s1.add(new Employee("唐僧",10000.0,"男",5000.0));

        s2.add(new Employee("贾宝玉",1000.0,"男",1000.0));
        s2.add(new Employee("林黛玉",1000.0,"男",1000.0));
        s2.add(new Employee("薛宝钗",1000.0,"男",1000.0));
        s2.add(new Employee("王熙凤",1000.0,"男",1000.0));
        s2.add(new Employee("薛潘",1000.0,"男",1000.0));

        System.out.println("统计开发一部的平均工资(去掉最高和最低工资)");
        s1.stream().sorted((o1, o2) ->  Double.compare(o1.getSalary() + o1.getBonus(),o2.getBonus()+o2.getSalary())
        ).skip(1).limit(s1.size() -2).forEach(( employee) -> allmoney1 += (employee.getBonus() + employee.getSalary()));
        System.out.println("开发一部的平均工资是: " +allmoney1/(s1.size() - 2));
    }

}
