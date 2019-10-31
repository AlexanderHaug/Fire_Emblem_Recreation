package Items.Equippable;

import Items.Equippable.MainHand.Anima_Magics.*;
import Items.Equippable.MainHand.Axes.*;
import Items.Equippable.MainHand.Bows.*;
import Items.Equippable.MainHand.Daggers.*;
import Items.Equippable.MainHand.Dark_Magics.*;
import Items.Equippable.MainHand.Gauntlets.*;
import Items.Equippable.MainHand.Lances.*;
import Items.Equippable.MainHand.Light_Magics.*;
import Items.Equippable.MainHand.Swords.*;
import Items.Equippable.MainHand.Weapon;

public class WeaponGenerator {

    public static Weapon createWeapon(String weaponName) {
        switch (weaponName) {
            case "Training Sword":
                return new TrainingSword();
            case "Iron Sword":
                return new IronSword();
            case "Steel Sword":
                return new SteelSword();
            case "Silver Sword":
                return new SilverSword();
            case "Brave Sword":
                return new BraveSword();
            case "Killing Edge":
                return new KillingEdge();
            case "Armorslayer":
                return new Armorslayer();
            case "Training Axe":
                return new TrainingAxe();
            case "Iron Axe":
                return new IronAxe();
            case "Steel Axe":
                return new SteelAxe();
            case "Silver Axe":
                return new SilverAxe();
            case "Brave Axe":
                return new BraveAxe();
            case "Killer Axe":
                return new KillerAxe();
            case "Hammer":
                return new Hammer();
            case "Training Lance":
                return new TrainingLance();
            case "Iron Lance":
                return new IronLance();
            case "Steel Lance":
                return new SteelLance();
            case "Silver Lance":
                return new SilverLance();
            case "Brave Lance":
                return new BraveLance();
            case "Killer Lance":
                return new KillerLance();
            case "Heavy Spear":
                return new HeavySpear();
            case "Training Gauntlets":
                return new TrainingGauntlets();
            case "Iron Gauntlets":
                return new IronGauntlets();
            case "Steel Gauntlets":
                return new SteelGauntlets();
            case "Silver Gauntlets":
                return new SilverGauntlets();
            case "Aura Knuckles":
                return new AuraKnuckles();
            case "Killer Knuckles":
                return new KillerKnuckles();
            case "Dragon Claws":
                return new DragonClaws();
            case "Training Dagger":
                return new TrainingDagger();
            case "Training Bow":
                return new TrainingBow();
            case "Iron Bow":
                return new IronBow();
            case "Fire":
                return new Fire();
            case "Elfire":
                return new Elfire();
            case "Bolganone":
                return new Bolganone();
            case "Ragnarok":
                return new Ragnarok();
            case "Wind":
                return new Wind();
            case "Elwind":
                return new Elwind();
            case "Cutting Gale":
                return new CuttingGale();
            case "Excalibur":
                return new Excalibur();
            case "Thunder":
                return new Thunder();
            case "Elthunder":
                return new Elthunder();
            case "Thoron":
                return new Thoron();
            case "Bolting":
                return new Bolting();
            case "Shine":
                return new Shine();
            case "Seraphim":
                return new Seraphim();
            case "Divine":
                return new Divine();
            case "Aura":
                return new Aura();
            case "Flux":
                return new Flux();
            case "Mire":
                return new Mire();
            default:
                return null;
        }
    }
}
