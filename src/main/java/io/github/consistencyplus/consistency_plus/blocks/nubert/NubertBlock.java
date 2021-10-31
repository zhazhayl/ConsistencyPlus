package io.github.consistencyplus.consistency_plus.blocks.nubert;

import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import static net.minecraft.block.Blocks.SLIME_BLOCK;
import static net.minecraft.state.property.Properties.WATERLOGGED;

public class NubertBlock extends HorizontalFacingBlock {
	public static final VoxelShape NUBERT_SHAPE = Block.createCuboidShape(2, 0, 2, 14, 12, 14);
	
	public NubertBlock() {
		super(FabricBlockSettings.copy(SLIME_BLOCK)
				.nonOpaque()
				.allowsSpawning(CPlusBlocks::never)
				.breakInstantly()
				.mapColor(MapColor.BRIGHT_RED)
				.luminance(state -> 7)
		);
	}
	
	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		ItemStack heldStack = player.getStackInHand(hand);
		if (heldStack.isOf(Items.YELLOW_WOOL)) {
			if (!world.isClient()) {
				world.setBlockState(pos,
						CPlusBlocks.WIGGED_NUBERT.getDefaultState()
								.with(FACING, state.get(FACING))
								.with(WATERLOGGED, state.get(WATERLOGGED))
				);
			}
			world.playSound(pos.getX(),
					pos.getY(),
					pos.getZ(),
					SoundEvents.BLOCK_WOOL_PLACE,
					SoundCategory.BLOCKS,
					1.0F,
					1.0F,
					false);
			
			return ActionResult.SUCCESS;
		}
		
		return super.onUse(state, world, pos, player, hand, hit);
	}
	
	@Nullable
	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite()).with(WATERLOGGED, ctx.getWorld().getFluidState(ctx.getBlockPos()).getFluid() == Fluids.WATER);
	}
	
	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(FACING, WATERLOGGED);
	}
	
	@Override
	public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return NUBERT_SHAPE;
	}
	
	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return NUBERT_SHAPE;
	}
	
	@Override
	public VoxelShape getRaycastShape(BlockState state, BlockView world, BlockPos pos) {
		return NUBERT_SHAPE;
	}
}