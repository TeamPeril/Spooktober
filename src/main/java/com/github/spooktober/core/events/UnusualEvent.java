package com.github.spooktober.core.events;

import com.github.spooktober.core.init.UnusualType;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.world.World;

public class UnusualEvent {
	public static final double ORBIT_RADIUS = 1.0;
	public static double ORBIT_ANGLE = 0;
	
	public static void displayUnusualEffect(String unusual_type, BasicParticleType particle, World world, PlayerEntity player)
	{
		double x = player.xo;
		double y = player.yo + 2.3;
		double z = player.zo;
		
		switch(unusual_type)
		{
			case UnusualType.FIXED_SINGLE:
				world.addParticle(particle, x, y, z, 0, 0, 0); //Display on head
				break;
				
			case UnusualType.FIXED_MULTIPLE:
				world.addParticle(particle, x + rng(0.5,-0.5), y, z + rng(0.5,-0.5), 0, 0, 0); //Display on head
				break;
			
			case UnusualType.ORBIT:
				double velocity = 0.1;
				ORBIT_ANGLE = (ORBIT_ANGLE + velocity * 1) % 360;
				double xParticle = x + ORBIT_RADIUS * Math.cos(ORBIT_ANGLE);
				double zParticle = z + ORBIT_RADIUS * Math.sin(ORBIT_ANGLE);
				world.addParticle(particle, xParticle, y, zParticle, 0, 0, 0); //Display on head
				break;
			
		}
		
	}
	
	public static double rng(double max, double min)
	{
		return (Math.random() * (max - min)) + min;
	}

}
