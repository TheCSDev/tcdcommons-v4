package io.github.thecsdev.tcdcommons.mixin.hooks;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ServerPlayer.class)
public interface AccessorServerPlayer
{
	@Accessor("server") MinecraftServer getServer();
}
