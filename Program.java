public class Program {

    public static void main(String[] args) {

        LinkedList<Employee> linkedList = new LinkedList<>();
        linkedList.addFirst(new Employee("FFFF", 34));
        linkedList.addFirst(new Employee("AAAAA", 45));
        linkedList.addFirst(new Employee("CCCCC", 44));
        linkedList.addFirst(new Employee("AAAAA", 22));
        linkedList.addFirst(new Employee("MMMMMM", 18));
        linkedList.addFirst(new Employee("AAAAA", 55));
        
        // Employee employee1 = new Employee("AAA", 33);
        // Employee employee2 = new Employee("AAA", 33);

        // System.out.println(employee1.equals(employee2));

        // Employee res = linkedList.contains(new Employee("User3", 22));
        // System.out.println(res);

        System.out.println();
        System.out.println(linkedList);

        linkedList.invertedList();

        System.out.println();
        System.out.println(linkedList);


    }

}
