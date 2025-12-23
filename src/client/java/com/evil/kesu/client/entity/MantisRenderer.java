package com.evil.kesu.client.entity;

import com.evil.kesu.KesU;
import com.evil.kesu.entity.custom.MantisEntity;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class MantisRenderer extends MobEntityRenderer<MantisEntity, MantisRenderState, MantisModel> {

    public MantisRenderer(EntityRendererFactory.Context context) {
        super(context, new MantisModel(context.getPart(MantisModel.MANTIS)), 5f);
    }

    @Override
    public Identifier getTexture(MantisRenderState state) {
        return Identifier.of(KesU.MOD_ID, "textures/entity/mantis/mantis.png");
    }

    @Override
    public void render(MantisRenderState state, MatrixStack matrixStack,
                       OrderedRenderCommandQueue orderedRenderCommandQueue, CameraRenderState cameraRenderState) {
        if(state.baby) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(state, matrixStack, orderedRenderCommandQueue, cameraRenderState);
    }

    @Override
    public MantisRenderState createRenderState() {
        return new MantisRenderState();
    }

    @Override
    public void updateRenderState(MantisEntity livingEntity, MantisRenderState livingEntityRenderState, float f) {
        super.updateRenderState(livingEntity, livingEntityRenderState, f);
        livingEntityRenderState.idleAnimationState.copyFrom(livingEntity.idleAnimationState);
        livingEntityRenderState.variant = livingEntity.getVariant();
    }
}