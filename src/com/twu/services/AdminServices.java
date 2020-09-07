package com.twu.services;

import com.twu.HotSearch;
import com.twu.repositories.HotSearchRepository;
import com.twu.users.Admin;

import java.util.Scanner;

public class AdminServices implements AdminServicesI {
    public void homePage(Admin admin) {
        System.out.println(String.format("你好,%s,你可以:", admin.getName()));
        System.out.println("1.查看热搜排行榜\n2.添加热搜\n3.添加超级热搜\n4.退出");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        switch (choice) {
            case "1":
                HotSearchRepository.hotSearchManager.checkHotSearchList();
                homePage(admin);
                break;
            case "2":
                System.out.println("请输入你要添加的热搜内容：");
                String contentToAdd = scanner.next();
                HotSearchRepository.hotSearchManager.addHotSearch(new HotSearch(contentToAdd));
                homePage(admin);
                break;
            case "3":
                System.out.println("请输入你要添加的超级热搜内容：");
                String contentToAddSuper = scanner.next();
                HotSearchRepository.hotSearchManager.addSuperHotSearch(new HotSearch(contentToAddSuper));
                homePage(admin);
            case "4":
                break;
        }
    }
}
