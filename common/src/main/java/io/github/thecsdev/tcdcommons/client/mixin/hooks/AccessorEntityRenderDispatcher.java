package io.github.thecsdev.tcdcommons.client.mixin.hooks;

import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.world.entity.EntityType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;

@Mixin(EntityRenderDispatcher.class)
public interface AccessorEntityRenderDispatcher
{
	public @Accessor("renderers") Map<EntityType<?>, EntityRenderer<?, ?>> getRenderers();
}