package com.ms.learning.test;


import com.ms.learning.utils.CodeGenerator;

/**
 * 自动生成
 *
 * @author yang
 * @version 1.0.0
 * @date 2020-10-09 10:35
 */
public class AutoCoding {
    public static void main(String[] args) {
        //          maven 工程 main 包的全路径
        final String mainDir = "C:\\03SourceCode\\ms-learning\\src\\main";
        final String javaDir = mainDir + "\\java";
        final String xmlDir = mainDir + "\\resources";
//        final String mainDir = "/Users/yang/Documents/git/java/project/cloud-file-system/src/main/";
        CodeGenerator.ConfigBuilder builder = new CodeGenerator.ConfigBuilder();

        String url = "jdbc:mysql://192.168.1.209:3306/wimi_marry?useUnicode=true&useSSL=false&characterEncoding=utf8";
//        String url = "jdbc:mysql://192.168.1.209:3306/wimi_social?useUnicode=true&useSSL=false&characterEncoding=utf8";
        String userName = "root";
        String pwd = "yKLFEGZwWy57";
        String author = "masong";
        String packageName = "com.ipinknow.marry.user.persist";
        String[] tableNames = {"ums_user_black_list"};
        CodeGenerator codeGenerator = builder
//                数据库连接
                .dbUrl(url)
//                账户
                .userName(userName)
//                密码
                .password(pwd)
                // 生成类位置
                .dir(javaDir )
                // 生成xml 位置
                .xmlDir(xmlDir)
                .author(author)
                // 包引用路径
                .packageName(packageName)
                .build();

        //根据表生成后台代码
        codeGenerator.code("ums_user_black_list");
    }
}