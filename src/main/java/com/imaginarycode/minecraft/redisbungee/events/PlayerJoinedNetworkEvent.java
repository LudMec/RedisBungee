/**
 * Copyright © 2013 tuxed <write@imaginarycode.com>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See http://www.wtfpl.net/ for more details.
 */
package com.imaginarycode.minecraft.redisbungee.events;

import lombok.ToString;
import net.md_5.bungee.api.plugin.Event;

import java.util.UUID;

/**
 * This event is sent when a player joins the network. RedisBungee sends the event only when
 * the proxy the player has been connected to is different than the local proxy.
 * <p>
 * This event corresponds to {@link net.md_5.bungee.api.event.PostLoginEvent}, and is fired
 * asynchronously.
 *
 * @since 0.3.4
 */
@ToString
public class PlayerJoinedNetworkEvent extends Event {
    private final UUID uuid;

    public PlayerJoinedNetworkEvent(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }
}
