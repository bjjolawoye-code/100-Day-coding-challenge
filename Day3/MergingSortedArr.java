import java.util.ArrayList;
import java.util.List;

class Solution {
    public static <T extends Comparable<T>> void merge(List<T> list1, int m, List<T> list2, int n){
        List<T> listCombined = new ArrayList<T>();
        int i = 0;
        int j = 0;

        //Ilterating through both list from param
        //Adding element from both list in sorted order 
        //First checking to see which number is lower the current element at list 1 or current element at list 2
        //If its list1 then we add it to listCombine and imcrement the pointer to next element on list1
        //Keep in mind the list 2 pointer hasnt changed so now we comparing the new current element in list 1 to the current element in list 2
        while(i < list1.size() && j < list2.size()){
            if(list1.get(i).compareTo(list2.get(j)) <= 0){
                listCombined.add(list1.get(i));
                i++;
            }
            else{
                listCombined.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            listCombined.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            listCombined.add(list2.get(j));
            j++;
        }
     
    }
}

