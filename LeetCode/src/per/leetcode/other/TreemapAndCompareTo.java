package per.leetcode.other;

import java.util.Map;
import java.util.TreeMap;

public class TreemapAndCompareTo {

    public static void main(String[] args) {
        Map<Emp,String> treeMap = new TreeMap<>();
        treeMap.put(new Emp(100,"����",50000),"����");
        treeMap.put(new Emp(200,"����",20000),"����");
        treeMap.put(new Emp(300,"����",30000),"����");

        for (Emp emp:treeMap.keySet()){
            System.out.println(emp.toString());
        }
    }
}

class Emp implements Comparable<Emp> {
    int id;
    String name;
    int salary;

    public Emp(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                       "id=" + id +
                       ", name='" + name + '\'' +
                       ", salary=" + salary +
                       '}';
    }

    @Override
    public int compareTo(Emp o) {
        if (this.salary > o.salary) {//����1��ʾҪ����λ��˳�� ��[200,100]   100<200 ��Ҫ����λ�� [100,200]
            return 1;
        } else if (this.salary < o.salary) {//����-1��ʾ�������λ��˳����: [100,200]   100<200 ���Բ���Ҫ����λ��
            return -1;
        } else {
            return 0;
        }
    }
}
