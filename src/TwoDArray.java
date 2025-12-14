//import java.util.Arrays;
//import java.util.Scanner;
//
//public class TwoDArray {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int r = 2;
//        int[][] arr = new int[r][];
//        for (int i = 0;i<r;i++){
//            arr[i] = new int[sc.nextInt()];
//        }
//        for (int i=0;i<r;i++){
//            for (int j = 0;j<arr[i].length;j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for (int a[] : arr){
//            System.out.println(Arrays.toString(a));
//        }
//    }
//}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;

class  TwoDArray{


    public static void anagrams(){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toUpperCase();
        String s2 = sc.next().toUpperCase();
        if (s1.length() != s2.length()){
            System.out.println("NOT ANAGRAMS");
            return;
        }
        int[] arr = new int[26];
        for (int i=0;i<s1.length();i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            arr[c1-65]++;
            arr[c2-65]--;
        }

        for (int i : arr){
            if (i!=0){
                System.out.println("NOT ANAGRAMS");
                break;
            }
        }

        System.out.println((int) 'A'-65);
    }


    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }



    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        if (strs.length==0){
            return list;
        }
        Map<String,List<String>> map = new HashMap<>();
        for (String i : strs){
            String hashed = hashedCode(i);
            map.putIfAbsent(hashed,new ArrayList<>());
            map.get(hashed).add(i);
        }


        list.addAll(map.values());
        return list;
    }
    public static String hashedCode(String s){
        int[] arr = new int[26];
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            arr[ c-'a']++;
        }
        for (int i : arr){
            if (i==0){
                sb.append('#');
            }else {
                sb.append(i);
            }
        }
        return sb.toString();
    }
}
