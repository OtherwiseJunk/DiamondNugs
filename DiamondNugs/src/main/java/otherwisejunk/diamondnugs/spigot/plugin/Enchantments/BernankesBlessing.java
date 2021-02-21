package otherwisejunk.diamondnugs.spigot.plugin.Enchantments;

import java.lang.reflect.Field;

import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.inventory.ItemStack;

public class BernankesBlessing extends Enchantment {

    public BernankesBlessing(NamespacedKey key) {
        super(key);
    }
    @Override
    public String getName() {
        return "Bernanke's Blessing";
    }

    @Override
    public int getMaxLevel() {
        // No Levels
        return 0;
    }

    @Override
    public int getStartLevel() {
        // No Levels
        return 0;
    }

    @Override
    public EnchantmentTarget getItemTarget() {
        // No Targets. Maybe.
        return null;
    }

    @Override
    public boolean isTreasure() {
        // Not Treasure
        return false;
    }

    @Override
    public boolean isCursed() {
        // definitely not cursed.
        return false;
    }

    @Override
    public boolean conflictsWith(Enchantment other) {
        // Conflicts with nothing
        return false;
    }

    @Override
    public boolean canEnchantItem(ItemStack item) {
        // Can't be added to any item
        return false;
    }

    public static void RegisterEnchantment(NamespacedKey enchantmentKey){
        try {
            Field f = Enchantment.class.getDeclaredField("acceptingNew");
            f.setAccessible(true);
            f.set(null, true);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        try {           
            BernankesBlessing blessing = new BernankesBlessing(enchantmentKey);
            Enchantment.registerEnchantment(blessing);
        }
        catch (IllegalArgumentException e){
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
