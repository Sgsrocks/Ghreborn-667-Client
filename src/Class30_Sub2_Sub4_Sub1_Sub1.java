// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import sign.signlink;

final class Class30_Sub2_Sub4_Sub1_Sub1 extends Class30_Sub2_Sub4_Sub1
{

    final Model method450(int i)
    {
        if(i != 0)
        {
            for(int j = 1; j > 0; j++);
        }
        if(super.anInt1526 >= 0 && super.anInt1529 == 0)
        {
            int k = Class20.aClass20Array351[super.anInt1526].anIntArray353[super.anInt1527];
            int i1 = -1;
            if(super.anInt1517 >= 0 && super.anInt1517 != super.anInt1511)
                i1 = Class20.aClass20Array351[super.anInt1517].anIntArray353[super.anInt1518];
            return aClass5_1696.method164(0, i1, k, Class20.aClass20Array351[super.anInt1526].anIntArray357);
        }
        int l = -1;
        if(super.anInt1517 >= 0)
            l = Class20.aClass20Array351[super.anInt1517].anIntArray353[super.anInt1518];
        return aClass5_1696.method164(0, -1, l, null);
    }

    public final Model method444(int i)
    {
        if(aClass5_1696 == null)
            return null;
        Model Model = method450(0);
        if(Model == null)
            return null;
        super.anInt1507 = ((Class30_Sub2_Sub4) (Model)).anInt1426;
        if(i != 4016)
            anInt1693 = -403;
        if(super.anInt1520 != -1 && super.anInt1521 != -1)
        {
            Class23 class23 = Class23.aClass23Array403[super.anInt1520];
            Model Model_1 = class23.method266();
            if(Model_1 != null)
            {
                int j = class23.aClass20_407.anIntArray353[super.anInt1521];
                Model Model_2 = new Model(9, true, Class36.method532(j, false), false, Model_1);
                Model_2.method475(0, -super.anInt1524, 16384, 0);
                Model_2.method469((byte)-71);
                Model_2.method470(j, 40542);
                Model_2.anIntArrayArray1658 = null;
                Model_2.anIntArrayArray1657 = null;
                if(class23.anInt410 != 128 || class23.anInt411 != 128)
                    Model_2.method478(class23.anInt410, class23.anInt410, anInt1695, class23.anInt411);
                Model_2.method479(64 + class23.anInt413, 850 + class23.anInt414, -30, -50, -30, true);
                Model aModel[] = {
                    Model, Model_2
                };
                Model = new Model(2, -819, true, aModel);
            }
        }
        if(aClass5_1696.aByte68 == 1)
            Model.aBoolean1659 = true;
        return Model;
    }

    public final boolean method449(boolean flag)
    {
        if(!flag)
            aBoolean1694 = !aBoolean1694;
        return aClass5_1696 != null;
    }

    Class30_Sub2_Sub4_Sub1_Sub1()
    {
        aBoolean1694 = false;
        anInt1695 = 9;
    }

    private int anInt1693;
    private boolean aBoolean1694;
    private int anInt1695;
    Class5 aClass5_1696;
}
