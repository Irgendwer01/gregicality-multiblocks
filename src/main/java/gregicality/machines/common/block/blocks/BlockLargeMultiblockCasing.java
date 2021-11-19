package gregicality.machines.common.block.blocks;

import gregtech.common.blocks.VariantBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import javax.annotation.Nonnull;

public class BlockLargeMultiblockCasing extends VariantBlock<BlockLargeMultiblockCasing.CasingType> {

    public BlockLargeMultiblockCasing() {
        super(Material.IRON);
        setTranslationKey("large_multiblock_casing");
        setHardness(5.0f);
        setResistance(10.0f);
        setSoundType(SoundType.METAL);
        setHarvestLevel("pickaxe", 2);
        setDefaultState(getState(CasingType.MACERATOR_CASING));
    }

    @Override
    public boolean canCreatureSpawn(@Nonnull IBlockState state, @Nonnull IBlockAccess world, @Nonnull BlockPos pos, @Nonnull EntityLiving.SpawnPlacementType type) {
        return false;
    }

    public enum CasingType implements IStringSerializable {

        MACERATOR_CASING("macerator_casing"),
        BLAST_CASING("blast_casing"),
        ASSEMBLING_CASING("assembler_casing"),
        AUTOCLAVE_CASING("autoclave_casing"),
        BENDER_CASING("bender_casing"),
        BREWERY_CASING("brewery_casing"),
        CENTRIFUGE_CASING("centrifuge_casing"),
        BATH_CASING("bath_casing"),
        FLUID_SAFE_CASING("fluid_safe_casing"),
        CUTTER_CASING("cutter_casing"),
        DISTILLERY_CASING("distillery_casing"),
        ELECTROLYZER_CASING("electrolyzer_casing"),
        ELECTROMAGNET_CASING("electromagnet_casing"),
        EXTRUDER_CASING("extruder_casing"),
        MIXER_CASING("mixer_casing"),
        ENGRAVER_CASING("engraver_casing");

        private final String name;

        CasingType(String name) {
            this.name = name;
        }

        @Nonnull
        @Override
        public String getName() {
            return this.name;
        }

    }
}
