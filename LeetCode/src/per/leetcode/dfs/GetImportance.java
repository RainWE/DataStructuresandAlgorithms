package per.leetcode.dfs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**Ա������Ҫ��
 ����һ������Ա����Ϣ�����ݽṹ����������Ա��Ψһ��id����Ҫ��?�� ֱϵ������id��
 ���磬Ա��1��Ա��2���쵼��Ա��2��Ա��3���쵼��������Ӧ����Ҫ��Ϊ15, 10, 5����ôԱ��1�����ݽṹ��[1, 15, [2]]��Ա��2�����ݽṹ��[2, 10, [3]]��Ա��3�����ݽṹ��[3, 5, []]��ע����ȻԱ��3Ҳ��Ա��1��һ���������������ڲ�����ֱϵ���������û��������Ա��1�����ݽṹ�С�
 ��������һ����˾������Ա����Ϣ���Լ�����Ա��id���������Ա������������������Ҫ��֮�͡�
 ʾ�� 1:
 ����: [[1, 5, [2, 3]], [2, 3, []], [3, 3, []]], 1
 ���: 11
 ����:
 Ա��1�������Ҫ����5����������ֱϵ����2��3������2��3����Ҫ�Ⱦ�Ϊ3�����Ա��1������Ҫ���� 5 + 3 + 3 = 11��
 ע��:
 һ��Ա�������һ��ֱϵ�쵼�����ǿ����ж��ֱϵ����
 Ա������������2000��
 */
public class GetImportance {
    Map<Integer, Employee> emap;
    public int getImportance(List<Employee> employees, int queryid) {
        emap=new HashMap<>();
        for (Employee e:employees){
            emap.put(e.id,e);
        }
        return dfs(queryid);
    }
    public int dfs(int eid) {
        Employee employee =emap.get(eid);
        int res = employee.importance;
        for (Integer s:employee.subordinates){
            Employee employee1 = emap.get(s);
            res+=dfs(employee1.id);
        }
        return res;
    }
}
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}