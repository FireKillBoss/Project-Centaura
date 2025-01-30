package net.firekillboss.projectcentaura.item;

import net.firekillboss.projectcentaura.ProjectCentaura;
import net.firekillboss.projectcentaura.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ProjectCentaura.MOD_ID);

    public static final Supplier<CreativeModeTab> PROJECT_CENTAURA_ITEMS_TAB = CREATIVE_MODE_TAB.register("project_centaura_items_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.YELLOW_BRICK.get()))
                            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ProjectCentaura.MOD_ID, "project_centaura_blocks_tab"))
                            .title(Component.translatable("creativetab.projectcentaura.project_centaura_items"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModItems.YELLOW_BRICK);
                                output.accept(ModItems.DARK_BROWN_BRICK);
                                output.accept(ModItems.DARK_RED_BRICK);
                                output.accept(ModItems.GRAY_BRICK);
                                output.accept(ModItems.WHITE_BRICK);

                            }).build());
    public static final Supplier<CreativeModeTab> PROJECT_CENTAURA_BLOCKS_TAB = CREATIVE_MODE_TAB.register("project_centaura_blocks_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModBlocks.YELLOW_BRICKS))
                            .title(Component.translatable("creativetab.projectcentaura.project_centaura_blocks"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModBlocks.YELLOW_BRICKS);
                                output.accept(ModBlocks.DARK_BROWN_BRICKS);
                                output.accept(ModBlocks.DARK_RED_BRICKS);
                                output.accept(ModBlocks.GRAY_BRICKS);
                                output.accept(ModBlocks.WHITE_BRICKS);

                            }).build());


    public static void  register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
