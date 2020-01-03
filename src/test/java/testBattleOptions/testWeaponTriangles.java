package testBattleOptions;

import Battle.WeaponTriangle;
import Items.Equippable.MainHand.Anima_Magics.Fire;
import Items.Equippable.MainHand.Anima_Magics.Wind;
import Items.Equippable.MainHand.Axes.TrainingAxe;
import Items.Equippable.MainHand.Light_Magics.Shine;
import Items.Equippable.MainHand.Swords.TrainingSword;
import Items.Equippable.MainHand.Weapon;
import org.junit.Test;

public class testWeaponTriangles {

    @Test
    public void testWeaponTriangle() {
        Weapon trainingSword = new TrainingSword();
        Weapon trainingAxe = new TrainingAxe();

        int[] results = WeaponTriangle.triangleCalculator(trainingSword, trainingAxe);
        assert results[0] == 1;
        assert results[1] == 15;
        assert results[2] == -1;
        assert results[3] == -15;

        results = WeaponTriangle.triangleCalculator(trainingAxe, trainingSword);
        assert results[0] == -1;
        assert results[1] == -15;
        assert results[2] == 1;
        assert results[3] == 15;

        results = WeaponTriangle.triangleCalculator(trainingAxe, trainingAxe);
        assert results[0] == 0;
        assert results[1] == 0;
        assert results[2] == 0;
        assert results[3] == 0;
    }

    @Test
    public void testTrinityOfMagic() {
        Weapon fire = new Fire();
        Weapon shine = new Shine();

        int[] results = WeaponTriangle.triangleCalculator(fire, shine);
        assert results[0] == 1;
        assert results[1] == 15;
        assert results[2] == -1;
        assert results[3] == -15;

        results = WeaponTriangle.triangleCalculator(shine, fire);
        assert results[0] == -1;
        assert results[1] == -15;
        assert results[2] == 1;
        assert results[3] == 15;

        results = WeaponTriangle.triangleCalculator(fire, fire);
        assert results[0] == 0;
        assert results[1] == 0;
        assert results[2] == 0;
        assert results[3] == 0;
    }

    @Test
    public void testAnimaTriangle() {
        Weapon fire = new Fire();
        Weapon wind = new Wind();

        int[] results = WeaponTriangle.triangleCalculator(fire, wind);
        assert results[0] == 1;
        assert results[1] == 15;
        assert results[2] == -1;
        assert results[3] == -15;

        results = WeaponTriangle.triangleCalculator(wind, fire);
        assert results[0] == -1;
        assert results[1] == -15;
        assert results[2] == 1;
        assert results[3] == 15;

        results = WeaponTriangle.triangleCalculator(fire, fire);
        assert results[0] == 0;
        assert results[1] == 0;
        assert results[2] == 0;
        assert results[3] == 0;
    }
}
