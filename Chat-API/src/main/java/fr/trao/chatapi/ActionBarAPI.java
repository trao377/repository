package fr.trao.chatapi;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.platform.bukkit.BukkitAudiences;

public class ActionBarAPI {
    private final BukkitAudiences audiences = ChatPluginAPI.instance().adventure();

    public static class Builder {
        private Component message;

        public Builder message(String message) {
            this.message = Component.text(message);
            return this;
        }

        public Component build() {
            return message;
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
