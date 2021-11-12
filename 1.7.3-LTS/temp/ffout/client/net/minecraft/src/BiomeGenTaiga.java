package net.minecraft.src;

import java.util.Random;

public class BiomeGenTaiga extends BiomeGenBase {
    public BiomeGenTaiga() {
        this.field_25065_s.add(new SpawnListEntry(EntityWolf.class, 2));
    }

    public WorldGenerator func_21107_a(Random var1) {
        return (WorldGenerator)(var1.nextInt(3) == 0 ? new WorldGenTaiga1() : new WorldGenTaiga2());
    }
}
