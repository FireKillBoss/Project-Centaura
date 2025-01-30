package net.firekillboss.projectcentaura.item;

import net.firekillboss.projectcentaura.ProjectCentaura;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ProjectCentaura.MOD_ID);

    public static final DeferredItem<Item> YELLOW_BRICK = ITEMS.register("yellow_brick",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DARK_RED_BRICK = ITEMS.register("dark_red_brick",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WHITE_BRICK = ITEMS.register("white_brick",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GRAY_BRICK = ITEMS.register("gray_brick",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DARK_BROWN_BRICK = ITEMS.register("dark_brown_brick",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
