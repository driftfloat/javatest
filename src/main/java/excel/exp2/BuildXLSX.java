package excel.exp2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Excel 2013
 * @author Administrator
 *
 */
public class BuildXLSX {
@SuppressWarnings("resource")
public static void main(String[] args) throws IOException {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
    String now = dateFormat.format(new Date());
    //导出文件路径
    String basePath = "t:/";
    //文件名
    String exportFileName = "数据_"+now+".xlsx";
    String[] cellTitle = {"序号","姓名","学号","性别","入学日期"};
    //需要导出的数据
    List<String[]> dataList = new ArrayList<String[]>();
    dataList.add(new String[]{"东邪","17232401001","男","2015年9月"});
    dataList.add(new String[]{"西毒","17232401002","女","2016年9月"});
    dataList.add(new String[]{"南帝","17232401003","男","2017年9月"});
    dataList.add(new String[]{"北丐","17232401004","男","2015年9月"});
    dataList.add(new String[]{"中神通","17232401005","女","2017年9月"});
    // 声明一个工作薄
    XSSFWorkbook workBook = null;
    workBook = new XSSFWorkbook();
    // 生成一个表格
    XSSFSheet sheet = workBook.createSheet();
    workBook.setSheetName(0,"学生信息");
    // 创建表格标题行 第一行
    XSSFRow titleRow = sheet.createRow(0);
    for(int i=0;i<cellTitle.length;i++){
        titleRow.createCell(i).setCellValue(cellTitle[i]);
    }
    //插入需导出的数据
    for(int i=0;i<dataList.size();i++){
        XSSFRow row = sheet.createRow(i+1);
        row.createCell(0).setCellValue(i+1);
        row.createCell(1).setCellValue(dataList.get(i)[0]);
        row.createCell(2).setCellValue(dataList.get(i)[1]);
        row.createCell(3).setCellValue(dataList.get(i)[2]);
        row.createCell(4).setCellValue(dataList.get(i)[3]);
    }
    File  file = new File(basePath+exportFileName);
    //文件输出流
    FileOutputStream outStream = new FileOutputStream(file);
    workBook.write(outStream);
    outStream.flush();
    outStream.close();
    System.out.println("导出成功！"+basePath+exportFileName);
}
}
