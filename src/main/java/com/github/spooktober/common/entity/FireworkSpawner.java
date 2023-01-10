package com.github.spooktober.common.entity;

import java.util.Random;

import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.world.World;

public class FireworkSpawner {

    private static final Random RANDOM = new Random();

    public static void spawnRandomFireworks(World world, double x, double y, double z) {
        int amount = RANDOM.nextInt(6) + 5; // generate random amount of fireworks between 5 and 10

        for (int i = 0; i < amount; i++) {
            // create a new ItemStack for the FireworkRocketItem
            ItemStack fireworkStack = new ItemStack(Items.FIREWORK_ROCKET, 1);
            CompoundNBT nbt = fireworkStack.getOrCreateTag();
            // create the "Fireworks" tag if it doesn't exist
            if(!nbt.contains("Fireworks")){
                nbt.put("Fireworks", new CompoundNBT());
            }
            CompoundNBT fireworksTag = nbt.getCompound("Fireworks");
            fireworksTag.putByte("Flight", (byte) 2);
            ListNBT explosionsList = new ListNBT();

            // create random color for the fireworks
            int r = RANDOM.nextInt(256);
            int g = RANDOM.nextInt(256);
            int b = RANDOM.nextInt(256);
            int color = (r << 16) + (g << 8) + b;

            // create the explosion tag for the fireworks
            CompoundNBT explosion = new CompoundNBT();
            explosion.putByte("Type", (byte) 1);
            explosion.putByte("Flicker", (byte) 0);
            explosion.putByte("Trail", (byte) 0);
            explosion.putIntArray("Colors", new int[]{color});
            explosionsList.add(explosion);
            fireworksTag.put("Explosions", explosionsList);

            // create the entity for the fireworks
            FireworkRocketEntity rocket = new FireworkRocketEntity(world, x, y, z, fireworkStack);
            world.addFreshEntity(rocket);
        }
    }
}
