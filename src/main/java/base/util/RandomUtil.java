package base.util;


import java.util.Random;
import java.util.Set;
 
/**
 * 生成指定区间的随机数
 *
 * @author Administrator
 */
public interface RandomUtil {
    Random r = new Random();
 
    static void main(String[] args) {
 
        for (; ; ) {
//            System.out.println(getRandomStringInRange(10000000, 99999999));
            System.out.println(getRandomIntInRange(100, 999));
        }
    }
 
    /**
     * @param min
     * @param max
     * @return Random number
     */
 
    static int getRandomIntInRange(int min, int max) {
        return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
    }
 
    /**
     * 生成排除{@code exclude} 在内的随机数
     *
     * @param min
     * @param max
     * @param exclude
     * @return Random number
     */
    static int getRandomIntInRangeWithExclude(int min, int max, Set<Integer> exclude) {
        if (min == max) {
            throw new IllegalArgumentException("min and max can not equal");
        }
        return r.ints(min, (max + 1)).filter((r) -> !exclude.contains(r)).limit(1).findFirst().getAsInt();
    }
 
    /**
     * @param min
     * @param max
     * @return Random number string
     */
    static String getRandomStringInRange(int min, int max) {
        return String.valueOf(r.ints(min, (max + 1)).limit(1).findFirst().getAsInt());
    }
}
//--------------------- 
//作者：kevin_mails 
//来源：CSDN 
//原文：https://blog.csdn.net/kevin_mails/article/details/82315740 
//版权声明：本文为博主原创文章，转载请附上博文链接！
