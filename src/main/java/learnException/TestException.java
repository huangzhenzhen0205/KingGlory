package learnException;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by huangzhenzhen on 2017/8/14.
 */
public class TestException {

    static TestException test = new TestException();
    static boolean flag = true;
    static String books[] = {"java从入门到精通", "java从入门到放弃", "java从入门到出门"};
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("************欢迎使用************");
        test.tips();
        while (flag) {

            try {
                int in = scanner.nextInt();
                String s1 = scanner.nextLine();//清除缓存区残留的空白符
                String findBook = test.checkInput(in);
                System.out.println("您要查找的书籍是" + findBook);
            } catch (InputException e) {
                System.out.println(e.getMessage());
                test.tips();
            } catch (BooksException e) {
                System.out.println(e.getMessage());
                test.tips();
            } catch (InputMismatchException e) {
                System.out.println("命令输入错误，请根据提示输入数字命令");
                test.tips();
                String s1 = scanner.nextLine();
            }
        }
    }

    public String checkBookId() throws BooksException {
        System.out.println("请输入图书序号");
        int bookId = scanner.nextInt();
        for (int i = 0; i < books.length; i++) {
            if (i == bookId) {
                System.out.println("已找到对应书籍");
                flag = false;
                return books[i];
            }

        }
        throw new BooksException("当前书籍不存在");
    }

    public String checkInput(int newInt) throws InputException, BooksException {
        switch (newInt) {
            case 1:
                System.out.println("输入图书名称：");
                String bookName = scanner.nextLine();
                for (String book : books) {
                    if (book.equals(bookName)) {
                        System.out.println("已找到对应书籍");
                        flag = true;
                        return book;
                    }
                }
                throw new BooksException("当前书籍不存在");
            case 2:
                try {
                    return test.checkBookId();
                } catch (InputMismatchException ie) {
                    System.out.println("命令输入错误，请根据提示输入数字命令");
                    String s3 = scanner.nextLine();
                    return test.checkBookId();
                }
            default:
                throw new InputException("命令输入错误，请根据提示输入数字命令");
        }
    }

    public void tips() {
        System.out.println("请选择查找图书的方式：1、根据书名查找；2、根据编号查找");
    }
}
