package com.yuChen.design_pattern.patterns.flyweight;

import lombok.val;

import java.util.HashMap;
import java.util.Map;

public class ChessmanFactory {
    private static final Map<String,Chessman> map = new HashMap<>();

    public ChessmanFactory() {
        Chessman white = new WhiteChessman();
        Chessman black = new BlackChessman();
        map.put("white", white);
        map.put("black", black);
    }

    public static Chessman getChessman(final String color) {
        return map.get(color);
    }

    public static void main(String[] args) {
        HashMap<String, Chessman> map = getStringChessmanHashMap();
        System.out.println(map);
    }

    private static HashMap<String, Chessman> getStringChessmanHashMap() {
        final Chessman black1, black2, white1, white2;
        black1 = ChessmanFactory.getChessman("black");
        black2 = ChessmanFactory.getChessman("black");
        white1 = ChessmanFactory.getChessman("white");
        white2 = ChessmanFactory.getChessman("white");
        HashMap<String, Chessman> map = new HashMap<>();
        map.put("black1", black1);
        map.put("black2", black2);
        map.put("white1", white1);
        map.put("white2", white2);
        return map;
    }
}

