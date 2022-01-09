package coda.mortcoin;

import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.Random;

@Mod(MortCoin.MOD_ID)
public class MortCoin {
    public static final String MOD_ID = "mortcoin";

    public MortCoin() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;

        forgeBus.addListener(this::dropCoins);

        MCItems.ITEMS.register(bus);
    }

    private void dropCoins(LivingDeathEvent event) {
        Random random = new Random();

        if (random.nextFloat() > 0.6F) {
            event.getEntityLiving().spawnAtLocation(new ItemStack(MCItems.MORTCOIN.get(), random.nextInt(3) + 1));
        }
    }
}
