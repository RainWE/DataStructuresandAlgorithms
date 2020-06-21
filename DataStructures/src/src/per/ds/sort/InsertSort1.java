package src.per.ds.sort;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InsertSort1 {

    public static void main(String[] args) {
        //int[] arr = {101, 34, 119, 1, -1, 89};
        // ����Ҫ��80000�������������
        int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int) (Math.random() * 8000000); // ����һ��[0, 8000000) ��
        }

        System.out.println("��������ǰ");
        Date data1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(data1);
        System.out.println("����ǰ��ʱ����=" + date1Str);

        insertSort(arr); //���ò��������㷨

        Date data2 = new Date();
        String date2Str = simpleDateFormat.format(data2);
        System.out.println("����ǰ��ʱ����=" + date2Str);

        //System.out.println(Arrays.toString(arr));


    }

    //��������
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insertVal = arr[i];
            int insertIndex = i - 1;
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
				arr[insertIndex + 1] = arr[insertIndex];;
                insertIndex--;
            }
            arr[insertIndex + 1] = insertVal;
            //System.out.println("��"+i+"�ֲ���");
            //System.out.println(Arrays.toString(arr));
        }
    }


}


