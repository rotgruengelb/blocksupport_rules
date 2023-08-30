package net.rotgruengelb.blocksupport_rules;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlockSupportRules implements ModInitializer {

    public static final String MOD_ID = "blocksupport_rules";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    // ##### GameRules #####
    public static final GameRules.Key<GameRules.BooleanRule>
            FLOATING_LANTERN_BLOCKS = register("floatingLanternBlocks", GameRules.Category.UPDATES, false),
            FLOATING_SIGN_BLOCKS = register("floatingSignBlocks", GameRules.Category.UPDATES, false),
            FLOATING_WALL_SIGN_BLOCKS = register("floatingWallSignBlocks", GameRules.Category.UPDATES, false);

    // ##### Globals #####
    public static ThreadLocal<World> world = new ThreadLocal<>();

    private static GameRules.Key<GameRules.BooleanRule> register(String name, GameRules.Category category, Boolean defaultValue) {
        return GameRuleRegistry.register(name, category, GameRuleFactory.createBooleanRule(defaultValue));
    }

    @Override
    public void onInitialize() {

    }
}
