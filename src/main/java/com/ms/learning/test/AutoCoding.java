package com.ms.codegenerator;

import com.ms.codegenerator.util.CodeGenerator;
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
        final String mainDir = "/Users/yang/Documents/git/java/project/cloud-file-system/src/main/";

        CodeGenerator.ConfigBuilder builder = new CodeGenerator.ConfigBuilder();

        CodeGenerator codeGenerator = builder
//                数据库连接
                .dbUrl("jdbc:mysql://localhost:3306/db_26_cloud")
//                账户
                .userName("root")
//                密码
                .password("yanglei1123")
                // 生成类位置
                .dir(mainDir + "java")
                // 生成xml 位置
                .xmlDir(mainDir + "resources")
                // 包引用路径
                .packageName("com.zhiyou100")
                .build();

        //根据表生成后台代码
        codeGenerator.code("tab_file");

    }
}