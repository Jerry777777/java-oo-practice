package com.twu;

import java.util.List;

public class HotSearchManager {
    private List<HotSearch> hotSearchList;
    private List<Integer> hotSearchPrice;

    public HotSearchManager(List<HotSearch> hotSearchList, List<Integer> hotSearchPrice) {
        this.hotSearchList = hotSearchList;
        this.hotSearchPrice = hotSearchPrice;
    }

    public HotSearchManager() {

    }

    public List<HotSearch> getHotSearchList() {
        return hotSearchList;
    }

    public void setHotSearchList(List<HotSearch> hotSearchList) {
        this.hotSearchList = hotSearchList;
    }

    public List<Integer> getHotSearchPrice() {
        return hotSearchPrice;
    }

    public void setHotSearchPrice(List<Integer> hotSearchPrice) {
        this.hotSearchPrice = hotSearchPrice;
    }

    public void printHotSearchList() {
        this.hotSearchList.forEach(System.out::println);
    }

    public void addHotSearch(HotSearch hotSearch) {
        this.hotSearchList.add(hotSearch);
    }

    public void addSuperHotSearch(HotSearch hotSearch) {
        this.hotSearchList.add(hotSearch);
    }

    public void voteForHotSearch(String content, int vote) {
        for (HotSearch hotSearch : this.hotSearchList) {
            if (hotSearch.getContent().equals(content)) {
                hotSearch.setVote(hotSearch.getVote() + vote);
                break;
            } else {
                return;
            }
        }
    }
}
