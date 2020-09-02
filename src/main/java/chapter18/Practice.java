package chapter18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice {

    static List<List<Integer>> subsets(List<Integer> list) {
        if (list.isEmpty()) {
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(Collections.emptyList());
            return ans;
        }
        Integer first = list.get(0);
        List<Integer> rest = list.subList(1, list.size());

        List<List<Integer>> subans = subsets(rest);
        List<List<Integer>> subans2 = insertAll(first, subans);

        return concat(subans, subans2);
    }

    private static List<List<Integer>> concat(List<List<Integer>> subans, List<List<Integer>> subans2) {
        List<List<Integer>> ans = new ArrayList<>(subans);
        ans.addAll(subans2);
        return ans;
    }

    private static List<List<Integer>> insertAll(Integer first, List<List<Integer>> subans) {
        List<List<Integer>> ans = new ArrayList<>();
        for (List<Integer> list : subans) {
            List<Integer> copyList = new ArrayList<>();
            copyList.add(first);
            copyList.addAll(list);
            ans.add(copyList);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(subsets(Arrays.asList(1, 2, 3)));
    }
}
