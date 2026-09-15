package com.cxk06602.bugcrusher.talk;

import java.util.*;

public class Y2026M9D19 {
    static void main() {
        A a = new A();
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(a);
        LinkedList<A> linkedList = new LinkedList();
        linkedList.add(new A());
        Integer i1 = 1;
        Integer i2 = 1;
        System.out.println(i1 == i2);
        i1 = 128;
        i2 = 128;
        System.out.println(i1 == i2);

        HashSet set = new HashSet();
        Person p1 = new Person(1001,"AA");
        Person p2 = new Person(1002,"BB");
        set.add(p1);
        set.add(p2);
        p1.name ="CC";
        set.remove(p1);
        System.out.println(set);
        set.add(new Person(1001, "CC"));
        System.out.println(set);
        set.add(new Person(1001, "AA"));
        System.out.println(set);

        TreeMap<Object, Object> objectObjectTreeMap = new TreeMap<>();
        objectObjectTreeMap.put(a,a);

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(new A(), 1);
    }
}
class A{}
class Person{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}