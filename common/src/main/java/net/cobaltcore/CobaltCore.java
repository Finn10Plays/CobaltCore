package net.cobaltcore;

import net.minecraft.resources.ResourceLocation;
import net.cobaltcore.block.CobaltCoreBlocks;
import net.cobaltcore.item.CobaltCoreItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Consumer;

public class CobaltCore {

    public static final String MOD_ID = "cobaltcore";

    public static void init() {
        CobaltCoreBlocks.BLOCKS.register();
        CobaltCoreItems.ITEMS.register();

        CobaltCoreItems.init();
    }
}
