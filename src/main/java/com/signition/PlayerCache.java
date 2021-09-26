package com.signition;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PlayerCache {

    @Getter
    private static final Map<UUID, PlayerCache> cacheMap = new HashMap<>();

    public PlayerCache(UUID uuid) {

    }

    public static PlayerCache getCache(final UUID uuid) {
        PlayerCache cache = cacheMap.get(uuid);

        if (cache == null) {
            cache = new PlayerCache(uuid);
            cacheMap.put(uuid, cache);
        }
        return cache;
    }

}
