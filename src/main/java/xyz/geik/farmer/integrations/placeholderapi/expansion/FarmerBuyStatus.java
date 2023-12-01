package xyz.geik.farmer.integrations.placeholderapi.expansion;

import org.bukkit.entity.Player;
import xyz.geik.farmer.Main;
import xyz.geik.farmer.integrations.placeholderapi.PlaceholderExecutor;

/**
 * FarmerBuyStatus expansion class
 *
 * @author amownyy
 * @since v6-b003
 */
public class FarmerBuyStatus extends PlaceholderExecutor {

    /**
     * Constructor for the FarmerBuyStatus placeholder
     */
    public FarmerBuyStatus() {
        super("getFarmerBuyStatus");
    }

    /**
     * Executes the FarmerBuyStatus placeholder.
     * @param player
     * @param string
     * @return true or false
     */
    public String execute(Player player, String string) {
        if (Main.getConfigFile().getSettings().isBuyFarmer()) {
            return "true";
        }
        return "false";
    }
}