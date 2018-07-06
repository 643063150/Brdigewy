package com.brdigewy.brdigesystem;

/**
 * 创建日期：2018/6/26
 *
 * @author zpp
 * @version 1.0
 * 文件名称： $file_name$
 * 类说明：
 */
public class test {

    /**
     * book : {"author":{"money":500,"name":"南派三叔"},"name":"网络文学"}
     * name : 玄玉
     */

    private BookBean book;
    private String name;

    public BookBean getBook() {
        return book;
    }

    public void setBook(BookBean book) {
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class BookBean {
        /**
         * author : {"money":500,"name":"南派三叔"}
         * name : 网络文学
         */

        private AuthorBean author;
        private String name;

        public AuthorBean getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBean author) {
            this.author = author;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static class AuthorBean {
            /**
             * money : 500
             * name : 南派三叔
             */

            private int money;
            private String name;

            public int getMoney() {
                return money;
            }

            public void setMoney(int money) {
                this.money = money;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
