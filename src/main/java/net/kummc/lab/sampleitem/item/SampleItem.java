package net.kummc.lab.sampleitem.item;

import net.kummc.lab.sampleitem.Sample;
import net.kummc.lab.sampleitem.tool.ModItemTier;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SampleItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Sample.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> SAMPLE_ITEM = ITEMS.register("sample_item",
            () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<AxeItem> SAMPLE_ITEM2 = ITEMS.register("sample_item2",
            () -> new AxeItem(ModItemTier.HAGANE, 5, 1.0F, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> SAMPLE_ITEM3 = ITEMS.register("sample_item3",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(1).saturation(10.0f).build())));

}
