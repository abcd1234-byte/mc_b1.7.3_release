package net.minecraft.src;

import java.util.Random;

public class WorldGenTrees extends WorldGenerator {
    public boolean func_419_a(World var1, Random var2, int var3, int var4, int var5) {
        int var6 = var2.nextInt(3) + 4;
        boolean var7 = true;
        if (var4 >= 1 && var4 + var6 + 1 <= 128) {
            int var8;
            int var10;
            int var11;
            int var12;
            for(var8 = var4; var8 <= var4 + 1 + var6; ++var8) {
                byte var9 = 1;
                if (var8 == var4) {
                    var9 = 0;
                }

                if (var8 >= var4 + 1 + var6 - 2) {
                    var9 = 2;
                }

                for(var10 = var3 - var9; var10 <= var3 + var9 && var7; ++var10) {
                    for(var11 = var5 - var9; var11 <= var5 + var9 && var7; ++var11) {
                        if (var8 >= 0 && var8 < 128) {
                            var12 = var1.func_444_a(var10, var8, var11);
                            if (var12 != 0 && var12 != Block.field_581_L.field_573_bc) {
                                var7 = false;
                            }
                        } else {
                            var7 = false;
                        }
                    }
                }
            }

            if (!var7) {
                return false;
            } else {
                var8 = var1.func_444_a(var3, var4 - 1, var5);
                if ((var8 == Block.field_534_v.field_573_bc || var8 == Block.field_533_w.field_573_bc) && var4 < 128 - var6 - 1) {
                    var1.func_462_a(var3, var4 - 1, var5, Block.field_533_w.field_573_bc);

                    int var16;
                    for(var16 = var4 - 3 + var6; var16 <= var4 + var6; ++var16) {
                        var10 = var16 - (var4 + var6);
                        var11 = 1 - var10 / 2;

                        for(var12 = var3 - var11; var12 <= var3 + var11; ++var12) {
                            int var13 = var12 - var3;

                            for(int var14 = var5 - var11; var14 <= var5 + var11; ++var14) {
                                int var15 = var14 - var5;
                                if ((Math.abs(var13) != var11 || Math.abs(var15) != var11 || var2.nextInt(2) != 0 && var10 != 0) && !Block.field_540_p[var1.func_444_a(var12, var16, var14)]) {
                                    var1.func_462_a(var12, var16, var14, Block.field_581_L.field_573_bc);
                                }
                            }
                        }
                    }

                    for(var16 = 0; var16 < var6; ++var16) {
                        var10 = var1.func_444_a(var3, var4 + var16, var5);
                        if (var10 == 0 || var10 == Block.field_581_L.field_573_bc) {
                            var1.func_462_a(var3, var4 + var16, var5, Block.field_582_K.field_573_bc);
                        }
                    }

                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }
}
