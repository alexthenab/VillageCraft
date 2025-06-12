package alexthenab.villageCraft;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class VillageCraft extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("VillageCraft enabled!");
        addVillagerEggRecipe();
    }

    @Override
    public void onDisable() {
        getLogger().info("VillageCraft disabled.");
    }

    private void addVillagerEggRecipe() {
        ItemStack villagerEgg = new ItemStack(Material.VILLAGER_SPAWN_EGG);
        NamespacedKey key = new NamespacedKey(this, "villager_spawn_egg");

        ShapedRecipe recipe = new ShapedRecipe(key, villagerEgg);
        recipe.shape("DGD", "GEG", "DGD");
        recipe.setIngredient('D', Material.DIAMOND);
        recipe.setIngredient('G', Material.GOLD_INGOT);
        recipe.setIngredient('E', Material.EMERALD);

        Bukkit.addRecipe(recipe);
    }
}
