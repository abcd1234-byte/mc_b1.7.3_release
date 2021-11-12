package net.minecraft.src;

public class ContainerDispenser extends Container {
    private TileEntityDispenser field_21133_a;

    public ContainerDispenser(IInventory var1, TileEntityDispenser var2) {
        this.field_21133_a = var2;

        int var3;
        int var4;
        for(var3 = 0; var3 < 3; ++var3) {
            for(var4 = 0; var4 < 3; ++var4) {
                this.func_20122_a(new Slot(var2, var4 + var3 * 3, 62 + var4 * 18, 17 + var3 * 18));
            }
        }

        for(var3 = 0; var3 < 3; ++var3) {
            for(var4 = 0; var4 < 9; ++var4) {
                this.func_20122_a(new Slot(var1, var4 + var3 * 9 + 9, 8 + var4 * 18, 84 + var3 * 18));
            }
        }

        for(var3 = 0; var3 < 9; ++var3) {
            this.func_20122_a(new Slot(var1, var3, 8 + var3 * 18, 142));
        }

    }

    public boolean func_20126_b(EntityPlayer var1) {
        return this.field_21133_a.func_20067_a_(var1);
    }
}
