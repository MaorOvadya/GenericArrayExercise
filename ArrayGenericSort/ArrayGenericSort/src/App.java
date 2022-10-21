import java.util.*;

import javax.management.ValueExp;

public class App {
public static void main(String[] args) throws Exception {
    Integer arr_i[] = {2,8,20,3,4};
    Double arr_d[] = {2.7,3.8,5.5,6.7,9.7};
    array_max(arr_d);
    array_max(arr_i);

    }

        public static <T extends Comparable<T>> T array_max(T [] arrayList)  {
            T max = arrayList[0];

            for(T value : arrayList){
            if(value.compareTo(max) > 0){
                 max = value;
            }
        }
        System.out.println(max);   
            return max;
        }
}

