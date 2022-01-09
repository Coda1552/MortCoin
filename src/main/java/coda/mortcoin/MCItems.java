package coda.mortcoin;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MCItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MortCoin.MOD_ID);

    public static final RegistryObject<Item> MORTCOIN = ITEMS.register("mortcoin", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).tab(CreativeModeTab.TAB_MISC)));
}
