import java.util.Collection;
import java.util.HashSet;
/**�����*/
public class Lotto {
    public static void lottoStart() {
        Collection<Integer> c1 = new HashSet<>();
//        public static void lottoStart(Collection<Integer> c) {
//        	Collection<Integer> c1 = new HashSet<>();

        // �ζ� ��ȣ 6�� + ���ʽ� 1�� �� 7�� �̱�
        while (c1.size() < 7) {
            int randomNum = (int) (Math.random() * 45) + 1;
            c1.add(randomNum);
        }

       
        System.out.println(c1);
    }
}

