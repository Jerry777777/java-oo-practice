package com.twu;

public class HotSearch {
    private String content;
    private int vote;
    private boolean hasBuyHotSearch;
    private boolean isSuperHotSearch;

    public HotSearch(String content) {
        this.content = content;
        this.vote = 0;
        this.hasBuyHotSearch = false;
        this.isSuperHotSearch = false;
    }

    public HotSearch(String content, int vote) {
        this.content = content;
        this.vote = vote;
        this.hasBuyHotSearch = false;
        this.isSuperHotSearch = false;
    }

    public HotSearch(String content, boolean isSuperHotSearch) {
        this.content = content;
        this.vote = vote;
        this.isSuperHotSearch = isSuperHotSearch;
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

    public boolean isHasBuyHotSearch() {
        return hasBuyHotSearch;
    }

    public void setHasBuyHotSearch(boolean hasBuyHotSearch) {
        this.hasBuyHotSearch = hasBuyHotSearch;
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
