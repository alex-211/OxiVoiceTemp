package dev.starless.maggiordomo.commands.types;

import dev.starless.maggiordomo.commands.Command;
import dev.starless.maggiordomo.data.Settings;
import dev.starless.maggiordomo.data.user.VC;
import net.dv8tion.jda.api.entities.emoji.Emoji;
import net.dv8tion.jda.api.events.interaction.ModalInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent;

public interface Interaction extends Command {

    default VC execute(VC vc, Settings settings, String id, ModalInteractionEvent e) {
        return vc;
    }

    default VC execute(VC vc, Settings settings, String id, ButtonInteractionEvent e) {
        return vc;
    }

    default VC execute(VC vc, Settings settings, String id, StringSelectInteractionEvent e) {
        return vc;
    }

    default Emoji emoji() {
        return Emoji.fromUnicode("U+2753");
    }

    // Timeout in secondi
    default long timeout() {
        return -1L;
    }
}
