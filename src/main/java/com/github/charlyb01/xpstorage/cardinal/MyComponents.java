package com.github.charlyb01.xpstorage.cardinal;

import dev.onyxstudios.cca.api.v3.component.ComponentKey;
import dev.onyxstudios.cca.api.v3.component.ComponentRegistry;
import dev.onyxstudios.cca.api.v3.item.ItemComponentFactoryRegistry;
import dev.onyxstudios.cca.api.v3.item.ItemComponentInitializer;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public final class MyComponents implements ItemComponentInitializer {
    public static final ComponentKey<RandIntComponent> XP_AMOUNT =
            ComponentRegistry.getOrCreate(new Identifier("xp_storage", "xp_amount"), RandIntComponent.class);

    @Override
    public void registerItemComponentFactories(ItemComponentFactoryRegistry registry) {
        registry.registerFor(Items.EXPERIENCE_BOTTLE, XP_AMOUNT, stack -> new XpAmountComponent());
    }
}
