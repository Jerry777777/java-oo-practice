package com.twu.services;

import com.twu.HotSearch;
import com.twu.repositories.HotSearchRepository;
import com.twu.users.User;

import java.util.Scanner;

public class UserService implements UserServiceI{

    @Override
    public void homePage(User user) {
        System.out.printf("你好,%s,你可以:%n",user.getName());
        System.out.println("1.查看热搜排行榜\n2.给热搜事件投票\n3.购买热搜\n4.添加热搜\n5.退出");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        switch (choice) {
            case "1":
                HotSearchRepository.hotSearchManager.checkHotSearchList();
                homePage(user);
                break;
            case "2":
                System.out.println("请输入你要投票的热搜名称:");
                String contentToVote = scanner.next();
                System.out.println(String.format("请输入你要投票的热搜票数：(你目前还有：%s票)",user.getVoteCount()));
                int voteCount = scanner.nextInt();
                HotSearchRepository.hotSearchManager.voteForHotSearch(user,contentToVote,voteCount);
                homePage(user);
                break;
            case "3":
                System.out.println("请输入你要购买的热搜名称:");
                String contentToBuy = scanner.next();
                System.out.println("请输入你要投票的热搜名次:");
                int rank = scanner.nextInt();
                HotSearchRepository.hotSearchManager.buyHotSearch(contentToBuy,rank);
                break;
            case "4":
                System.out.println("请输入你要添加的热搜内容：");
                String contentToAdd = scanner.next();
                HotSearchRepository.hotSearchManager.addHotSearch(new HotSearch(contentToAdd));
                homePage(user);
                break;
            case "5":
                System.out.println("why?");
                break;
        }
    }
}