import java.util.Collection;
import java.util.HashSet;
/**김재욱*/
public class Lotto {
    public static void lottoStart() {
        Collection<Integer> c1 = new HashSet<>();
//        public static void lottoStart(Collection<Integer> c) {
//        	Collection<Integer> c1 = new HashSet<>();

        // 로또 번호 6개 + 보너스 1개 총 7개 뽑기
        while (c1.size() < 7) {
            int randomNum = (int) (Math.random() * 45) + 1;
            c1.add(randomNum);
        }

       
        System.out.println(c1);
    }
}

