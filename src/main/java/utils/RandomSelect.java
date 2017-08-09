package utils;

import java.util.*;

/**
 * Created by Administrator on 2017/7/31 0031.
 */
public class RandomSelect {

    public static Set<Integer> hashSelect(int k) {
        Random rd = new Random();
        Set<Integer> hs = new HashSet<Integer>();

        while (hs.size() < k) {
            int x = 1 + rd.nextInt(36);//随机1-36之间的数，包括两边
            hs.add(new Integer(x));
        }
        return hs;
    }

//    public static SortedSet<Integer> treeSelect(int k) {
//        Random rd = new Random();
//        SortedSet<Integer> ts = new TreeSet<Integer>();
//
//        while (ts.size() < k) {
//            int x = 1 + rd.nextInt(36);
//            ts.add(new Integer(x));//当重复时不会添加
//        }
//        return ts;
//    }
//
//    public static void main(String[] args) {
//        Set<Integer> hashset = hashSelect(1);
//        System.out.println("HashSet中所有元素（未排列）");
//        System.out.println("\t" + hashset);
//        SortedSet<Integer> treeset = treeSelect(4);//调用函数，返回数集
//        System.out.println("TreeSet中所有元素（升序）");
//        System.out.println("\t" + treeset);
//    }
}
