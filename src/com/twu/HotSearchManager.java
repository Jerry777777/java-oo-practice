package com.twu;

import com.twu.exceptiond.VoteFailException;
import com.twu.users.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HotSearchManager {
    private List<HotSearch> hotSearchList = new ArrayList<>();

    public HotSearchManager() {
    }

    public List<HotSearch> getHotSearchList() {
        List<HotSearch> list = this.hotSearchList.stream().sorted((h1, h2) -> h2.getVote() - h1.getVote()).collect(Collectors.toList());
        List<HotSearch> willSortHotSearch = new ArrayList<>();
        for (HotSearch hotSearch : list) {
            if (hotSearch.isBuyHotSearch()) {
                willSortHotSearch.add(hotSearch);
            }
        }
        for (HotSearch hotSearch : willSortHotSearch) {
            list = sortByRanking(list, hotSearch);
        }
        this.hotSearchList = list;
        return list;
    }

    public List<HotSearch> sortByRanking(List<HotSearch> list, HotSearch hotSearch) {
        List<HotSearch> newList;
        newList = new ArrayList<>(list.subList(0, hotSearch.getRanking() - 1));
        newList.add(hotSearch);
        newList.addAll(list.subList(hotSearch.getRanking() - 1, list.size()));
        newList.remove(newList.lastIndexOf(hotSearch));
        return newList;
    }

    public void checkHotSearchList() {
        List<HotSearch> hotSearchList = getHotSearchList();
        hotSearchList.forEach(i -> {
            System.out.println(hotSearchList.indexOf(i) + 1 + " " + i);
        });
    }

    public void addHotSearch(HotSearch hotSearch) {
        this.hotSearchList.add(hotSearch);
    }

    public void addSuperHotSearch(HotSearch hotSearch) {
        this.hotSearchList.add(hotSearch);
    }

    public void voteForHotSearch(User user, String content, int vote) {
        if (vote > user.getVoteCount()) {
            throw new VoteFailException("投票失败：剩余票数不足");
        } else {
            boolean voteSuccess = false;
            for (HotSearch hotSearch : this.hotSearchList) {
                if (hotSearch.getContent().equals(content)) {
                    int voteToAdd = vote;
                    if (hotSearch.isSuperHotSearch()) {
                        voteToAdd = vote * 2;
                    }
                    hotSearch.setVote(hotSearch.getVote() + voteToAdd);
                    user.setVoteCount(user.getVoteCount() - vote);
                    voteSuccess = true;
                    System.out.println("投票成功！");
                    break;
                }
            }
            if (!voteSuccess) {
                throw new VoteFailException("投票失败：热搜不存在");
            }
        }
    }

    public void buyHotSearch(String content, int ranking, int price) {
        boolean canBuyIt = false;
        for (HotSearch hotSearch : this.getHotSearchList()) {
            if (hotSearch.getContent().equals(content) && price > this.getHotSearchList().get(ranking - 1).getPrice()) {
                canBuyIt = true;
                hotSearch.setBuyHotSearch(true);
                hotSearch.setRanking(ranking);
                hotSearch.setPrice(price);
            }
        }
        String resultOfBuyHotSearch = canBuyIt ? "购买成功" : "购买失败";
        System.out.println(resultOfBuyHotSearch);

    }
}
