package otherwisejunk.diamondnugs.spigot.plugin.Items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import otherwisejunk.diamondnugs.spigot.plugin.Enchantments.BernankesBlessing;

public class DiamondShard {    
    private static String DiamondShardDisplayname = "§aDiamond Shard";
    
    public static void RegisterShardRecipe(NamespacedKey enchantNamespaceKey, NamespacedKey recipeKey){
        ItemStack item = new ItemStack(Material.PRISMARINE_SHARD,9);                
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(DiamondShardDisplayname);

        BernankesBlessing blessing = new BernankesBlessing(enchantNamespaceKey);
        meta.addEnchant(blessing,0,false);
        item.setItemMeta(meta);        

        ShapelessRecipe recipe = new ShapelessRecipe(recipeKey,item);
        
        recipe.addIngredient(Material.DIAMOND);

        Bukkit.addRecipe(recipe);        
    }
    public static void RegisterDiamondRecipe(NamespacedKey enchantNamespaceKey,NamespacedKey recipeKey){
        ItemStack item = new ItemStack(Material.DIAMOND);
        ShapedRecipe recipe = new ShapedRecipe(recipeKey, item);

        ItemStack input = new ItemStack(Material.PRISMARINE_SHARD);                
        ItemMeta meta = input.getItemMeta();

        meta.setDisplayName(DiamondShardDisplayname);

        BernankesBlessing blessing = new BernankesBlessing(enchantNamespaceKey);
        meta.addEnchant(blessing,0,false);
        input.setItemMeta(meta); 

        recipe.shape("sss","sss","sss");
        recipe.setIngredient('s', new RecipeChoice.ExactChoice(input));
        Bukkit.addRecipe(recipe); 
    }
}
