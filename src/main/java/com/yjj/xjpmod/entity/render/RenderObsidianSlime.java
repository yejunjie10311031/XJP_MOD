package com.yjj.xjpmod.entity.render;

import com.yjj.xjpmod.entity.EntityObsidianSlime;
import com.yjj.xjpmod.util.Reference;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderObsidianSlime extends RenderLiving<EntityObsidianSlime>{

	public static final ResourceLocation TEXTURES=new ResourceLocation(Reference.MOD_ID + ":textures/entity/xjp.png");
	public RenderObsidianSlime(RenderManager manager) {
		super(manager, new ModelObsidianSlime, 0.5f);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityObsidianSlime entity)
	{
		return TEXTURES;
	}

}
