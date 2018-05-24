import org.junit.Test;

import java.util.*;

public class FundTest {

    private HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

    public Map<Integer, Integer> createMap() {

        /*put value into the hashmap*/
        for (int i = 1; i <= 100; i++) {
            hashMap.put(i, 101 - i);
        }
        return hashMap;
    }


    @Test
    public void plusEqualTest() {
        int i = 3;
        i += 4;
        /* (int)(i+4); */
        System.out.print("result: i=" + i);
        /* result: i=7 */
    }

    @Test
    public void forEachTest() {

        long startTime;
        long endtime;
        long timeConsume;

        int mapValue;

        //create a map
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < 10000000; i++) {
            map.put(i, i);
        }
        startTime = System.currentTimeMillis();
        for (int e : map.keySet()) {
            mapValue = map.get(e);
        }
        endtime = System.currentTimeMillis();
        timeConsume = endtime - startTime;
        System.out.println("time consumed to get map value:" + timeConsume);


        startTime = System.currentTimeMillis();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            entry.getKey();
            entry.getValue();
        }

        endtime = System.currentTimeMillis();
        timeConsume = endtime - startTime;

    }


    /*
     * 遍历集合中的元素，判断取出的元素是否是 "abc" 这个字符串，如果是删除
     */
    @Test
    public void method3() {
        //创建集合容器对象
        Collection coll = new ArrayList();

        //添加元素
        coll.add("abc");
        coll.add("itcast");
        coll.add("123");
        coll.add("123");

        //获取到迭代器对象
        for (Iterator it = coll.iterator(); it.hasNext(); ) {
            //获取到从集合中遍历出来的某个元素数据，并保存到obj引用中
            Object obj = it.next();
            //判断
            if (obj.equals("abc")) {
                /*
                 * 判断成立，说明取出的这个元素一定是"abc"这个字符串，删除
                 * 不能使用集合自身的增删方法对集合中的元素进行操作
                 * 否则会发生异常,如果需要删除集合中的元素，需要使用迭代器自己的删除方法
                 */
                coll.remove(obj);
                //it.remove();
            }
        }
        System.out.println(coll);
    }


    /*sort a map according to its value*/
    @Test
    public void sortMap() {

        /*define container*/
        int k1 = 0;
        int v1 = 0;
        int k2 = 0;
        int v2 = 0;
        int v3 = 0;

        //craete a map
        createMap();
        System.out.println("size of map:" + hashMap.size());

        /*check map elements*/
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getValue());
        }


        int count = 0;
        int count2 = 0;

        /*sort map*/
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {

            if (count % 2 == 0) {
                System.out.println("double");
                k1 = entry.getKey();
                v1 = entry.getValue();
                count2++;
            } else {
                System.out.println("single");
                k2 = entry.getKey();
                v2 = entry.getValue();
                count2++;
            }

            count++;

            /*start comparing*/
            if (count2 == 2 && v1 > v2) {


                hashMap.put(k1, v2);
                hashMap.put(k2, v1);
                count2 = 0;

                v3 = v1;
                v1 = v2;
                v2 = v3;
            }
        }


        /*print all eles in hashmap*/
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println("hashMap:" + entry.getValue());
        }


    }





}
