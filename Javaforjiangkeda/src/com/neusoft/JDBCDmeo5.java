package com.neusoft;



import com.neusoft.domain.Emp;

import java.sql.*;

public class JDBCDmeo5 {
    public static void main(String[] args) throws Exception{
        //        1、导入驱动jar包, 建立libs文件夹， 右键 add as library
        //        2、 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //        3、获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://" +
                "localhost:3306/jiangkeda","root", "199861");
        //        4、定义sql
        String sql = "select *from emp";
        //        5、获取数据库连接对象statement
        Statement stmt = conn.createStatement();
        //        6、执行sql
        ResultSet rs = stmt.executeQuery(sql);
        //        7、处理结果
//        while(rs.next()){
//            int EMPNO = rs.getInt(1);
//            String ENAME= rs.getString(2);
//            String JOB = rs.getString(3);
//            int MGR = rs.getInt(4);
//            Date HIREDATE = rs.getDate(5);
//            int SAL = rs.getInt(6);
//            int COMM = rs.getInt(7);
//            int DEPTNO = rs.getInt(8);
//            System.out.println(EMPNO+"--"+ENAME+"--"+JOB+
//                    "--"+MGR+"---"+HIREDATE+"--"+SAL+"--"+
//                    COMM+"--"+DEPTNO+"--"+DEPTNO);
//        }
        rs.next();
        int empno = rs.getInt(1);
        String ename= rs.getString(2);
        String job = rs.getString(3);
        int mgr = rs.getInt(4);
        Date hiredate = rs.getDate(5);
        int sal = rs.getInt(6);
        int comm = rs.getInt(7);
        int deptno = rs.getInt(8);
        Emp emp = new Emp(empno,ename,job,mgr,hiredate,sal,comm
        ,deptno);
        System.out.println(emp);
        //        8、释放资源
        stmt.close();
        conn.close();
    }
}
