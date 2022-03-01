package com.github.kay9.dragonmounts;

import net.minecraftforge.common.ForgeConfigSpec;

public class DMLConfig
{
    private static final ForgeConfigSpec.BooleanValue REPLENISH_EGGS;
    public static boolean replenishEggs()
    {
        return REPLENISH_EGGS.get();
    }

    private static final ForgeConfigSpec.BooleanValue USE_LOOT_TABLES;
    public static boolean useLootTables()
    {
        return USE_LOOT_TABLES.get();
    }

    static final ForgeConfigSpec SERVER;

    static
    {
        var configurator = new ForgeConfigSpec.Builder();
        REPLENISH_EGGS = configurator.comment("Should Ender Dragon Eggs replenish on the exit portal after a respawned dragon is deafeated?",
                "Useful for multiplayer scenarios.")
                .define("replenish_eggs", true);
        USE_LOOT_TABLES = configurator.comment("Should dragon eggs generate in treasure chest loot tables?",
                "Useful for multiplayer scenarios and offering alternative ways to obtain eggs.")
                .define("use_loot_tables", false);

        SERVER = configurator.build();
    }
}
