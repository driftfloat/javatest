package java8.file;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Java8 新API读取文件内容
 *
 * Created by wangyingjie1 on 2017/2/22.
 * 
 https://blog.csdn.net/dalinsi/article/details/56515226
 Java8 新API读取文件内容
 */
public class ReadFile {

    public static void main(String[] args) {

        try {

            String fileName = "t:/user.csv";

            //读取文件
            Stream<String> stringStream = Files
                    .lines(Paths.get(fileName), Charset.defaultCharset())
                    .flatMap(line -> Arrays.stream(line.split("\n")));

            List<String> words = stringStream.collect(Collectors.toList());
//            System.out.println("words===>" + words);
            for(String s:words) {
            	System.out.println(s);
            }


//            List<String> lineLists = Files
//                    .lines(Paths.get(fileName), Charset.defaultCharset())
//                    .flatMap(line -> Arrays.stream(line.split("\n")))
//                    .collect(Collectors.toList());
//
//            //输出文件函数
//            System.out.println("lineLists====" + lineLists.size());

            //输出每一行文件内容
//            lineLists.stream().forEach(System.out::println);

            //统计单词的个数
//            long uniqueWords = Files.lines(Paths.get(fileName), Charset.defaultCharset())
//                    .flatMap(line -> Arrays.stream(line.split(" ")))
//                    .distinct()
//                    .count();
//
//            System.out.println("There are " + uniqueWords + " unique words in data.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
