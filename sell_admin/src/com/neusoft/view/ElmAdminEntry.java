package com.neusoft.view;

import com.neusoft.domain.Admin;

import com.neusoft.view.imlp.AdminViewImpl;
import com.neusoft.view.imlp.BusinessViewImpl;

import java.util.Scanner;

/**
 * 饿了么管理入口程序
 */
public class ElmAdminEntry {
    public static void main(String[] args) {
        run();
    }
    public static void run() {

        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("---------饿了么后台管理系统----------");
        System.out.println("---------------------------------");

        AdminView adminView = new AdminViewImpl();
        BuisnessView buisnessView = new BusinessViewImpl();
        Admin admin = adminView.login();
        int menu = 0;
        if (admin != null) {
            System.out.println("登录成功!");
            while (menu != 5) {
                System.out.println("1. 查看所有商家   2. 搜索商家    3. 新建商家    4.删除商家   5. 退出系统");
                System.out.println("请输入你要选择的序号");
                menu = input.nextInt();
                switch (menu) {
                    case 1:
                        buisnessView.listAllBusiness();
                        break;
                    case 2:
                        buisnessView.selectBusiness();
                        break;
                    case 3:
                       buisnessView.saveBusiness();
                        break;
                    case 4:
                        buisnessView.removeBusiness();
                        break;
                    case 5:
                        System.out.println("欢迎下次登录");
                        break;
                    default:
                        System.out.println("没有这个选项");
                        break;
                }
            }

        } else {
            System.out.println("登录失败, 用户名密码错误");
        }
    }
}