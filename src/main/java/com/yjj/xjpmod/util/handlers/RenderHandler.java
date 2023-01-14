package com.yjj.xjpmod.util.handlers;

import com.yjj.xjpmod.entity.EntityObsidianSlime;
import com.yjj.xjpmod.entity.render.RenderObsidianSlime;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityObsidianSlime.class, new IRenderFactory<EntityObsidianSlime>()
				{
			@Override
			public Render<? super EntityObsidianSlime> createRenderFor(RenderManager manager)
			{
				return new RenderObsidianSlime(manager);
			}
				});
	}
}
