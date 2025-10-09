package com.yuChen.design_pattern.patterns.flyweight;

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

        final Chessman black1, black2, white1, white2;
        black1 = ChessmanFactory.getChessman("black");
        black2 = ChessmanFactory.getChessman("black");
        white1 = ChessmanFactory.getChessman("white");
        white2 = ChessmanFactory.getChessman("white");
    }
}

