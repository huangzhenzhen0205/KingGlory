package liberarySystem;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by huangzhenzhen on 2017/8/10.
 */
public class LibrarySimulator {
    //主菜单
    private static final String MAIN_MENU =
            "1、列出所有书\n" +
                    "2、列出已借出的书\n" +
                    "3、列出过期未还的书\n" +
                    "4、列出所有读者" +
                    "5、创建图书" +
                    "6、创建读者\n" +
                    "7、借书\n" +
                    "8还书\n" +
                    "9、退出\n" +
                    "请输入序号：";
    private static String TYPE_MENU;  //图书类型
    private static final String DIGIT_CHOICE_PATTERN = "^\\d$";   //一个数字
    private static final String NO_EMPTY_PATTERN = "\\S.*";       //一个非空字符串
    static final String DATA_PATTERN = "yyyy/MM/dd";                           //日期格式
    static final String DATA_FORMAT_PATTERN = "　　^\\d{4}(\\-|\\/|\\.)\\d{1,2}\\1\\d{1,2}$";  //判断输入日期格式
    static HashMap<Integer, String> TYPES = new LinkedHashMap<Integer, String>();  //预定义图书类型

    static {
        TYPES.put(1, "科学类");
        TYPES.put(2, "文学类");
        TYPE_MENU = createTypeMenu();
    }

    private static String createTypeMenu() {
        String str = "";
        for (int index : TYPES.keySet()) {
            str += index + "." + TYPES.get(index) + "\n";

        }
        return str + "请选择书的类型:";
    }

}
