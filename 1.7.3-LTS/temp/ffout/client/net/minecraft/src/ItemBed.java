package net.minecraft.src;

public class ItemBed extends Item {
    public ItemBed(int var1) {
        super(var1);
    }

    public boolean func_192_a(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7) {
        if (var7 != 1) {
            return false;
        } else {
            ++var5;
            BlockBed var8 = (BlockBed)Block.field_9262_S;
            int var9 = MathHelper.func_1108_b((double)(var2.field_605_aq * 4.0F / 360.0F) + 0.5D) & 3;
            byte var10 = 0;
            byte var11 = 0;
            if (var9 == 0) {
                var11 = 1;
            }

            if (var9 == 1) {
                var10 = -1;
            }

            if (var9 == 2) {
                var11 = -1;
            }

            if (var9 == 3) {
                var10 = 1;
            }

            if (var3.func_20084_d(var4, var5, var6) && var3.func_20084_d(var4 + var10, var5, var6 + var11) && var3.func_28100_h(var4, var5 - 1, var6) && var3.func_28100_h(var4 + var10, var5 - 1, var6 + var11)) {
                var3.func_688_b(var4, var5, var6, var8.field_376_bc, var9);
                var3.func_688_b(var4 + var10, var5, var6 + var11, var8.field_376_bc, var9 + 8);
                --var1.field_1615_a;
                return true;
            } else {
                return false;
            }
        }
    }
}
