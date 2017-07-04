package mcjty.deepresonance.blocks.laser;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class LaserSetup {
    public static LaserBlock laserBlock;

    public static void setupBlocks() {
        laserBlock = new LaserBlock();
    }

    @SideOnly(Side.CLIENT)
    public static void setupModels() {
        laserBlock.initModel();
    }

    public static void setupCrafting() {
//        GameRegistry.addRecipe(new ItemStack(laserBlock), "ggg", "eMe", "ddd", 'M', ModBlocks.machineFrame, 'g', Blocks.GLASS, 'e', Items.EMERALD, 'd', Items.DIAMOND);
    }
}
