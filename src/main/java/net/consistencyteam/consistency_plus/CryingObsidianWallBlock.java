package net.consistencyteam.consistency_plus;

import java.util.Random;

import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CryingObsidianWallBlock extends WallBlock {

    public CryingObsidianWallBlock(Settings settings) {
        super(settings);
    }

    public void randomDisplayTick(BlockState obsidianState, World world, BlockPos position, Random random) {
        if (random.nextInt(5) == 0) {
            //for (int int_1 = 0; int_1 < random.nextInt(1) + 1; ++int_1)
            int randoms = (int) (Math.random() * 5000);
            if (randoms > 4500) {
                world.addParticle(ParticleTypes.DRIPPING_OBSIDIAN_TEAR, (float) position.getX() + Math.random() * 1, (float) position.getY() + 0.8F, (float) position.getZ() + Math.random() * 0.9, random.nextFloat() / 2.0F, 5.0E-5D, random.nextFloat() / 2.0F);
                world.addParticle(ParticleTypes.DRIPPING_OBSIDIAN_TEAR, (float) position.getX() + Math.random() * 0.8, (float) position.getY() + 0.8F, (float) position.getZ() + Math.random() * 1, random.nextFloat() / 2.0F, 5.0E-5D, random.nextFloat() / 2.0F);
                world.addParticle(ParticleTypes.DRIPPING_OBSIDIAN_TEAR, (float) position.getX() + Math.random() * 0.2, (float) position.getY() + 0.8F, (float) position.getZ() + Math.random() * 1, random.nextFloat() / 2.0F, 5.0E-5D, random.nextFloat() / 2.0F);
                world.addParticle(ParticleTypes.DRIPPING_OBSIDIAN_TEAR, (float) position.getX() + Math.random() * 1, (float) position.getY() + 0.8F, (float) position.getZ() + Math.random() * 0.2, random.nextFloat() / 2.0F, 5.0E-5D, random.nextFloat() / 2.0F);
            }
        }
    }
}