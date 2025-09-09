package net.cobaltcore.fabric;

import net.cobaltcore.CobaltCore;
import net.fabricmc.api.ModInitializer;

public class CobaltCoreFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        CobaltCore.init();
    }

}
