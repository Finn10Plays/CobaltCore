package net.cobaltcore.forge;

import net.cobaltcore.CobaltCore;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.threetag.palladiumcore.forge.PalladiumCoreForge;

@Mod(CobaltCore.MOD_ID)
public class ExampleModForge {

    public CobaltCoreForge() {
        // Submit our event bus to let PalladiumCore register our content on the right time
        PalladiumCoreForge.registerModEventBus(CobaltCore.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        CobaltCore.init();
    }
}
