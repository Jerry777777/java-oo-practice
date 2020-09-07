package com.twu.user;

public class User {
    private String name;
    private int voteCount;

    public User(String name) {
        this.name = name;
        this.voteCount=10;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }
}
