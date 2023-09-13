package net.felix.turtle_magic.entity.client.descendingshell;

import net.felix.turtle_magic.TurtleMagic;
import net.felix.turtle_magic.entity.custom.DescendingShellEntity;
import net.felix.turtle_magic.util.TMMethods;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DescendingShellModel extends AnimatedGeoModel<DescendingShellEntity> {
    @Override
    public ResourceLocation getModelResource(DescendingShellEntity object) {
        return new ResourceLocation(TurtleMagic.MOD_ID, "geo/descending_shell.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DescendingShellEntity object) {
        return TMMethods.TURTLE_SHELL;
    }

    @Override
    public ResourceLocation getAnimationResource(DescendingShellEntity animatable) {
        return new ResourceLocation(TurtleMagic.MOD_ID, "animations/descending_shell.animation.json");
    }
}