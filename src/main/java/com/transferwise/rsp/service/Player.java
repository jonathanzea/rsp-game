package com.transferwise.rsp.service;

public class Player {
    private String name;
    private ToolType tool;
    private int wins = 0 ;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, ToolType tool) {
        this.name = name;
        this.tool = tool;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ToolType getTool() {
        return tool;
    }

    public void setTool(ToolType tool) {
        this.tool = tool;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void addPoint() {
        this.wins++;
    }
}
