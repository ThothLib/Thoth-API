/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.craftminecraft.thoth.api;

import net.craftminecraft.thoth.api.Communicator;
import net.craftminecraft.thoth.api.Server;

/**
 *
 * @author roblabla <robinlambertz.dev@gmail.com>
 */
public abstract class Thoth { 
    
    private static Thoth instance;

    public static void setInstance(Thoth instance) {
        if (instance == null) {
            Thoth.instance = instance;
        }
    }
    
    public static Thoth getInstance() {
        if (instance == null) {
            throw new IllegalStateException("Thoth has not been setup yet.");
        }
        return Thoth.instance;
    }

    public abstract Communicator createCommunicator0(String channel);
    public static Communicator createCommunicator(String channel) {
        return Thoth.getInstance().createCommunicator0(channel);
    }
    
    public abstract Server[] getServers0();
    public static Server[] getServers() {
        return Thoth.getInstance().getServers0();
    }
    
    public abstract Server getMasterServer0();
    public static Server getMasterServer() {
        return Thoth.getInstance().getMasterServer0();
    }
}
