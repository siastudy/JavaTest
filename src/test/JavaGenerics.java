import org.junit.Test;

import java.util.HashMap;

public class JavaGenerics {

    /*define a class with Generics
    * T: defines the variable datatype for Class: Data.
    * T can be any kind of data.
    *
    * 这个类中可以保存任何类型的数据，
    * 在new它的对象的时候，给它什么泛型，它就可以保存什么类型的数据。
    * */
    class Data<T>{
        private T data;
        public T getData(){
            return data;
        }
        public void setData(T data){
            this.data = data;
        }
    }

    @Test
    public void testGenerics(){
        /*定义泛型为String，存取String类型的数据*/
        //Data<String> data = new Data<String>();
        //data.setData("nihao");
        //System.out.println(data.getData());

        /*定义泛型为HashMap, 存取HashMap类型的数据*/
        Data<HashMap<String, String>> data = new Data<HashMap<String, String>>();
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("aa","bb");
        data.setData(hashMap);
        System.out.println(data.getData());

    }
}
