package net.craftminecraft.thoth.api;

import java.util.concurrent.Future;
import net.craftminecraft.thoth.util.Callback;
import net.craftminecraft.thoth.util.RemoteMethod;
import net.craftminecraft.thoth.util.RemoteVar;

/**
 * Represents a channel, and all it's associated actions.
 *
 */
public interface Communicator {

    /**
     * Pub/Sub API. Publish objects on a certain channel. The objects will be
     * serialized to a byte array and sent to all the servers subscribed to this
     * channel.
     * @param subchannel The subchannel on which to send the objects
     * @param args The objects to sent on this channel.
     */
    void publish(String subchannel, Object... args);

    /**
     *
     * @param callback
     * @param channel
     */
    void subscribe(Callback callback, String channel);

    /**
     * Run a remote method and retrieve the result.
     * @param channel
     * @param method
     * @param args
     * @return
     */
    Future<Object> runMethod(Server server, String method, Object... args);

    void runMethod(Callback callback, Server server, String method, Object... args);

    void registerMethod(RemoteMethod method, String name);

    <T> RemoteVar<T> getVariable(String variable);
}