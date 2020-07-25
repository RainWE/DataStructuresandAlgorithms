package per.leetcode.other;

import java.util.Map;
import java.util.TreeMap;

public class TreemapAndCompareTo {

    public static void main(String[] args) {
        Map<Emp,String> treeMap = new TreeMap<>();
        treeMap.put(new Emp(100,"张三",50000),"张三");
        treeMap.put(new Emp(200,"李四",20000),"张三");
        treeMap.put(new Emp(300,"王五",30000),"张三");

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
        if (this.salary > o.salary) {//返回1表示要调整位置顺序 如[200,100]   100<200 需要调整位置 [100,200]
            return 1;
        } else if (this.salary < o.salary) {//返回-1表示不想调整位置顺序，如: [100,200]   100<200 所以不需要调整位置
            return -1;
        } else {
            return 0;
        }
    }
}
