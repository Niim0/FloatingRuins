package bspkrs.floatingruins.fml;

import java.util.Random;

import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import bspkrs.floatingruins.FloatingRuins;
import cpw.mods.fml.common.IWorldGenerator;

public class FloatingRuinsWorldGenerator implements IWorldGenerator
{
    public FloatingRuinsWorldGenerator()
    {   
        
    }
    
    @Override
    public void generate(Random random, int x, int z, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        FloatingRuins.generateSurface(world, random, x << 4, z << 4);
    }
    
}
