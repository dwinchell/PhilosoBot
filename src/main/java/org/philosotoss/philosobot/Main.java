package org.philosotoss.philosobot;

import com.github.ocraft.s2client.bot.S2Coordinator;
import com.github.ocraft.s2client.bot.setting.PlayerSettings;
import com.github.ocraft.s2client.protocol.game.Race;

public class Main {
    public static void main(String[] args) {

        PhilosoBot philosoBot = new PhilosoBot();

        S2Coordinator coordinator = S2Coordinator.setup()
                .loadLadderSettings(args)
                .setParticipants(PlayerSettings.participant(Race.PROTOSS, philosoBot))
                .connectToLadder()
                .joinGame();

        while (coordinator.update()) {
            // Do nothing
        }

        coordinator.quit();
    }
}
