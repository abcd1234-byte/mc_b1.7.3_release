package net.minecraft.src;

public class ItemFlintAndSteel extends Item {
    public ItemFlintAndSteel(int var1) {
        super(var1);
        this.field_233_aT = 1;
        this.func_21090_d(64);
    }

    public boolean func_78_a(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7) {
        if (var7 == 0) {
            --var5;
        }

        if (var7 == 1) {
            ++var5;
        }

        if (var7 == 2) {
            --var6;
        }

        if (var7 == 3) {
            ++var6;
        }

        if (var7 == 4) {
            --var4;
        }

        if (var7 == 5) {
            ++var4;
        }

        int var8 = var3.func_444_a(var4, var5, var6);
        if (var8 == 0) {
            var3.func_502_a((double)var4 + 0.5D, (double)var5 + 0.5D, (double)var6 + 0.5D, "fire.ignite", 1.0F, field_4154_b.nextFloat() * 0.4F + 0.8F);
            var3.func_508_d(var4, var5, var6, Block.field_599_as.field_573_bc);
        }

        var1.func_25125_a(1, var2);
        return true;
    }
}
