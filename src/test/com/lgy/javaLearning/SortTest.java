package test.com.lgy.javaLearning;

import com.lgy.javaLearning.Sort;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Sort Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 10, 2017</pre> 
* @version 1.0 
*/ 
public class SortTest { 

@Before
public void before() throws Exception {
    System.out.println("Start JunitTest...");
} 

@After
public void after() throws Exception {
    System.out.println("End JunitTest...");
} 

/** 
* 
* Method: ProduceNum() 
* 
*/ 
@Test
//У�������������
public void testProduceNum1() throws Exception {
//TODO: Test goes here...
    Sort s = new Sort();
    int[] a = s.ProduceNum();
    int n = s.num;
    for(int i=1;i<n;i++){
        int j = a[i];
        int j1 = a[i-1];
        if(j-j1>0){
            System.out.println("�����������...");
        }

    }
} 

@Test
//�����������Ƿ�����ȫ������
public void testProduceNum2() throws Exception {
//TODO: Test goes here...
    Sort s = new Sort();
    int[] a = s.ProduceNum();
    int n = s.num;
    for(int i=2;i<n;i++){
        int j = a[i];
        int j2 = a[i-2];
        int j1 = a[i-1];
        int x = j1 - j2;
        int x1 = j - j1;
        if(x != x1){
            System.out.println("���鲻����ȫ������...");
        }

    }
}
    /**
* 
* Method: main(String[] args) 
* 
*/ 
@Test
public void testMain() throws Exception { 
//TODO: Test goes here... 
} 


} 
