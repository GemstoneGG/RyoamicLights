package org.thinkingstudio.ryoamiclights.neoforge;

import net.neoforged.fml.loading.FMLLoader;

public class RyoamicLightsCompatImpl {
    public static boolean isCanvasInstalled() {
        return FMLLoader.getLoadingModList().getModFileById("canvas") != null;
    }

    public static boolean isLilTaterReloadedInstalled() {
        return FMLLoader.getLoadingModList().getModFileById("ltr") != null;
    }

    public static boolean isSodiumInstalled() {
        return FMLLoader.getLoadingModList().getModFileById("embeddium") != null;
    }

    public static boolean isFabricApiInstalled() {
        return FMLLoader.getLoadingModList().getModFileById("fabric_api") != null;
    }

    public static boolean isDevEnvironment() {
        return !FMLLoader.isProduction();
    }
}
