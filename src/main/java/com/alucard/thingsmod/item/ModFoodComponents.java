package com.alucard.thingsmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(3)
            .saturationModifier(0.25f).statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 200), 1f).build();

    public static final FoodComponent BRISADO = new FoodComponent.Builder().hunger(3)
            .saturationModifier(0.25f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300), 0.25f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200), 0.25f).
            statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 150), 0.25f).build();
}
