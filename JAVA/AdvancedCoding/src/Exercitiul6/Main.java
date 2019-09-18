package Exercitiul6;

import java.util.*;

public class Main {


    public static void main(String[] args) {


        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("Ionut", "Ioan");
        hashMap.put("Marius", "Alex");
        hashMap.put("Andrei", "Andrei");
        hashMap.put("Andrei", "George");


        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


        Employee employee = new Employee("Andrei", "Oprea");
        Employee employee1 = new Employee("Andrei", "Oprea");
        Employee employee2 = new Employee("Ionut", "Iftinca");
        Employee employee3 = new Employee("Andrei", "Oprea");

        Manager manager = new Manager("Marius", "Cristian");
        Manager manager1 = new Manager("Stefan", "Gheorghe");
        Manager manager2 = new Manager("Alexandru", "Mihai");
        Manager manager3 = new Manager("Alin", "Cristian");

        Map<Employee, Manager> mapClass = new HashMap<>();

        mapClass.put(employee, manager);
        mapClass.put(employee1, manager1);
        mapClass.put(employee2, manager2);
        mapClass.put(employee3, manager3);

        for (Map.Entry<Employee, Manager> entry : mapClass.entrySet()) {
            System.out.println("Angajatul cu id ul " + entry.getKey().getId() + " se numeste " + entry.getKey().getNume()
                    + " " + entry.getKey().getPrenume() + " si il are ca manager pe " + entry.getValue().getFirstName() + " " + entry.getValue().getLastName());
        }

        mapClass.get(employee);//aici trebuie sa suprascriu equals si hashcod


        List<Employee> listEmployee = new LinkedList<>();
        listEmployee.add(employee);
        listEmployee.add(employee1);
        listEmployee.add(employee2);

        List<Employee> listEmployee2 = new LinkedList<>();
        listEmployee2.add(employee2);
        listEmployee2.add(employee);


        Map<Manager, List> mapInvert = new HashMap<>();

        mapInvert.put(manager, listEmployee);
        mapInvert.put(manager1, listEmployee2);

//        System.out.println("Angajatii managerului 1");
//        System.out.println(mapInvert.get(manager));
//
//        System.out.println("Angajatii managerului 2 ");
//        System.out.println(mapInvert.get(manager1));


        System.out.println(employee.equals(employee1));

        Company company = new Company();
        company.addEmployee(employee, manager);
        company.addEmployee(employee1, manager1);
        company.addEmployee(employee2, manager2);
        company.addEmployee(employee3, manager3);
        company.removeEmployee(employee);

        //   System.out.println(company.toString());   //aici ea a suprascris to string in company si eu in employee


    }


}
