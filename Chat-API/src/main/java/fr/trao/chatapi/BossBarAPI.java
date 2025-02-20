package fr.trao.chatapi;

import net.kyori.adventure.bossbar.BossBar;
import net.kyori.adventure.bossbar.BossBar.Color;
import net.kyori.adventure.bossbar.BossBar.Overlay;
import net.kyori.adventure.text.Component;

public class BossBarAPI {

    public static class Builder {
        private Component title;
        private float progress;
        private Color color;
        private Overlay overlay;

        public Builder title(String title) {
            this.title = Component.text(title);
            return this;
        }

        public Builder progress(float progress) {
            this.progress = progress;
            return this;
        }

        public Builder color(Color color) {
            this.color = color;
            return this;
        }

        public Builder overlay(Overlay overlay) {
            this.overlay = overlay;
            return this;
        }

        public BossBar build() {
            return BossBar.bossBar(title, progress, color, overlay);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
