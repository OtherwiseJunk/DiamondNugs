package otherwisejunk.diamondnugs.spigot.plugin;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Hello world!
 *
 */
public class DiamondNugs extends JavaPlugin
{
    @Override
    public void onEnable() {
        getLogger().info("Hello, SpigotMC! It's your dear friend, the empty Diamond Nuggets mod!");
    }
    @Override
    public void onDisable() {
        getLogger().info("See you again, SpigotMC! Happy Nugging!");
    }
}
