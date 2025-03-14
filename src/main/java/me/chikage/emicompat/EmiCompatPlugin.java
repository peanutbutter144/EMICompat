package me.chikage.emicompat;

import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import me.chikage.emicompat.ae2.Ae2Plugin;
import me.chikage.emicompat.ae2wtlib.Ae2wtlibPlugin;
import me.chikage.emicompat.farmersdelight.FarmersDelightPlugin;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmiCompatPlugin implements EmiPlugin {
    public static final Logger LOGGER = LoggerFactory.getLogger("emicompat");

    @Override
    public void register(EmiRegistry emi) {
        FabricLoader loader = FabricLoader.getInstance();
        if (loader.isModLoaded("ae2"))
            new Ae2Plugin().register(emi);
        if (loader.isModLoaded("farmersdelight"))
            new FarmersDelightPlugin().register(emi);
//        if (loader.isModLoaded("createaddition"))
//            new CreateAdditionPlugin().register(emi);
        if (loader.isModLoaded("ae2wtlib"))
            new Ae2wtlibPlugin().register(emi);
    }
}
