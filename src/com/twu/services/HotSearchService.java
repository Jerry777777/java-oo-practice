package com.twu.services;

import com.twu.repositories.HotSearchRepository;
import com.twu.repositories.HotSearchRepositoryI;

public class HotSearchService implements HotSearchServiceI {
    private HotSearchRepositoryI hotSearchRepository = new HotSearchRepository();
}
