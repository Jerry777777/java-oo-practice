package com.twu;

public class HotSearch {
    private String content;
    private int vote;
    private int price;
    private int ranking;
    private boolean buyHotSearch;
    private boolean isSuperHotSearch;

    public HotSearch(String content) {
        this.content = content;
        this.vote = 0;
        this.buyHotSearch = false;
        this.isSuperHotSearch = false;
    }

    public HotSearch(String content, int vote) {
        this.content = content;
        this.vote = vote;
        this.buyHotSearch = false;
        this.isSuperHotSearch = false;
    }

    public HotSearch(String content, boolean isSuperHotSearch) {
        this.content = content;
        this.vote = vote;
        this.isSuperHotSearch = isSuperHotSearch;
    }

    public HotSearch(String content, int ranking, boolean buyHotSearch, int price) {
        this.content = content;
        this.ranking = ranking;
        this.buyHotSearch = buyHotSearch;
        this.price = price;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public boolean isBuyHotSearch() {
        return buyHotSearch;
    }

    public void setBuyHotSearch(boolean buyHotSearch) {
        this.buyHotSearch = buyHotSearch;
    }

    public boolean isSuperHotSearch() {
        return isSuperHotSearch;
    }

    public void setSuperHotSearch(boolean superHotSearch) {
        isSuperHotSearch = superHotSearch;
    }

    @Override
    public String toString() {
        return content + " " + vote;
    }
}
