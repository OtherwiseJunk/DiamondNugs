package otherwisejunk.diamondnugs.spigot.plugin;

import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;

import otherwisejunk.diamondnugs.spigot.plugin.Enchantments.BernankesBlessing;
import otherwisejunk.diamondnugs.spigot.plugin.Items.DiamondShard;

public class DiamondNugs extends JavaPlugin
{
    private static String DiamondShardNamespaceKey = "diamond_shards";
    private static String DiamondNamespaceKey = "diamond_from_shards";
    @Override
    public void onEnable() {
        NamespacedKey diamondToShardEnchantmentKey = new NamespacedKey(this, getDescription().getName());
        NamespacedKey shardToDiamondEnchantmentKey = new NamespacedKey(this, getDescription().getName());
        NamespacedKey enchantmentKey = new NamespacedKey(this, getDescription().getName());
        NamespacedKey diamondToSharpRecipeKey = new NamespacedKey(this, DiamondShardNamespaceKey);
        NamespacedKey shardToDiamondRecipeKey = new NamespacedKey(this, DiamondNamespaceKey);

        BernankesBlessing.RegisterEnchantment(enchantmentKey);
        DiamondShard.RegisterShardRecipe(diamondToShardEnchantmentKey, diamondToSharpRecipeKey);
        DiamondShard.RegisterDiamondRecipe(shardToDiamondEnchantmentKey, shardToDiamondRecipeKey);
        getLogger().info("Added Diamond to DiamondShard Recipe");
        //getLogger().info("Added DiamondShards to Diamond Recipe");        
    }
    @Override
    public void onDisable() {
        getLogger().info("Diamond Nugs Disabled!");
    }    
}
