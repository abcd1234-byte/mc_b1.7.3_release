package net.minecraft.src;

import java.util.Random;

public class BlockSand extends Block {
    public static boolean field_466_a = false;

    public BlockSand(int var1, int var2) {
        super(var1, var2, Material.field_1325_m);
    }

    public void func_235_e(World var1, int var2, int var3, int var4) {
        var1.func_22136_c(var2, var3, var4, this.field_376_bc, this.func_4025_d());
    }

    public void func_226_a(World var1, int var2, int var3, int var4, int var5) {
        var1.func_22136_c(var2, var3, var4, this.field_376_bc, this.func_4025_d());
    }

    public void func_208_a(World var1, int var2, int var3, int var4, Random var5) {
        this.func_315_h(var1, var2, var3, var4);
    }

    private void func_315_h(World var1, int var2, int var3, int var4) {
        if (func_316_a_(var1, var2, var3 - 1, var4) && var3 >= 0) {
            byte var8 = 32;
            if (!field_466_a && var1.func_640_a(var2 - var8, var3 - var8, var4 - var8, var2 + var8, var3 + var8, var4 + var8)) {
                EntityFallingSand var9 = new EntityFallingSand(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), this.field_376_bc);
                var1.func_674_a(var9);
            } else {
                var1.func_690_d(var2, var3, var4, 0);

                while(func_316_a_(var1, var2, var3 - 1, var4) && var3 > 0) {
                    --var3;
                }

                if (var3 > 0) {
                    var1.func_690_d(var2, var3, var4, this.field_376_bc);
                }
            }
        }

    }

    public int func_4025_d() {
        return 3;
    }

    public static boolean func_316_a_(World var0, int var1, int var2, int var3) {
        int var4 = var0.func_600_a(var1, var2, var3);
        if (var4 == 0) {
            return true;
        } else if (var4 == Block.field_402_as.field_376_bc) {
            return true;
        } else {
            Material var5 = Block.field_345_n[var4].field_356_bn;
            if (var5 == Material.field_1332_f) {
                return true;
            } else {
                return var5 == Material.field_1331_g;
            }
        }
    }
}
