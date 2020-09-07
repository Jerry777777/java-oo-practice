package com.twu;

import com.twu.services.HotSearchService;
import com.twu.services.HotSearchServiceI;

public class Main {
    private static HotSearchServiceI hotSearchService = new HotSearchService();

    public static void main(String[] args) {
        hotSearchService.operateHotSearch();
    }
}
