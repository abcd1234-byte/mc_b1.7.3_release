package net.minecraft.src;

public class GuiOptions extends GuiScreen {
    private GuiScreen field_996_h;
    protected String field_994_a = "Options";
    private GameSettings field_995_i;
    private static EnumOptions[] field_22135_k;

    public GuiOptions(GuiScreen var1, GameSettings var2) {
        this.field_996_h = var1;
        this.field_995_i = var2;
    }

    public void func_6448_a() {
        StringTranslate var1 = StringTranslate.func_20162_a();
        this.field_994_a = var1.func_20163_a("options.title");
        int var2 = 0;
        EnumOptions[] var3 = field_22135_k;
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            EnumOptions var6 = var3[var5];
            if (!var6.func_20136_a()) {
                this.field_949_e.add(new GuiSmallButton(var6.func_20135_c(), this.field_951_c / 2 - 155 + var2 % 2 * 160, this.field_950_d / 6 + 24 * (var2 >> 1), var6, this.field_995_i.func_1043_a(var6)));
            } else {
                this.field_949_e.add(new GuiSlider(var6.func_20135_c(), this.field_951_c / 2 - 155 + var2 % 2 * 160, this.field_950_d / 6 + 24 * (var2 >> 1), var6, this.field_995_i.func_1043_a(var6), this.field_995_i.func_20104_a(var6)));
            }

            ++var2;
        }

        this.field_949_e.add(new GuiButton(101, this.field_951_c / 2 - 100, this.field_950_d / 6 + 96 + 12, var1.func_20163_a("options.video")));
        this.field_949_e.add(new GuiButton(100, this.field_951_c / 2 - 100, this.field_950_d / 6 + 120 + 12, var1.func_20163_a("options.controls")));
        this.field_949_e.add(new GuiButton(200, this.field_951_c / 2 - 100, this.field_950_d / 6 + 168, var1.func_20163_a("gui.done")));
    }

    protected void func_572_a(GuiButton var1) {
        if (var1.field_937_g) {
            if (var1.field_938_f < 100 && var1 instanceof GuiSmallButton) {
                this.field_995_i.func_1045_b(((GuiSmallButton)var1).func_20078_a(), 1);
                var1.field_939_e = this.field_995_i.func_1043_a(EnumOptions.func_20137_a(var1.field_938_f));
            }

            if (var1.field_938_f == 101) {
                this.field_945_b.field_6304_y.func_1041_b();
                this.field_945_b.func_6272_a(new GuiVideoSettings(this, this.field_995_i));
            }

            if (var1.field_938_f == 100) {
                this.field_945_b.field_6304_y.func_1041_b();
                this.field_945_b.func_6272_a(new GuiControls(this, this.field_995_i));
            }

            if (var1.field_938_f == 200) {
                this.field_945_b.field_6304_y.func_1041_b();
                this.field_945_b.func_6272_a(this.field_996_h);
            }

        }
    }

    public void func_571_a(int var1, int var2, float var3) {
        this.func_578_i();
        this.func_548_a(this.field_6451_g, this.field_994_a, this.field_951_c / 2, 20, 16777215);
        super.func_571_a(var1, var2, var3);
    }

    static {
        field_22135_k = new EnumOptions[]{EnumOptions.MUSIC, EnumOptions.SOUND, EnumOptions.INVERT_MOUSE, EnumOptions.SENSITIVITY, EnumOptions.DIFFICULTY};
    }
}
